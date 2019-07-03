package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	@Test
	public void testUserIsAbleToLoginIntoApp() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();

		WebElement HederLabel = driver.findElement(By.cssSelector(".product_label"));
		String hHederLabel = HederLabel.getText();
		Assert.assertNotNull(driver.findElement(By.id("shopping_cart_container")));
		Assert.assertEquals(hHederLabel.toLowerCase(),"products");


	}

}
