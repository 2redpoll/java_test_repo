package ru.stqa.webtests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SafestoreSearchTest {
    private WebDriver driver;

    @BeforeTest

    public void setUp() {
        System.setProperty("webdriver.chrome.driver","D:\\DEV\\chromeWebDrv105\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void ssSearchTest() throws InterruptedException  {
        driver.get("https://www.safestore.co.uk");
        driver.manage().window().setSize(new Dimension(1440, 1040));
        String title = driver.getTitle();
        String curentUrl = driver.getCurrentUrl();

        driver.findElement(By.id("dropdown_moreinfo")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("p_lt_ctl05_pageplaceholder_p_lt_ctl00_HomepageHeaderZone_HomepageHeaderZone_zone_FindAStoreMay19_txtSearchTitle")).click();
        driver.findElement(By.id("p_lt_ctl05_pageplaceholder_p_lt_ctl00_HomepageHeaderZone_HomepageHeaderZone_zone_FindAStoreMay19_txtSearchTitle")).sendKeys("Battersea Park");   //set new method
        driver.findElement(By.id("p_lt_ctl05_pageplaceholder_p_lt_ctl00_HomepageHeaderZone_HomepageHeaderZone_zone_FindAStoreMay19_btnSearchStore")).click();
        System.out.println(title);
        System.out.println("URL: " + curentUrl);

        driver.findElement(By.className("nav_single")).click();

        Thread.sleep(8000);

        driver.findElement(By.className("nav_login-link")).click();


        Thread.sleep(10000);
        System.out.println("Time test method two");

    }

}
