package pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;


/**
 * Created by Администратор on 18.07.2015.
 */
public class FormationChangesRequestPage extends PageBase{

    private static final By TABLE = By.tagName("table");
    private static final By BUTTON_EDIT = By.xpath("//button[text()='Редактирование']");
    private static final By SHORT_NAME = By.cssSelector("input[data-reactid$='.0.1.0.0.2.1']");
    private static final By FULL_NAME = By.cssSelector("input[data-reactid$='.0.1.0.0.3.1']");
    private static final By KEY = By.cssSelector("input[data-reactid$='.0.1.0.0.1.1']");
    private static final By FIELD_NEW_TYPE = By.cssSelector("input[data-reactid$='.0.1.0.1.0.$=1$main.0.1.0.1.0.0.0.1.1']");
   /*public WebTable (WebElement webTable){
        set_webTable(webTable);
    }

    public static WebElement get_webTable(WebDriver driver){
        driver.findElement(By.tagName("table"));
        return _webTable;
    }

    public int getRowCount(){
        List<WebElement> tableRows = _webTable.findElements(By.tagName("tr"));
        return tableRows.size();
    }

    public int getColumnCount(){
        List<WebElement> tableRows = _webTable.findElements(By.tagName("tr"));
        WebElement headerRow = tableRows.get(1);
        List<WebElement> tableCols = headerRow.findElements(By.tagName("td"));
        return tableCols.size();
    }*/

    public static void editAddedGroup (WebDriver driver,String name ) throws InterruptedException {
        String ss= "Создание новой группы \""+name+"\"";
        WebElement webTable = driver.findElement(TABLE);
        List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
        Thread.sleep(1000);
        WebElement headerRow = tableRows.get(1);
        Thread.sleep(1000);
        List<WebElement> tableCols = headerRow.findElements(By.tagName("td"));
        Thread.sleep(1000);
        assertTrue(tableCols.get(1).getText().toString().equals(ss));
        Thread.sleep(1000);
        tableCols.get(4).findElement(BUTTON_EDIT).click();
    }

    public static void editAddedDirectory (WebDriver driver,String name ) throws InterruptedException {
        String ss= "Создание нового справочника \""+name+"\"";
        WebElement webTable = driver.findElement(TABLE);
        List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
        Thread.sleep(1000);
        WebElement headerRow = tableRows.get(1);
        Thread.sleep(1000);
        List<WebElement> tableCols = headerRow.findElements(By.tagName("td"));
        Thread.sleep(1000);
        assertTrue(tableCols.get(1).getText().toString().equals(ss));
        Thread.sleep(1000);
        tableCols.get(4).findElement(BUTTON_EDIT).click();
    }

    public static void checkFieldsOnCreationGroupForm(WebDriver driver,String shName,String fullName ) throws InterruptedException {
        assertTrue(driver.findElement(SHORT_NAME).getAttribute("value").equals(shName));
        assertTrue(driver.findElement(FULL_NAME).getAttribute("value").equals(fullName));
        assertTrue(!driver.findElement(KEY).getAttribute("value").toString().isEmpty());
    }

    public static void checkFieldsOnCreationDirectoryForm(WebDriver driver,String type ) {
        assertTrue(driver.findElement(FIELD_NEW_TYPE).getAttribute("value").equals(type+"d"));
    }

    public static void checkAddedGroup(WebDriver driver, String s) throws InterruptedException {
        String ss= "Создание новой группы \""+s+"\"";
        WebElement webTable = driver.findElement(TABLE);
        List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
        Thread.sleep(1000);
        WebElement headerRow = tableRows.get(1);
        Thread.sleep(1000);
        List<WebElement> tableCols = headerRow.findElements(By.tagName("td"));
        Thread.sleep(1000);
        assertTrue(tableCols.get(1).getText().toString().equals(ss));
    }

    public static void checkAddedDirectory(WebDriver driver, String s) throws InterruptedException {
        String ss= "Создание нового справочника \""+s+"\"";
        WebElement webTable = driver.findElement(TABLE);
        List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
        Thread.sleep(1000);
        WebElement headerRow = tableRows.get(1);
        Thread.sleep(1000);
        List<WebElement> tableCols = headerRow.findElements(By.tagName("td"));
        Thread.sleep(1000);
        assertTrue(tableCols.get(1).getText().toString().equals(ss));
    }
}
