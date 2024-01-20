package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseAmazon {

	public static void main(String[] args) {
		// 1. setup the property of chromdriver to open amazon page throught chrome browser.
		System.setProperty("webdriver.chrome.driver", "/Users/ronelpanopio/Downloads/chromedriver-mac-arm64/chromedriver");
		// 2. Initialize webdriver object throught ChromeDriver Class.
		ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
		browserObject.get("https://www.facebook.com");
		

	}

}
