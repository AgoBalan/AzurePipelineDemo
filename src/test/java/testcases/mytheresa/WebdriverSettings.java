package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		 String currentDirectory = System.getProperty("user.dir");
      System.out.println("The current working directory is " + currentDirectory);
		System.setProperty("webdriver.chrome.driver", "Users/runner/work/1/s/driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
