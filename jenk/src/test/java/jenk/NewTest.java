package jenk;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod()
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	 driver.get("https://www.google.com");
	 driver.manage().window().maximize();
  }
  @Test
  public void f()
  {
	  driver.findElement(By.name("q")).sendKeys("babu");
	  driver.findElement(By.name("btnK")).click();
  }

  @AfterMethod
  public void afterMethod()
  {
	 driver.close(); 
  }

}
