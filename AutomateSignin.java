package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateSignin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500)); 
		driver.get("https://www.guvi.in/");
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary text-white px-4']")).click();
		driver.findElement(By.className("form-control")).sendKeys("hari");
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/form[1]/div[2]/input[1]")).sendKeys("dabon53489@hidelux.com");
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("testingphase1");
		driver.findElement(By.id("mobileNumber")).sendKeys("9250806845");
		WebElement st = driver.findElement(By.tagName("h2"));
		st.getText();
		driver.findElement(By.id("signup-btn")).click();
		String TitleAfterSignup = driver.getTitle();
		if (TitleAfterSignup.equals("GUVI | Sign Up"))
		{
		    System.out.println("Registration Successful!");
		}
		else
		{
		    System.out.println("Registration Failed.");
		}
		 driver.close();
	}

}

OUTPUT:
Registration Successful!
