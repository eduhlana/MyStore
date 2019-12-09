package steps;

import org.openqa.selenium.WebDriver;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import pages.LoginPage;
import util.DriverFactory;

public class LoginSteps  {
	
	
	WebDriver driver = DriverFactory.getDriver("");
	LoginPage login = new LoginPage(driver);
	@Given("^I visit the website My Store$")
	public void I_visit_the_website_My_Store() {
		login.visit(driver);
	}

	@When("^I put the e-mail \"(.*?)\"$")
	public void I_put_the_e_mail(String email) {
		login.writeEmail(email, driver);
	}
	
	@And("^I put the password \"(.*?)\"$")
	public void I_put_the_password(String password) {
		login.writePass(password, driver);
	}

	@And("^I click on button Sign In$")
	public void I_click_on_button_SignIn() {
		login.signIn(driver);
	}

	@Then("^I will see the message \"(.*?)\"$")
	public void I_will_see_the_message(String message) {
		login.logged(message, driver);
	}

}
