package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {
	public static void main(String[] args) throws InterruptedException {
		// 1. setup the property of chromedriver because we will perform Alert testing through
		// chrome web browser
		System.setProperty("webdriver.chrome.driver", "/Users/ronelpanopio/Downloads/chromedriver-mac-arm64/chromedriver");
		// 2. initialize webdriver object through ChromeDriver class.
		ChromeDriver object = new ChromeDriver();
		// 3. open the form page http://training.qaonlinetraining.com/testPage.php
		object.get("http://training.qaonlinetraining.com/testPage.php");
		// 4. locate the alert button and perform click
		object.findElement(By.id("alert")).click();
		// 5. initialize alert object using switchTo and alert method
		Alert alert = object.switchTo().alert();
		//6. getText method is used to get the text from alert box
		System.out.println(alert.getText());
		// thread.sleep is used to hold the part of code for given time limit. in this case take mouse
		// over the thread sleep and add interrupted exception to this method
		Thread.sleep(4000);
		// 8. switch the object control to alert box and accept the alert using accept method.
		alert.accept();
		
		// example 2 - dismiss(You pressed Cancel!). The steps are same only name a new object
		object.findElement(By.id("confirm")).click();
		Alert alert1 = object.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(4000);
		// 9. switch the object control to alert box and cancel the alert using dismiss method
		alert1.dismiss();
		
		// example 3 - accept and Type(Hello Ronel! How are you today?). The steps same only name
		// a new object
		object.findElement(By.id("prompt")).click();
		Alert alert2 = object.switchTo().alert();
		System.out.println(alert2.getText());
		Thread.sleep(4000);
		// 10. switch the object control to alert box and send value to the alert box using sendKeys method
		alert2.sendKeys("Ronel");
		// 11. after the value is send accept the alert using accept method.
		alert2.accept();
		
		
		
		//object.close();
		
	}
}
