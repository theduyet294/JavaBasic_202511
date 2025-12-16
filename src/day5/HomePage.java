package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

	public By lblElements = By.xpath("//h5[text()='Elements']");
	public HomePage(WebDriver dr) {
		super(dr);
	}
	
	public ElementsPage clickElements() {
		driver.findElement(lblElements).click();
		return new ElementsPage(driver);
	}
}
