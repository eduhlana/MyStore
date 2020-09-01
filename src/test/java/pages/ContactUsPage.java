package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Util;

public class ContactUsPage extends Util{
	
	By contactUs = By.xpath("//*[@title=\"Contact us\"]");
	By emailField = By.id("email");
	By orderField = By.id("id_order");
	By uploadField = By.id("fileUpload");
	By messageField = By.id("message");
	By selectSubj = By.id("id_contact");
	By send_button = By.id("submitMessage");
	By succesMsg = By.className("alert alert-success");
	
	public void openContactForm(WebDriver driver) {
		visitUrl(driver);
		click(driver, contactUs, 4);
		
	}

	public void fillAll(WebDriver driver , String subject ,String email , String order ,String message) {
		selectSubject(driver, selectSubj, subject);
		write(driver, emailField, "mesquita@gmail.com");
		write(driver, orderField, order );
		write(driver, uploadField, "readme.txt");
		write(driver, messageField, message);
		
	}

	public void clickSend(WebDriver driver) {
		click(driver, send_button, 10);
		
	}

	public void successMessage(WebDriver driver, String message) {
		assertion(driver, succesMsg, message);
		
	}
	
	

}
