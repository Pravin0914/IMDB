package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver Launchbrowser()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravin Magar\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    return driver;
}

}
