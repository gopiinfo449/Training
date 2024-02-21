package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.PlaceSheetPage;
import pageObjects.RichListPage;

public class RichListSteps {
	WebDriver driver;
    PlaceSheetPage ps;
    RichListPage rl;

@When("user enters text {string}")
public void user_enters_test(String string) {
	BaseClass.getLogger().info("Goto Search Page ");
	ps=new PlaceSheetPage(BaseClass.getDriver());
	ps.clickSearchBox();
	ps.enterQuery("Pizza sf");
}

@When("the user Selects option from list")
public void the_user_selects_option_from_list() throws InterruptedException {
	rl=new RichListPage(BaseClass.getDriver());
	Thread.sleep(2000);
	rl.searchResultsList();
}

@Then("the user should be redirected to Rich List")
public void the_user_should_be_redirected_to_rich_list() {
	rl.morePlacesButton();
	//System.out.println("Page title is: " + title);
}
}
