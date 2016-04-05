package Base.Api;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by HP on 4/3/2016.
 */
public class Base {

    public WebDriver driver = null;
    @Parameters({"SauceLabs","userName","Key","browserName","browserVersion","os","url"})
    @BeforeMethod
    public void setUp(Boolean SauceLabs,String userName,String Key,String browserName,
                      String browserVersion,String os,String url) throws IOException{

        if(SauceLabs==true){
            setUpCloudEnvironment(userName,Key,browserName,browserVersion,os,url);
        }
        else{
            setUpLocalEnvironment(browserName,browserVersion,url);
        }
    }


    public void setUpCloudEnvironment(String userName,String Key,String browserName,
                                      String browserVersion,String os,String url) throws IOException {

        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setBrowserName(browserName);
        cap.setCapability("version", browserVersion);
        cap.setCapability("platform",os);
        this.driver=new RemoteWebDriver(new URL("http://"+userName+":"+Key+"@ondemand.saucelabs.com:80/wd/hub"),cap);

        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    public void setUpLocalEnvironment(String browserName, String browserVersion,String url){

        if(browserName.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
        }
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","/Common/Driver/chromedriver.exe");
            driver=new ChromeDriver();
        }
        if(browserName.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","C:\\Users\\HP\\workspace\\Functional-Testing04032016\\Common\\Driver\\IEDriverServer.exe");
            driver=new InternetExplorerDriver();
        }
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
        driver.quit();
    }

    public void clickByCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void typeByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    public void typeAndEnterByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).clear();
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    public void typeAndEnterByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).clear();
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }

    public String getTextByCss(String locator){
        String text=driver.findElement(By.cssSelector(locator)).getText();
        return text;
    }

    public String getTextByXpath(String locator){
        String text=driver.findElement(By.xpath(locator)).getText();
        return text;
    }

    public void getTextClick(String locator){
        driver.findElement(By.linkText(locator)).click();
    }

    public List<String> getListOfTextByCss(String locator) {
        List<WebElement> element = driver.findElements(By.cssSelector(locator));
        ArrayList<String> list = new ArrayList<String>();
        for (WebElement st : element) {
            list.add(st.getText());
        }
        return list;
    }

    public List<String> getListOfTextByXpath(String locator) {
        List<WebElement> element = driver.findElements(By.xpath(locator));
        ArrayList<String> list = new ArrayList<String>();
        for (WebElement st : element) {
            list.add(st.getText());
        }
        return list;
    }

    public void displayText(List<String> element) {
        for (String st : element) {
            System.out.println(st);
        }
    }

    public WebElement elementsByXpath(String locator) {
        WebElement elements = driver.findElement(By.xpath("locator"));
        return elements;
    }

    public List<WebElement> webElementsByCss(String locator) {
        List<WebElement> elements = driver.findElements(By.cssSelector("locator"));
        return elements;
    }

    public List<WebElement> webElementsByXpath(String locator) {
        List<WebElement> elements = driver.findElements(By.xpath("locator"));
        return elements;
    }

 /*   public WebElement webElementsByXpathForSingle(String locator) {
        WebElement element = driver.findElement(By.xpath("locator"));
        return element;
    }*/

    public void sleepFor(int sec) throws InterruptedException {
        Thread.sleep(sec*1000);
    }

    public void OkAccept(){
        driver.switchTo().alert().accept();
    }

    public void OkCancel(){
        driver.switchTo().alert().dismiss();
    }

    public void takeScreenShot(String locator) throws IOException {
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File(locator));
    }

    public void mouseHover(List<WebElement> element) throws InterruptedException {
        Actions action=new Actions(driver);
        for(WebElement st:element){
            action.moveToElement(st).build().perform();
            sleepFor(2);
        }
    }

    public void navigateBack(){
        driver.navigate().back();
    }
}