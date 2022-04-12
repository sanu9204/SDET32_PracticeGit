package genericLibrary;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
@BeforeClass
public void bcConfig() {
	WebDriverManager.chromedriver();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("disable-notifications");
	options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
    driver=new ChromeDriver(options);
    driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	
}

}
