package steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import pages.RegisterPage;
import util.DriverFactory;
import util.Report;

public class RegisterSteps {
	boolean result = false ;
	
	
	WebDriver driver = DriverFactory.getDriver("");
	RegisterPage register = new RegisterPage();
	String emailRegister = "mesquita@gmail.com";
	
	@Given("^I click at Sign in button")
	public void I_click_at_Sign_in_button() {
	   register.visitUrl(driver);
	   register.clickSignIn(driver);
	}
	@When("I insert my email with \"(.*?)\"$")
	public void I_insert_my_email_with (String email) {
		register.writeEmail(email, driver);
		
	}
	@And("Click at Create an account")
	public void Click_at_Create_an_account() {
		register.clickCreateAccount(driver);
	}
	@Then("The register form should be displayed")
	public void The_register_form_should_be_displayed() {
		register.assertFormIsOpened(driver);
	
		//DriverFactory.killDriver();
	}
	
	@Given("I opened the register form")
	public void I_opened_the_register_form() {
		register.openedRegisterForm(emailRegister , driver);
	}
	@When("^I click at register with the following values \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void I_insert_values(String firstName, String lastName, String passw, String address, String city, String postalCode, String country, String phone) {
		register.fillForm(driver ,firstName,  lastName,  passw,  address,  city,  postalCode,  country, phone);
		
	}
	
	@And("I click at register")
	public void I_click_at_register() {
		register.clickAtRegister(driver);
	}
	@Then("I should see a validation message")
	public void I_should_see_a_validation_message() {
		assertTrue(register.messageRequiredFields(driver));
		DriverFactory.killDriver();
	}
	
	
}
