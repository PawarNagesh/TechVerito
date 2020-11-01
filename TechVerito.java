package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TechVerito{
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    @BeforeClass
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome2\\chromedriver.exe");
        driver = new ChromeDriver();
        actions=new Actions(driver);
        driver.get("https://nagesh-pawar.herokuapp.com/admin");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        wait = new WebDriverWait(driver, 30);
    }
    //Login
    @Test(enabled = true, priority = 0)
    public void Login() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("admin_user_email"))).sendKeys("admin@example.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("admin_user_password"))).sendKeys("password");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("admin_user_remember_me"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("admin_user_submit_action"))).click();
        Thread.sleep(4000);
        //driver.switchTo().alert().accept();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products"))).click();

    }
    //Product
    @Test(enabled =true, priority=1)
    public void Product() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'New Product')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_title"))).sendKeys("Test2");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_sku"))).sendKeys("webdriver2");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_description"))).sendKeys("Check second functionality");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("commit"))).click();
        Thread.sleep(5000);
    }

    @Test(enabled =true, priority=2)
    public void Product3() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'New Product')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_title"))).sendKeys("Test3");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_sku"))).sendKeys("webdriver3");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_description"))).sendKeys("Check Third functionality");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("commit"))).click();
    }

    @Test(enabled =true, priority=3)
    public void Product4() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'New Product')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_title"))).sendKeys("Test4");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_sku"))).sendKeys("webdriver4");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_description"))).sendKeys("Check fourth functionality");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("commit"))).click();
    }
    @Test(enabled =true, priority=4)
    public void Product5() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'New Product')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_title"))).sendKeys("Test5");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_sku"))).sendKeys("webdriver5");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_description"))).sendKeys("Check fivith functionality");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("commit"))).click();
    }
    @Test(enabled =true, priority=5)
    public void Product6() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'New Product')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_title"))).sendKeys("Test6");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_sku"))).sendKeys("webdriver6");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_description"))).sendKeys("Check six functionality");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("commit"))).click();
    }
    //Updates
    @Test(enabled =true, priority=6)
    public void update() throws InterruptedException {
        //Test6- update
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products"))).click();
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("View")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Edit Product')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
        driver.findElement(By.partialLinkText("View")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Edit Product')]")).click();
        driver.findElement(By.xpath("//input[@id='product_description']")).clear();
        driver.findElement(By.xpath("//input[@id='product_description']")).sendKeys("Verify the functionalty on Six number ");
        driver.findElement(By.name("commit")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products"))).click();

    }
    //listing-filters
    @Test(enabled =true, priority=7)
    public void listing() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products"))).click();
        driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='active_admin_content']/div[@id='sidebar']/div[@id='filters_sidebar_section']/div[1]/form[1]/div[1]/select[1]/option[2]")).click();
        driver.findElement(By.id("q_title")).sendKeys("Test5");
        driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='active_admin_content']/div[@id='sidebar']/div[@id='filters_sidebar_section']/div[1]/form[1]/div[2]/select[1]/option[1]")).click();
        driver.findElement(By.id("q_sku")).sendKeys("webdriver5");
        driver.findElement(By.id("q_created_at_gteq_datetime")).sendKeys("2020-11-01");
        driver.findElement(By.id("q_created_at_lteq_datetime")).sendKeys("2020-11-01");
        driver.findElement(By.id("q_updated_at_gteq_datetime")).sendKeys("2020-11-01");
        driver.findElement(By.id("q_updated_at_lteq_datetime")).sendKeys("2020-11-01");
        driver.findElement(By.name("commit")).click();
        Thread.sleep(9000);
    }
    //Deletion-[Test2, Test3, Test4]
    @Test(enabled =true, priority=8)
    public void Deletion() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Batch Actions')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Delete Selected')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products"))).click();
    }



    @AfterClass
    public void exit() {

        driver.quit();
    }
}




