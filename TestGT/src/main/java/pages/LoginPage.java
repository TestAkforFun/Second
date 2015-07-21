package pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Администратор on 18.07.2015.
 */
public class LoginPage extends PageBase {
    private static final By LOGIN = By.id("username");
    private static final By PASSWORD = By.id("password");
    private static final By BUTTON_ENTER = By.id("login");

    public static void inputLogin (WebDriver driver, String s){
        driver.findElement(LOGIN).sendKeys(s);
    }

    public static void inputPassword (WebDriver driver, String s){
        driver.findElement(PASSWORD).sendKeys(s);
    }

    public static void clickEnter (WebDriver driver){
        driver.findElement(BUTTON_ENTER).click();
    }
}
