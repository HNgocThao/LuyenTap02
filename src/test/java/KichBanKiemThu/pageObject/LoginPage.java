package KichBanKiemThu.pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class LoginPage {
    private static WebElement element = null;

    //click id
    public static WebElement click_Id(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//div[@class='box p10 clickable fill-login b-b' and position()=2]"));
        return element;
    }
    // Buttons
    public static WebElement btn_Login(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//button[@type='submit']"));
        return element;
    }
}
