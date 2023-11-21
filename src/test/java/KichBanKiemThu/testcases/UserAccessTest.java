package KichBanKiemThu.testcases;

import KichBanKiemThu.commons.BaseSetup;
import KichBanKiemThu.commons.TestListener;
import KichBanKiemThu.pageObject.FindTasks;
import KichBanKiemThu.pageObject.LoginPage;
import KichBanKiemThu.pageObject.TasksPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class UserAccessTest {
    private static WebDriver driver;
//    @Parameters({ "browserType", "appURL" })
    @BeforeTest
    public void beforeTest() {
        driver = new BaseSetup().setupDriver("browserType");
    }
//1. Truy cập https://rise.fairsketch.com
    @Test
    public void aLoad_Page() {
        driver.get("https://rise.fairsketch.com");

    }
//2. Login tài khoản: admin@demo.com / riseDemo
    @Test
    public void bLogin_Page() {
        LoginPage.click_Id(driver).click();
        LoginPage.btn_Login(driver).click();
        Assert.assertTrue(TasksPage.text_Tasks(driver).isDisplayed());
    }
//3. Click [Task] tại left menu
    @Test
    public void cLoad_Tasks() {
        TasksPage.text_Tasks(driver).click();
    }
//4. Click [Add a task] và nhập đầy đủ thông tin task > Save
    String keys = "Phong Vân";
    @Test
    public void dAdd_Tasks() {
        TasksPage.click_AddTasks(driver).click();
        TasksPage.input_Title(driver).sendKeys(keys);
        TasksPage.click_Project(driver).click();
        TasksPage.click_Project2(driver).click();
        TasksPage.button_Save(driver).click();
        Assert.assertTrue(FindTasks.click_All_Task(driver).isDisplayed());
    }
//5. Tìm kiếm task vừa tạo thông qua tính năng search.
    @Test
    public void eFind_Tasks() throws InterruptedException{
        Thread.sleep(3000);
        FindTasks.input_Search(driver).sendKeys(keys);
        Assert.assertTrue(FindTasks.click_Title(driver).isDisplayed());
    }
//6. Add 2 comment and change status from Todo -> In progress.
    @Test
    public void fAdd_Comment() {
        FindTasks.click_Title(driver).click();
        FindTasks.click_Textarea(driver).click();
        //hiện
        FindTasks.input_Textarea(driver).sendKeys("No Problem", Keys.ENTER, "Secondary");
        FindTasks.button_Post(driver).click();
        FindTasks.click_Todo(driver).click();
        FindTasks.click_Todo2(driver).click();
        FindTasks.click_Progress(driver).click();
        FindTasks.button_Close(driver).click();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
