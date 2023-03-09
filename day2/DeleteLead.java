package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		Thread.sleep(2000);
		driver.findElement(By.xpath(("(//button[contains(@class,'x-btn-text')])[7]"))).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//driver.findElement(By.xpath("(//input[contains(@class,' x-form-text x-form-field ')])[5]")).sendKeys("14755");
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("14755");
		Thread.sleep(2000);
		driver.findElement(By.id("ext-gen334")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
