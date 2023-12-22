package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ronelpanopio/Downloads/chromedriver-mac-arm64/chromedriver");
		ChromeDriver browserObject = new ChromeDriver();
		browserObject.get("http://www.amazon.com/");
		
	}

}
