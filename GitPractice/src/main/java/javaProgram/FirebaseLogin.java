package javaProgram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.safari.SafariDriver;
public class FirebaseLogin {
		
		public static void homePage(WebDriver driver) throws InterruptedException
		{
			
			driver.findElement(By.xpath("//a[text()='Home']")).click();
			driver.findElement(By.id("name")).sendKeys("Sudha");
			driver.findElement(By.id("lname")).sendKeys("Kandasamy");
			driver.findElement(By.id("postaladdress")).sendKeys("Phoenix");
			driver.findElement(By.id("personaladdress")).sendKeys("Az");
			driver.findElement(By.id("personaladdress")).sendKeys("Az");
			WebElement gender = driver.findElement(By.xpath("//input[@value='female']"));
			gender.click();
			if(gender.isSelected())
			{
				System.out.println("Radio button Gender-Female is selected ");
			}
			
//			WebElement selectMenu = driver.findElement(By.id("city"));
//			Select select = new Select(selectMenu);
//			select.selectByValue("mumbai");
			
			new Select (driver.findElement(By.id("city"))).selectByVisibleText("MUMBAI");
			new Select (driver.findElement(By.id("course"))).selectByValue("btech");
			new Select (driver.findElement(By.id("district"))).selectByVisibleText("BIHAR");
			new Select (driver.findElement(By.id("state"))).selectByIndex(1);

			driver.findElement(By.id("pincode")).sendKeys("88888");
			driver.findElement(By.id("emailid")).sendKeys("abc@gmail.com");
			Thread.sleep(6000);
			driver.findElement(By.className("bootbutton")).click();	
		}
		
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://selenium-prd.firebaseapp.com/home.html");
			driver.manage().window().maximize();
			driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
			driver.findElement(By.id("password_field")).sendKeys("admin123");
			driver.findElement(By.tagName("BUTTON")).click();
			Thread.sleep(4000);
			FirebaseLogin.homePage(driver);
			driver.quit();
	}}
