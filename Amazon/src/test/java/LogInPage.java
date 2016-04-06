import Base.Api.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;
/**
 * Created by HP on 4/4/2016.
 */
public class LogInPage extends Base{

    @Test
    public void logInCheck() throws InterruptedException {
        clickByXpath(".//*[@id='nav-link-yourAccount']/span[1]");
        sleepFor(2);

        typeByXpath(".//*[@id='ap_email']","rajue794@gmail.com");
        typeAndEnterByXpath(".//*[@id='ap_password']","monowara0078");
        sleepFor(2);

        List<WebElement> list=webElementsByXpath(".//*[@id='nav-link-yourAccount']/span[2]");
        mouseOver(list);
        sleepFor(1);
        clickByXpath(".//*[@id='nav-item-signout']/span");
        sleepFor(2);

    }
}
