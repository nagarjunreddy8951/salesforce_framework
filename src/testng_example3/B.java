package testng_example3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B {
@Test
public void test2() {
	System.setProperty("webdriver.chrome.driver","F://selenium files//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	
}
}
