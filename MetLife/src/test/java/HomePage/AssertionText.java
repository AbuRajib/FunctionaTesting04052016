package HomePage;

import Base.Api.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by HP on 4/4/2016.
 */
@Test
public class AssertionText extends Base{

    public void menuList(){
       //String PageTitle=driver.getCurrentUrl();






        String expected="Term Life Insurance";
        String actual=getTextByCss("#grlCntInrContainer > div.hp-leftcol > div > p.heroHeading");
        System.out.println(actual);

        // Test Assertion
        try{
            Assert.assertEquals(actual,expected);
            System.out.println("PASSED");
        }catch(Exception e){
            System.out.println("FAILED");
        }



    }

}
