package Lecture10.Project10;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Checkout {

	@Test(priority = 4)
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
		       Thread.sleep(3000);
		       driver.findElement(By.cssSelector("#cartur")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.cssSelector("#name")).sendKeys("aqsamehreen");
		       driver.findElement(By.cssSelector("#country")).sendKeys("Pakistan");
		       driver.findElement(By.cssSelector("#city")).sendKeys("lahore");
		       driver.findElement(By.cssSelector("#card")).sendKeys("4111111111111111");
		       driver.findElement(By.cssSelector("#month")).sendKeys("09");
		       driver.findElement(By.cssSelector("#year")).sendKeys("2026");
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
		       Thread.sleep(2000);
}
}