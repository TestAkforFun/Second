package pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Администратор on 18.07.2015.
 */
public class MainPage extends PageBase{

    public static enum ReconciliationProcess{
        Etl_10,
        Etl_1;
    }

    private static final By BUTTON_CREATE_GROUP = By.xpath("//button[text()='Создать группу']");
    private static final By SHORT_NAME = By.cssSelector("input[data-reactid='.1.0.1.0.0.2.1']");
    private static final By FULL_NAME = By.cssSelector("input[data-reactid='.1.0.1.0.0.3.1']");
    private static final By BUTTON_SAVE = By.xpath("//button[text()='Сохранить']");
    private static final By BUTTON_EDIT_GROUP = By.xpath("//button[text()='Редактировать группу']");
    private static final By FORMATION_CHANGES_REQUEST = By.xpath("//a[text()='Формирование запроса изменений']");
    private static final By RECONCILIATION_PROCESS = By.id("processDefenitionId");
    private static final By TEST_GROUP = By.cssSelector("a[data-reactid='.0.1.0.2.0.0.0.0.1.2.$testovaya.0.1']");
    private static final By CREATE_DIRECTORY = By.cssSelector("button[data-reactid='.0.1.0.2.0.1.0.2.0.0.0.2']");
    private static final By NEW_TYPE = By.xpath("//div[text()='Новый тип']");
    private static final By FIELD_NEW_TYPE = By.cssSelector("input[data-reactid='.3.0.1.0.1.0.$=1$main.0.1.0.1.0.0.0.1.1']");


    public static void goToCreationGroupForm (WebDriver driver){
        driver.findElement(BUTTON_CREATE_GROUP).click();
    }

    public static void inputShortName(WebDriver driver,String s){
        driver.findElement(SHORT_NAME).sendKeys(s);
    }

    public static void inputFullName (WebDriver driver,String s){
        driver.findElement(FULL_NAME).sendKeys(s);
    }

    public static void pushSaveButton (WebDriver driver){
        driver.findElement(BUTTON_SAVE).click();
    }

    public static void goToFormationChangesRequestPage (WebDriver driver){
        driver.findElement(FORMATION_CHANGES_REQUEST).click();
    }

    public static void chooseTestGroup (WebDriver driver){
        driver.findElement(TEST_GROUP).click();
    }

    public static void createDirectory (WebDriver driver){
        driver.findElement(CREATE_DIRECTORY).click();
    }

    public static void selectNewType (WebDriver driver){
        driver.findElement(NEW_TYPE).click();
    }

    public static void inputNewType (WebDriver driver, String s){
        driver.findElement(FIELD_NEW_TYPE).clear();
        driver.findElement(FIELD_NEW_TYPE).sendKeys(s);
    }


    public static void chooseReconciliationProcess (WebDriver driver,ReconciliationProcess p){
        Select select= new Select(driver.findElement(RECONCILIATION_PROCESS));
        switch (p){
                case Etl_10:select.selectByVisibleText("Подтверждение одним менеджером (ETL) - 10");
                    break;
                case Etl_1:select.selectByVisibleText("Подтверждение одним менеджером (ETL) - 1");

            }

        }

}
