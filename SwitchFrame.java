package task20;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500)); 
		driver.get("https://jqueryui.com/datepicker/");
		//driver.manage().window().maximize();
		
		driver.switchTo().frame(0);  //getting into frame
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
                driver.findElement(By.xpath("(//a[normalize-space()='22'])[1]")).click();
                String drive = driver.findElement(By.id("datepicker")).getAttribute("value");
                System.out.println("The selected date is : "+drive);
                driver.close();
	}

}
