package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class PlaceSheetPage extends BasePage
{   
	WebDriver driver;
	
	public PlaceSheetPage(WebDriver driver)
	{
		super(driver);
	}	
		
		@FindBy(name="q")
		WebElement searchBox;
		
		public void clickSearchBox() {
			searchBox.click();

		}
		
		public void enterQuery(String string) {
			searchBox.sendKeys(string);
		}
		
		//@FindBy(xpath="//li[@data-entityname='Cascal']")
		@FindBy(xpath="(//li[@data-attrid='AutocompletePrediction'])[1]")
		WebElement searchResult;
		
		public void searchResults() {
			searchResult.click();
			}
		
		@FindBy(xpath="//*[text()='See photos']")
		@CacheLookup
		WebElement seePhotosText;
		
		public void seePhotosTextPlaceSheet() {
			seePhotosText.isDisplayed();
		}
		
		@FindBy(xpath="//span[text()='Reserve a table']")
		WebElement reserveATable;
		
		public void validatereserveATable() {
			reserveATable.isDisplayed();
		}
		
		public void clickreserveATable() {
			reserveATable.click();
		}
		
		@FindBy(xpath="//div[@role='heading' and text()='Cascal']")
		WebElement reserveATableSheet;
		
		public void validateReserveATableSheet() {
			reserveATableSheet.isDisplayed();
		}
		
				
}