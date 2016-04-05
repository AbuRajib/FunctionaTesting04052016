package HomePage;

import Base.Api.Base;
import org.testng.annotations.Test;

/**
 * Created by HP on 4/4/2016.
 */
@Test
public class GetaQuote extends Base {

    public void quote() throws InterruptedException {

        clickByXpath(".//*[@id='state1-mmquote']/option[34]");
        sleepFor(2);

        clickByXpath(".//*[@id='month-mmquote']/option[10]");
        sleepFor(2);

        clickByXpath(".//*[@id='day-mmquote']/option[9]");
        sleepFor(2);

        clickByXpath(".//*[@id='year-mmquote']/option[14]");
        sleepFor(2);

        clickByXpath(".//*[@id='gender-mmquote']/option[2]");
        sleepFor(2);

        clickByXpath(".//*[@id='coverage-mmquote']/option[5]");
        sleepFor(2);

        clickByXpath("//*[@id='term-mmquote']/option[2]");
        sleepFor(2);

        clickByXpath(".//*[@id='tobacco-mmquote']/option[3]");
        sleepFor(2);

        clickByXpath(".//*[@id='health-mmquote']/option[4]");
        sleepFor(2);

        clickByXpath(".//*[@id='submitBtnImage']");
        sleepFor(2);


        //Submit username, email & phone

        typeByCss("#fnm-mmquote","Abu");
        sleepFor(1);
        typeByCss("#lnm-mmquote","Rajib");
        sleepFor(1);
        typeByCss("#eml-mmquote","rajue794@gmail.com");
        sleepFor(1);
        typeByCss("#ph-mmquote","646-546-6622");
        sleepFor(1);

        navigateBack();

    }
}
