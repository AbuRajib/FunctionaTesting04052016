import Base.Api.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
/**
 * Created by HP on 4/4/2016.
 */
public class MouseHover extends Base{

    @Test
    public void mouseHover() throws InterruptedException, IOException {
        List<String> st=getListOfTextByCss("#nav-shop #nav-link-shopall .nav-line-2");
        displayText(st);

        //Capture Screen shot

        //takeScreenShot("E:\\PeopleNtech\\ZZ.New Season\\image.png");




    }

}
