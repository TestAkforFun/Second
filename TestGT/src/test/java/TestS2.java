import Base.TestBase;
import helpers.Listner;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.FormationChangesRequestPage;
import pages.LoginPage;
import pages.MainPage;

/**
 * Created by Администратор on 19.07.2015.
 */
@Listeners(Listner.class)
public class TestS2 extends TestBase{

    @Test
    public void testSuite2 () throws InterruptedException {
        LoginPage.inputLogin(driver, user);
        LoginPage.inputPassword(driver, password);
        LoginPage.clickEnter(driver);
        MainPage.chooseTestGroup(driver);
        MainPage.createDirectory(driver);
        MainPage.selectNewType(driver);
        MainPage.inputNewType(driver,testNewType);
        MainPage.pushSaveButton(driver);
        MainPage.goToFormationChangesRequestPage(driver);
        Thread.sleep(1000);
        FormationChangesRequestPage.checkAddedDirectory(driver, testNewType);
        Thread.sleep(1000);
        FormationChangesRequestPage.editAddedDirectory(driver,testNewType);
        Thread.sleep(1000);
        FormationChangesRequestPage.checkFieldsOnCreationDirectoryForm(driver,testNewType);

    }

}
