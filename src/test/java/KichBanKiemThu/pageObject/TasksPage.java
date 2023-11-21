package KichBanKiemThu.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class TasksPage {
    private static WebElement element = null;
    //Tasks
    public static WebElement text_Tasks(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//span[text()='Tasks']"));
        return element;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //Click Add Tasks
    public static WebElement click_AddTasks(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//a[text()=\" Add task\"]"));
        return element;
    }
    //Input Title
    public static WebElement input_Title(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//input[@id='title']"));
        return element;
    }
    //Click Project
    public static WebElement click_Project(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//label[text()='Project']/following::span[text()='Project']"));
        return element;
    }
    //Click Project2
    public static WebElement click_Project2(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//div[@id='select2-result-label-33']"));
        return element;
    }
    //Click Save
    public static WebElement button_Save(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//button[@type='submit']"));
        return element;
    }


}
