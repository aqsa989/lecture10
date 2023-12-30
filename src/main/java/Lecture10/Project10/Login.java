package Lecture10.Project10;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	@Test(priority = 2)

	public void signup() throws InterruptedException
	{
			   WebDriver driver;
			   System.setProperty("Webdriver.gecko.driver","C:\\Users\\office\\Downloads\\geckodriver-v0.33.0-win-aarch64");
		       driver=new FirefoxDriver();
		       driver.get("https://www.demoblaze.com/");
		       driver.findElement(By.cssSelector("#login2")).click();
		       driver.findElement(By.cssSelector("#loginusername")).sendKeys("testsqa");
		       driver.findElement(By.cssSelector("#loginpassword")).sendKeys("0000");
		       driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
	}
}
