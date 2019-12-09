package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Util;

public class OrderPage extends Util{
	WebDriver driver ;
	public OrderPage(WebDriver driver) {
		this.driver = driver;
	}
	By userLogged = By.xpath("//*[@class='header_user_info']/a/span");
	By tableCategory = By.xpath("//*[@id=\"block_top_menu\"]/ul");
	By tableProducts = By.xpath("//*[@id=\"center_column\"]/ul");
	By screenProduct = By.id("product");
	By btnAddCart = By.id("add_to_cart");
	By spanMessage = By.xpath("//*[@id=\"layer_cart\"]/div/div/h2");
	By finalMessage = By.xpath("//*[@id=\"center_column\"]/div/p/strong");
	By btnCheck = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	By btncheckout = By.xpath("//*[@id=\"center_column\"]/p[2]/a");	
	By btnAdressCheck = By.name("processAddress");
	By agree = By.xpath("//*[@id=\"form\"]/div/p[2]/label");
	By agreeCheckout = By.name("processCarrier");
	By payment = By.className("bankwire");
	By btnConfirmOrder = By.xpath("//*[@id=\"cart_navigation\"]/button/span");

	public void logged(String user) {
		assertion(driver, userLogged, user);
		
	}

	public void category(String category) {
		chooseCategory(driver, tableCategory, category);
		
	}

	public void chooseItem() {
		chooseProduct(driver, tableProducts);
		
	}

	public void addCart() throws InterruptedException {
		clickAddCart(driver, screenProduct, btnAddCart, 5);
		
	}

	public void proceedToCheckout() {
		click(driver, btnCheck, 2);
		
	}

	public void summary() {
		
		assertTrue(click(driver, btncheckout, 2)); 
		
	}

	public void myInformation() {
		assertTrue(click(driver, btnAdressCheck, 2));
		
	}

	public void assertion(String message) {
		assertion(driver, spanMessage, message);
		
	}

	public void agreeTerms() {
		assertTrue(click(driver, agree, 5));
		assertTrue(click(driver, agreeCheckout, 5));
		
	}

	public void payment() {
		click(driver, payment, 3);
		
	}

	public void confirm() {
		click(driver, btnConfirmOrder, 3);
		
	}
	public void assertionFinal(String message) {
		assertion(driver, spanMessage, message);
		driver.quit();
		
	}


}
