package Lecture10.Project10;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Dashboard {

	@Test(priority = 3)
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
		       driver.findElement(By.xpath("//a[3]")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath(" //a[normalize-space()='Sony vaio i5']")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[2]/div[1]/a[1]")).click();
		       Thread.sleep(3000);
		       Alert alert = driver.switchTo().alert();
		       alert.accept();	     
}
}