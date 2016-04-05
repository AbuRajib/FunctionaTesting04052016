package HomePage;

import Base.Api.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by HP on 4/4/2016.
 */
@Test
public class MenuListCheck extends Base{

    public void checkMenu() throws InterruptedException {
        List<String> element=getListOfTextByXpath(".//*[@id='hdMenuDiv']/ul/li");
        displayText(element);

        for(int i=1;i<element.size()+1;i++){
            clickByXpath(".//*[@id='hdMenuDiv']/ul/li["+i+"]/a");
            sleepFor(2);

            if(i==2){
                List<String> insurance=getListOfTextByXpath(".//*[@id='hdSecondaryNav']/ul/li");
                for(int j=1;j<insurance.size()+1;j++){
                    clickByXpath(".//*[@id='hdSecondaryNav']/ul/li["+j+"]/a");
                    sleepFor(1);
                }

            }


            if(i==3){
                List<String> benefits=getListOfTextByXpath(".//*[@id='hdSecondaryNav']/ul/li");
                for(int k=1;k<benefits.size()+1;k++){
                    clickByXpath(".//*[@id='hdSecondaryNav']/ul/li["+k+"]/a");
                    sleepFor(1);
                }

            }


            if(i==4){
                List<String> investments=getListOfTextByXpath(".//*[@id='hdSecondaryNav']/ul/li");
                for(int l=1;l<investments.size()+1;l++){
                    clickByXpath(".//*[@id='hdSecondaryNav']/ul/li["+l+"]/a");
                    sleepFor(1);
                }

            }


            if(i==5){
                List<String> planning=getListOfTextByXpath(".//*[@id='hdSecondaryNav']/ul/li");
                for(int m=1;m<planning.size()+1;m++){
                    clickByXpath(".//*[@id='hdSecondaryNav']/ul/li["+m+"]/a");
                    sleepFor(1);
                }

            }

            if(i==6){
                List<String> retirement=getListOfTextByXpath(".//*[@id='hdSecondaryNav']/ul/li");
                for(int n=1;n<retirement.size()+1;n++){
                    clickByXpath(".//*[@id='hdSecondaryNav']/ul/li["+n+"]/a");
                    sleepFor(1);
                }

            }


            if(i==7){
                List<String> life_advice=getListOfTextByXpath(".//*[@id='hdSecondaryNav']/ul/li");
                for(int o=1;o<life_advice.size()+1;o++){
                    clickByXpath(".//*[@id='hdSecondaryNav']/ul/li["+o+"]/a");
                    sleepFor(1);
                }

            }

        }

    }

}
