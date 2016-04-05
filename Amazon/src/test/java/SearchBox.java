import Base.Api.Base;
import org.testng.annotations.Test;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by HP on 4/4/2016.
 */
public class SearchBox extends Base{

    @Test
    public void SerachBoxCheck() throws InterruptedException {

        List<String> text=getListOfTextByCss("#searchDropdownBox option");
        displayText(text);

        for(String st:text){
            typeAndEnterByCss("#twotabsearchtextbox",st);
            sleepFor(2);
        }

    }
}
