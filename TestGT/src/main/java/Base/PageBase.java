package Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Администратор on 18.07.2015.
 */
public class PageBase {


    protected static void WaitUntilJQuery (WebDriver driver,int n){
        Boolean element = (new WebDriverWait(driver,n)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                JavascriptExecutor js = (JavascriptExecutor) d;
                return (Boolean) js.executeScript("return jQuery.active ==0");
            }
        });
    }
}
