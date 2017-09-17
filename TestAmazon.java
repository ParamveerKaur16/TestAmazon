package automationfm;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//import org.testng.Assert;

public class TestAmazon 
	{
	 
	  @Test
	  public void MyMethod()
	  {
		  
		  System.setProperty("webdriver.gecko.driver", "D://Param/IE/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://amazon.com");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Nikon"+Keys.RETURN);
		  driver.findElement(By.xpath("//*[@id=\"sort\"]")).sendKeys("Price: High to Low");
		  driver.findElement(By.xpath("//*[@id=\"result_1\"]/div/div/div/div[2]/div[1]/div[1]/a/h2")).click();
		  String text = driver.findElement(By.xpath("//*[@id=\"productTitle\"]")).getText();
		  System.out.println(text);
		  Assert.assertEquals(text, "D3X");
		  
	  }

  }
