package Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Администратор on 18.07.2015.
 */
public class TestBase {

    public static WebDriver getDriver() {
        return driver;
    }

    protected static WebDriver driver;

    protected static final String user = "user";
    protected static final String password = "password";
    protected static final String testShortName = "Тестовая группа 1";
    protected static final String testFullName = "Тестовая группа Один";
    protected static final String testNewType = "Тестовый справочник 1";


    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://gis-tek.gost-group.com/");

    }



    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @AfterClass
    public void clearCookies(){
        driver.manage().deleteAllCookies();
    }

    /*@AfterMethod public void takeScreenShotOnFailure(ITestResult testResult) throws IOException, InterruptedException {
        if (testResult.getStatus() == ITestResult.FAILURE){
            Thread.sleep(500);
            long curTime = System.currentTimeMillis();
            String curStringDate = new SimpleDateFormat("dd.").format(curTime);
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("./src/main/java/screenShots/testScreenShot" + curStringDate + System.currentTimeMillis() + ".jpg"));
        }
    }*/

}
