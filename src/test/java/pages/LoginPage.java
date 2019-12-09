package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Util;

public class LoginPage extends Util{
	
	By signIn = By.className("header_user_info");
	By inptemail = By.id("email");
	By inptpasswd = By.id("passwd");
	By btnSignIn = By.id("SubmitLogin");
	By spanMessage = By.xpath("//*[@id=\"center_column\"]/p"); 
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void visit(WebDriver driver) {
		visitUrl(driver);
	};

	public void writeEmail(String email, WebDriver driver) {
		click(driver, signIn, 10);
		 write(driver, inptemail, email);
		 
		
	};
	public void writePass(String passwd, WebDriver driver) {
		write(driver, inptpasswd, passwd);
		
	};
	
	public void signIn(WebDriver driver) {
		 click(driver, btnSignIn, 0);
	}

	public void logged(String message, WebDriver driver) {
		
		 assertion(driver, spanMessage, message);
	}
	

}
