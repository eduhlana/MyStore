package steps;

import org.openqa.selenium.WebDriver;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import pages.OrderPage;
import util.DriverFactory;

public class OrderSteps {
	WebDriver driver = DriverFactory.getDriver("");
	OrderPage order = new OrderPage(driver);
	
	@Given("^I am logged in MyStore with user \"([^\"]*)\"$")
	public void I_am_logged_in_MyStore(String user) {
	   order.logged(user);
	}

	@When("^I choose one category \"([^\"]*)\"$")
	public void I_choose_one_category(String category) {
	   order.category(category);
	}

	@And("^I choose one item$")
	public void I_choose_one_item() {
	    order.chooseItem();
	}

	@And("^I click on button Add to Cart$")
	public void I_click_on_button_Add_to_Cart() throws InterruptedException {
	  order.addCart();
	}
	@Then("^I will see \"([^\"]*)\"$")
	public void I_will_see_the(String message) {
	    order.assertion(message);
	}


	@When("^I click on button Proceed to checkout$")
	public void I_click_on_button_Proceed_to_checkout() {
	   order.proceedToCheckout();
	}

	@When("^I see the summary$")
	public void I_see_the_summary() {
	    order.summary();
	}

	@When("^I verify my informations$")
	public void I_verify_my_informations() {
	   order.myInformation();
	}
	@When("^I agree the terms of service$")
	public void I_agree_the_terms_of_service() {
	  order.agreeTerms();
	}

	@When("^I choose my payment$")
	public void I_choose_my_payment() {
	  order.payment();
	}

	@When("^I confirm my order$")
	public void I_confirm_my_order() {
		order.confirm();
	}
	@Given("^I clicked on button Proceed to checkout$")
	public void I_clicked_on_button_Proceed_to_checkout() {
	    order.proceedToCheckout();
	}
	@Then("^I will see message \"([^\"]*)\"$")
	public void I_will_see_message(String message) {
	    order.assertionFinal(message);
	    
	}

	

}
