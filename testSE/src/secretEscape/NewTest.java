package secretEscape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	
  @Test
  public void Test() {
	   	
	    assertEquals("Join now for Free | Save up to 70% on luxury travel | Secret Escapes", driver.getTitle());
	    driver.findElement(By.id("logInArrow")).click();
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("kumar.shanmugam@dsrc.co.in");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("gurukums29");
	    driver.findElement(By.id("loginGoButton")).click();
	    
	    //assertEquals("Current sales | Save up to 70% on luxury travel | Secret Escapes", driver.getTitle());
	    driver.findElement(By.cssSelector("div.where > #query")).clear();
	    driver.findElement(By.cssSelector("div.where > #query")).sendKeys("london");
	    driver.findElement(By.cssSelector("button.Button.transp")).click();
	    assertEquals("Search Results | Save up to 70% on luxury travel | Secret Escapes", driver.getTitle());
	    driver.findElement(By.cssSelector("div.crop > img")).click();
	    assertEquals("Shendish Manor | Save up to 70% on luxury travel | Secret Escapes", driver.getTitle());
	  
	    driver.findElement(By.id("bookButtonAnchor")).click();
	    driver.findElement(By.xpath("//div[@id='checkInCalendar']/div/div[3]/div[3]/div")).click();
	    driver.findElement(By.xpath("//div[@id='checkOutCalendar']/div/div[3]/div[5]/div")).click();
	    driver.findElement(By.id("holdButton")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  baseUrl ="https://www.secretescapes.com/";
	  driver.manage().window().maximize();
	  driver.get(baseUrl);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	  
		  
  }

  @AfterMethod
  public void afterMethod() {
	  
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
