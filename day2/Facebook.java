package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.findElement(By.name("firstname")).sendKeys("padma");
	driver.findElement(By.name("lastname")).sendKeys("bala");
	driver.findElement(By.name("reg_email__")).sendKeys("padma.endless87@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("sara");
	WebElement day = driver.findElement(By.name("birthday_day"));
	Select drop1=new Select(day);
	drop1.selectByVisibleText("9");
	
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select drop2=new Select(month);
	drop2.selectByVisibleText("Jul");
	
	WebElement year = driver.findElement(By.name("birthday_year"));
	Select drop3=new Select(year);
	drop3.selectByVisibleText("1987");
	
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	
	
	
	
	
	
	
	
	
	
} 
}