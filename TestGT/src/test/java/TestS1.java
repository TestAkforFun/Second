import Base.TestBase;
import helpers.Listner;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.FormationChangesRequestPage;
import pages.LoginPage;
import pages.MainPage;

/**
 * Created by Администратор on 18.07.2015.
 */
@Listeners(Listner.class)
public class TestS1 extends TestBase{

    @Test
    public void testSuite1() throws InterruptedException {
        LoginPage.inputLogin(driver, user);
        LoginPage.inputPassword(driver, password);
        LoginPage.clickEnter(driver);
        MainPage.goToCreationGroupForm(driver);
        MainPage.chooseReconciliationProcess(driver, MainPage.ReconciliationProcess.Etl_10);
        MainPage.inputShortName(driver, testShortName);
        MainPage.inputFullName(driver, testFullName);
        MainPage.pushSaveButton(driver);
        MainPage.goToFormationChangesRequestPage(driver);
        Thread.sleep(1000);
        FormationChangesRequestPage.checkAddedGroup(driver, testShortName);
        Thread.sleep(1000);
        FormationChangesRequestPage.editAddedGroup(driver, testShortName);
        Thread.sleep(1000);
        FormationChangesRequestPage.checkFieldsOnCreationGroupForm(driver,testShortName,testFullName);
    }



}
