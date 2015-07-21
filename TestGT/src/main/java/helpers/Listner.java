package helpers;

import Base.TestBase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import ru.yandex.qatools.allure.annotations.Attachment;

/**
 * Created by Дмитрий on 20.07.2015.
 */
public class Listner extends TestListenerAdapter {

    public void onTestFailure(ITestResult result) {
        super.onTestFailure(result);
        failureScreenShot();
    }

    @Attachment
    public static byte[] failureScreenShot() {
        return ((TakesScreenshot) TestBase.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
