package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RichListPage extends BasePage
{   
	WebDriver driver;
	
	public RichListPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="(//li[@data-attrid='AutocompletePrediction'])[1]")
	WebElement searchResult;
	
	@FindBy(xpath="//span[text()='More places']")
	WebElement morePlaces;
	
	
	public String getRichListPageTitle() {
		return driver.getTitle();
	}

	public void searchResultsList() {
		searchResult.click();
	}
	
	public void morePlacesButton() {
		morePlaces.isDisplayed();
	}

	
	
}
