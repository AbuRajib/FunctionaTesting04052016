import Base.Api.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
/**
 * Created by HP on 4/5/2016.
 */
public class PictureCount extends Base {

    @Test
    public void countPicture(){
        //Count Web Element in  a drop down menu
/*        List<String> list=getListOfTextByCss("#searchDropdownBox option");
        displayText(list);
        //int listOfSize=0;
        System.out.println("--------------------------------");
        System.out.println("The Total Count is: "+list.size());*/




        typeAndEnterByXpath(".//*[@id='twotabsearchtextbox']","books");



        WebElement ImageFile = driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[1]/div/div/a/img"));

        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent)
        {
            System.out.println("Image not displayed.");
        }
        else
        {
            System.out.println("Image displayed.");
        }





    }

}
