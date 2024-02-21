package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.PlaceSheetPage;

public class PlaceSheetSteps {

	WebDriver driver;
    PlaceSheetPage ps;

@Given("the user navigates to home page")
public void the_user_navigates_to_home_page() {
	BaseClass.getLogger().info("Goto Search Page ");
	ps=new PlaceSheetPage(BaseClass.getDriver());
	ps.clickSearchBox();
}

@When("user enters text as {string}")
public void user_enters_text_as(String string) throws InterruptedException {
    ps.enterQuery("Cascal");
    Thread.sleep(2000);
}

@When("the user Selects option from the list")
public void the_user_selects_option_from_the_list() {
	ps.searchResults();
}

@Then("the user should be redirected Place sheet")
public void the_user_should_be_redirected_place_sheet() {
    ps.seePhotosTextPlaceSheet();
  
}

@Then("the user should click on Reserve a Table button")
public void the_user_should_click_on_reserve_a_table_button() {
    ps.validatereserveATable();
    ps.clickreserveATable();
}

@Then("the user should be navigated to Reserve a Table page")
public void the_user_should_be_navigated_to_reserve_a_table_page() {
    ps.validateReserveATableSheet();
}

}
