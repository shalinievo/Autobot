package Autobot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserfactory {
	public static WebDriver getBrowserInstance(String currentDirectory, String browserName) {
		WebDriver driver = null;
		if(browserName == "firefox") {
			System.setProperty("webdriver.gecko.driver", currentDirectory + "\\files\\webdrivers\\geckodriver.exe");
			//FirefoxOptions options = new FirefoxOptions();
			//options.setBinary(currentDirectory + "\\files\\webdrivers\\Firefox.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName == "chrome") {
			System.setProperty("webdriver.chrome.driver", currentDirectory + "\\files\\webdrivers\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
            options.setBinary(currentDirectory + "\\files\\webdrivers\\chrome-win64\\chrome.exe");
            driver = new ChromeDriver(options);
		}
		
		else if (browserName == "IE") {
			System.setProperty("webdriver.ie.driver",currentDirectory + "\\files\\webdrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
	}
		
        return driver;
	}

}
