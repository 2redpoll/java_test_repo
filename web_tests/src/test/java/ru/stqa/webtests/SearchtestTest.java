package ru.stqa.webtests;// Generated by Selenium IDE


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchtestTest {
  private WebDriver driver;

  @BeforeTest

  public void setUp() {
    System.setProperty("webdriver.chrome.driver","D:\\DEV\\chromeWebDrv108\\chromedriver.exe");
    driver = new ChromeDriver();

  }

  @AfterTest
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void testingSearch() throws InterruptedException  {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    driver.manage().window().setSize(new Dimension(1440, 1040));
    String title = driver.getTitle();
    String curentUrl = driver.getCurrentUrl();

    driver.findElement(By.name("my-text")).click();
    driver.findElement(By.name("my-text")).sendKeys("test");   //set new method
   // driver.findElement(By.name("btnK")).click();
    System.out.println(title);
    System.out.println("URL: " + curentUrl);


    Thread.sleep(10000);
    System.out.println("Time test method two");

  }

}
