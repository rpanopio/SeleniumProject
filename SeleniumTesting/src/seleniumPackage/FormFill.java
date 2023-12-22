package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFill {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ronelpanopio/Downloads/chromedriver-mac-arm64/chromedriver");
		ChromeDriver browserObject = new ChromeDriver();
		browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
		
		browserObject.findElement(By.name("name")).sendKeys("Ronel");
		Thread.sleep(1000);
		browserObject.findElement(By.name("email")).sendKeys("ronel@gmail.com");
		Thread.sleep(1000);
		browserObject.findElement(By.name("website")).sendKeys("ITLearn360");
		Thread.sleep(1000);
		browserObject.findElement(By.name("comment")).sendKeys("this is test website");
		Thread.sleep(1000);
		
		// radio button
		browserObject.findElement(By.xpath("//input[@value='female']")).click();
		Thread.sleep(2000);
		browserObject.findElement(By.xpath("//input[@value='male']")).click();
		browserObject.findElement(By.name("submit")).click();
		Thread.sleep(1000);
	}

}
