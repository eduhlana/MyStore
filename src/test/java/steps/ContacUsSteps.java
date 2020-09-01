package steps;

import org.openqa.selenium.WebDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import pages.ContactUsPage;
import util.DriverFactory;

public class ContacUsSteps{
	
	ContactUsPage contact = new ContactUsPage();
	WebDriver driver = DriverFactory.getDriver("");
	
	@Given("^open the contact us form$")
	public void open_the_contact_us_form() {
	    contact.openContactForm(driver);
	}

	@When("^i fill up all fields \"([^\"]*)\"\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_fill_up_all_required_fields(String subject, String email, String order, String message) {
		contact.fillAll(driver, subject, email, order, message);
	   
	}

	@When("^i click at Send button$")
	public void i_click_at_Send_button() {
	  contact.clickSend(driver);
	}

	@Then("^i should see succes message \"([^\"]*)\"$")
	public void i_shoul_see_succes_message(String message) {
		contact.successMessage(driver, message);
	    
	}

}
