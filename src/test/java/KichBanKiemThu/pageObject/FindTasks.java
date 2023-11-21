package KichBanKiemThu.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class FindTasks {
    private static WebElement element = null;

    //Click ALl Tasks
    public static WebElement click_All_Task(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//button[@data-id='steanlmnrd']"));
        return element;
    }
    //Input Search
    public static WebElement input_Search(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//input[@type='search']"));
        return element;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //Click Title
    public static WebElement click_Title(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//a[text()='Phong Vân']"));
        return element;
    }
    //Click Textarea
    public static WebElement click_Textarea(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//textarea"));
        return element;
    }
    //Input Textarea
    public static WebElement input_Textarea(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//div[@style='height: 150px;']"));
        return element;
    }
    //Click Button
    public static WebElement button_Post(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//button[text()=\" Post Comment\"]"));
        return element;
    }
    //Click Todos
    public static WebElement click_Todo(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//a[@class=\"white-link\"]"));
        return element;
    }
    //Click Todo2
    public static WebElement click_Todo2(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//span[text()='To do']"));
        return element;
    }
    //Click Progress
    public static WebElement click_Progress(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//div[text()=\"In progress\"]"));
        return element;
    }
    //Click close
    public static WebElement button_Close(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//button[text()=\" Close\"]"));
        return element;
    }
}
