package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		
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
		driver.findElement(By.id("ext-gen248")).sendKeys("padma");
		Thread.sleep(2000);
		driver.findElement(By.id("ext-gen334")).click();
		//driver.findElement(By.id("ext-gen881")).click();
		//driver.findElement(By.xpath("(//a[contains(@class,'linktext')])[6]")).click();
		driver.findElement(By.linkText("13574")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("updateLeadForm_companyName")).clear();
	    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Leaf Test");
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    String S1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	    
	    System.out.println(S1);
	    
	    driver.close();
	}

}
