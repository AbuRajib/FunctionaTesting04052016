package HomePage;

import Base.Api.Base;
import org.testng.annotations.Test;
import java.util.List;

/**
 * Created by HP on 4/4/2016.
 */
public class FormDownload extends Base{

    @Test
    public void download() throws InterruptedException {
        clickByXpath(".//*[@id='firstList']/ul/li[2]/a");
        sleepFor(2);

        clickByXpath(".//*[@id='spanGlobalQuestionContainer1']/a");
        sleepFor(2);
        clickByXpath(".//*[@id='spanGlobalQuestionContainer1']/a");
        sleepFor(3);


        clickByXpath(".//*[@id='spanGlobalQuestionContainer2']/a");
        sleepFor(2);
        clickByXpath(".//*[@id='spanGlobalQuestionContainer2']/a");
        sleepFor(3);


        clickByXpath(".//*[@id='spanGlobalQuestionContainer3']/a");
        sleepFor(2);
        clickByXpath(".//*[@id='spanGlobalQuestionContainer3']/a");
        sleepFor(3);


        clickByXpath(".//*[@id='spanGlobalQuestionContainer4']/a");
        sleepFor(2);
        clickByXpath(".//*[@id='spanGlobalQuestionContainer4']/a");
        sleepFor(3);


        clickByXpath(".//*[@id='spanGlobalQuestionContainer5']/a");
        sleepFor(2);
        clickByXpath(".//*[@id='spanGlobalQuestionContainer5']/a");
        sleepFor(3);


        clickByXpath(".//*[@id='spanGlobalQuestionContainer6']/a");
        sleepFor(2);
        clickByXpath(".//*[@id='spanGlobalQuestionContainer6']/a");
        sleepFor(3);


        clickByXpath(".//*[@id='spanGlobalQuestionContainer7']/a");
        sleepFor(2);
        clickByXpath(".//*[@id='spanGlobalQuestionContainer7']/a");
        sleepFor(3);
    }
}
