package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Util;

public class RegisterPage extends Util {
	
	By SignIn_button = By.xpath("//*[@title='Log in to your customer account']");
	By email_input = By.xpath("//*[@id='email_create']");
	By createAccount_button = By.id("SubmitCreate");
	By firstName_input = By.id("customer_firstname");
	By lastName_input = By.id("customer_lastname");
	By passwd_input = By.id("passwd");
	By address_input = By.id("address1");
	By city_input = By.id("city");
	By country_select = By.id("id_country");	
	By postCode_input = By.id("postcode");
	By register_Button = By.id("submitAccount");
	By validationMessage =  By.xpath("//*[@id=\"center_column\"]/div/ol");
	By mobilephone_input = By.id("phone_mobile");

	boolean result = false;
	public boolean clickSignIn(WebDriver driver) {
		return click( driver, SignIn_button, 30);
		
	}
	
	public boolean writeEmail(String email, WebDriver driver) {
		return write(driver, email_input, email);
		
	}
	public boolean clickCreateAccount(WebDriver driver) {
		return click(driver, createAccount_button, 2);
		
	}
	public boolean assertFormIsOpened(WebDriver driver) {
		return exist(driver, email_input, 15);
	}
	
	public boolean clickAtRegister(WebDriver driver) {
		return click(driver, register_Button, 2);
	}
	
	public void fillForm(WebDriver driver,String firstName, String lastName, String passwd, String address, String city, String postalCode, String country, String mobilephone) {

		write(driver, firstName_input, firstName);
		write(driver, lastName_input, lastName);
		write(driver, passwd_input, passwd);
		write(driver, address_input, address);
		write(driver, country_select, country);
		write(driver, city_input, city);
		write(driver, postCode_input, postalCode);
		write(driver, mobilephone_input, mobilephone);
		click(driver, register_Button, 10);
		
		if(firstName.isEmpty()) {
			selectMessageValidation(driver, validationMessage, "firstname");
			
		}
		if(lastName.isEmpty()) {
			selectMessageValidation(driver, validationMessage, "lastname");
			
		}
		if(passwd.isEmpty()) {
			selectMessageValidation(driver, validationMessage, "passwd");
			
		}
		if(address.isEmpty()) {
			selectMessageValidation(driver, validationMessage, "address1");
			
		}
		if(city.isEmpty()) {
			selectMessageValidation(driver, validationMessage, "city");
			
		}
		if(country.isEmpty()) {
			selectMessageValidation(driver, validationMessage, "country");
			
		}
		if(postalCode.isEmpty()) {
			selectMessageValidation(driver, validationMessage, "Postal");
			
		}
		if(mobilephone.isEmpty()) {
			selectMessageValidation(driver, validationMessage, "phone number");
			
		}
		
		
	}
	public boolean messageRequiredFields(WebDriver driver) {
		return exist(driver, validationMessage, 5);
		
		
	}

	public void openedRegisterForm(String emailRegister, WebDriver driver) {
		visitUrl(driver);
		clickSignIn(driver);
		writeEmail(emailRegister, driver);
		clickCreateAccount(driver);
		assertFormIsOpened(driver);
	}
	
//	
	
	
	

}
