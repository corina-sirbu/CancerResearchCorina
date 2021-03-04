package shops;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Search {

    // Task 1: finish this test...
    // Task 2: Add negative scenario
    // Task 3: Refactor me
    @Test(enabled = true)
    public void searchTest() throws Throwable {
        // Setup
        System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe"); // Windows
        //System.setProperty("webdriver.chrome.driver","/Users/<your username>/chromedriver/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cancerresearchuk.org/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.linkText("Find local shops")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Shop search results");

        WebElement breadcrumb = driver.findElement(By.className("breadcrumb"));
        Assert.assertEquals(breadcrumb.findElement(By.linkText("Get involved")).getText(), "Get involved");
        driver.findElement(By.id("edit-field-shop-geocode-latlon")).sendKeys("London");
        driver.findElement(By.id("edit-submit-shop-listing")).click();
        Assert.assertEquals(driver.findElement(By.className("shop-search-phone")).getText().trim(), "0207 4874986");

        // Teardown
        Thread.sleep(1000);
        driver.quit();
    }
}
