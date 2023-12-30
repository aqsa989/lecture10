package Lecture10.Project10;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signup {
	@Test(priority = 1)
	public void signup() throws InterruptedException
	{
			
			   WebDriver driver;
			   System.setProperty("Webdriver.gecko.driver","C:\\Users\\office\\Downloads\\geckodriver-v0.33.0-win-aarch64");
		       driver=new FirefoxDriver();
		       driver.get("https://www.demoblaze.com/");
		       driver.findElement(By.cssSelector("#signin2")).click();
		       driver.findElement(By.id("sign-username")).sendKeys("standard_user");
		       driver.findElement(By.id("sign-password")).sendKeys("secret_sauce");
		       driver.findElement(By.cssSelector("button[onclick='register()']")).click();
		       Thread.sleep(3000);
		       Alert alert = driver.switchTo().alert();
		       alert.accept();
		       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
	}
}
