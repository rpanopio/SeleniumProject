package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class SocialMediaNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "/Users/ronelpanopio/Downloads/chromedriver-mac-arm64/chromedriver");
		// 2. initialize webDriver object through ChromDriver class
		ChromeDriver browserObject = new ChromeDriver();
		
		// 3. open the page https://www.facebook.com
		browserObject.get("https://www.facebook.com");
		System.out.println("This is " + browserObject.getTitle() + " website");
		
		// 4. in the next line we are using getCurrentUrl method. this will give the current url of the webpage
		System.out.println("url is: " + browserObject.getCurrentUrl());
		
		// 5. using the navigate method we move to next website http://www.instagram.com/
		browserObject.navigate().to("http://www.instagram.com/");
		System.out.println("this is " + browserObject.getTitle() + " website");
		
		// 6. in the next line we are using getCurrentUrl method. this will give the current url of the webpage
		System.out.println("url is: " + browserObject.getCurrentUrl());
		
		// 7. using navigate method we again move to next website http://www/twitter.com/
		browserObject.navigate().to("http://www.twitter.com/");
		browserObject.navigate().back();
		System.out.println("this is " + browserObject.getTitle() + " website");
		System.out.println("url is: " + browserObject.getCurrentUrl());
		
		// 8 new we use back method again to navigate back to the first website that is "http://www.facebook.com/"
		browserObject.navigate().back();
		
		// 9 now we use forward method to move forward direction that is to "http://www.instagram.com"
		browserObject.navigate().forward();
		System.out.println("this is " + browserObject.getTitle() + " website");
		System.out.println("url is: " + browserObject.getCurrentUrl());
	}

}
