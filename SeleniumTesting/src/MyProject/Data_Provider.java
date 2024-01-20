package MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	WebDriver browserObject;
	// 4. now in method checking the @Test is passed along with the dataProvider keyword and the dataprovider method name dp
	@Test(dataProvider = "dp")
	public void checking(String userName, String passWord, String msg) {
		// 5. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "/Users/ronelpanopio/Downloads/chromedriver-mac-arm64/chromedriver");
		// create object name driver of type ChromeDriver
		browserObject = new ChromeDriver();
		browserObject.get("https://admin-demo.nopcommerce.com/login");
		// 6. get reference of email input box by locate the id method
		WebElement username = browserObject.findElement(By.id("Email"));
		// 7. get reference of password input box by locate the id method.
		WebElement password = browserObject.findElement(By.id("Password"));
		// 8. get reference of log on button by locate the classname method.
		WebElement submitButton = browserObject.findElement(By.className("button-1"));
		// 9. clear the email input box
		username.clear();
		// 10. provide/enter the correct email to email input box through reference.
		username.sendKeys(userName);
		// 11. clear the password input box.
		password.clear();
		// 12. provide/enter the correct password to password input box through reference.
		password.sendKeys(passWord);
		// 13. click submit the button.
		submitButton.click();
		System.out.println("end result: form submitted");
	}
	@DataProvider
	public Object[][] dp()
	{
		return new Object[][] {
		new Object[] {"admin", "admin132", "Wrong Credentials"},
		new Object[] {"admin", "adminljh", "Wrong Credentials"},
		new Object[] {"admin@yourstore.com", "admin", "Test Passed"}
	};
	}
	
}
