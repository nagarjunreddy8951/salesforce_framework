package testng_example3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C {
	@Test
	public void test3() {
		System.setProperty("webdriver.chrome.driver","F://selenium files//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
	}

}
