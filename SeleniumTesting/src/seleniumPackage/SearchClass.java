package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ronelpanopio/Downloads/chromedriver-mac-arm64/chromedriver");
		ChromeDriver browserObject = new ChromeDriver();
		browserObject.get("http://www.google.com/");
		
	    
	    browserObject.findElement(By.name("q")).sendKeys("Selenium Python");
	    
	    browserObject.findElement(By.name("btnK")).submit();
	}

}
