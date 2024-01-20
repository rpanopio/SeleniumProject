package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass {

	public static void main(String[] args) throws InterruptedException {
		/// 1. setup the property of chromdriver to open amazon page throught chrome browser.
		System.setProperty("webdriver.chrome.driver", "/Users/ronelpanopio/Downloads/chromedriver-mac-arm64/chromedriver");
		// 2. Initialize webdriver object throught ChromeDriver Class.
		ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.facebook.com link using get method.
		browserObject.get("https://www.facebook.com/");
		Thread.sleep(3000);
		System.out.println("this is " + browserObject.getTitle() + " website");
		// 5. In next line we are using getCurrentUrl method. This will give the current url of the webpage.
		System.out.println("url is: " + browserObject.getCurrentUrl());
		
		// 6. using the navigate method we move to next website http://www.instagram.com/
		browserObject.navigate().to("http://www.instagram.com/");
		Thread.sleep(3000);
		System.out.println("this is " + browserObject.getTitle() + " website");
		
		// 8. in next line we are using getCurrentUrl method. this will give the current url of the webpage
		System.out.println("url is: " + browserObject.getCurrentUrl());
		
		// 9. using navigate method we again move to newxt website http://www.twitter.com/
		browserObject.navigate().to("http:/www.twitter.com/");
		Thread.sleep(3000);
		browserObject.navigate().back();
		
		
		Thread.sleep(3000);
		browserObject.navigate().forward();
		
		browserObject.close();
		
	}

}
