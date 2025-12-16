package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxTest {
	public void submitSuccessfully() {
		System.setProperty("webdriver.chorme.driver", "E:\\01Automation202511\\02Projects\\0Git\\JavaBasic_202511\\src\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com");
		HomePage homePage = new HomePage(driver);
	}
}
