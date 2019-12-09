package util;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	public boolean exist(WebDriver driver, By by, int time) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, time);

			if (wait.until(ExpectedConditions.visibilityOfElementLocated((by))) != null) {

				return true;
			} else {

				return false;
			}
		} catch (Exception e) {

			return false;
		}

	}

	public void visitUrl(WebDriver driver) {
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	public boolean click(WebDriver driver, By by, int time) {
		try {
			if (exist(driver, by, time)) {
				driver.findElement(by).click();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	public boolean clickAddCart(WebDriver driver, By popup, By btn, int time) throws InterruptedException {
		boolean result = false;
		int j = driver.findElements(By.tagName("iframe")).size();
		Thread.sleep(3000);
		for (int i = 0; i < j; i++) {
			driver.switchTo().frame(i);
			if(exist(driver, btn, 4)) {
				driver.findElement(btn).click();
				return true;
			}
		}
		return result;
	}

	public boolean write(WebDriver driver, By by, String text) {
		try {
			WebElement inpt = driver.findElement(by);
			Thread.sleep(200);
			inpt.sendKeys(text);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean chooseCategory(WebDriver driver, By tab, String text) {
		boolean result = false;
		List<WebElement> tableOption;
		WebElement option;
		String textOption = "";
		try {
			tableOption = driver.findElement(tab).findElements(By.xpath("./li"));
			System.out.println("Choosing option");
			for (int i = 0; i < tableOption.size(); i++) {
				option = tableOption.get(i).findElement(By.xpath("./a"));
				textOption = option.getText();
				if (textOption.equals(text)) {
					option.click();
					return true;
				}

			}

		} catch (Exception e) {
			System.out.println("Option " + text + " not found ");
			result = false;
		}
		return result;
	}

	public boolean chooseProduct(WebDriver driver, By tab) {
		boolean result = false;
		WebElement table;
		if(exist(driver, tab, 5)) {
			 table = driver.findElement(tab);
		}else {
			return false;
		}
		List<WebElement> tableOption;
		WebElement option;
		try {

			tableOption = driver.findElement(tab).findElements(By.xpath("./li"));
			if (tableOption.size() > 0) {
				option = tableOption.get(0).findElement(By.xpath("./div/div/div"));
				option.click();
			
			} else {
				System.out.println("Item not found");
			}

		} catch (Exception e) {
			result = false;
		}

		return result;

	}

	public void assertion(WebDriver driver, By by, String text) {
		String message = "";
		WebElement inpt = null;
		if(exist(driver, by, 6)) {
			inpt = driver.findElement(by);
			message = inpt.getText();
			assertEquals(message, text);
		}

	}

}
