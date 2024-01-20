package assignmentTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dashBoardPage {
  @Test
  public void dashboard() {
	  	System.setProperty("webdriver.chrome.driver", "/Users/ronelpanopio/Downloads/chromedriver-mac-arm64/chromedriver");

		//2. Initialize Webdriver object through chromeDriver class
		ChromeDriver object = new ChromeDriver();

		//3. Open the form http://training.qaonlinetraining.com/testPage.php
		object.get("http://demo.itlearn360.com");
		object.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		object.findElement(By.id("loginlabel")).click();

		object.findElement(By.id("user_login")).sendKeys("Demo12");


		object.findElement(By.id("user_pass")).sendKeys("Test123456$");


		object.findElement(By.name("wp-submit")).click();
		
		object.findElement(By.className("lg_button")).click();
		
		object.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a")).click();
		
		object.findElement(By.xpath("//*[@id=\"tab-academies\"]/div/div/ul/li[4]/form/div/button")).submit();
		
  }
}
