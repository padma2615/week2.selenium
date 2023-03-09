package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//select[text()='Selenium']")).click();
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		Select drop1=new Select(tool);
		drop1.selectByIndex(1);
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'ui-icon ui-icon-triangle')])[2]")).click();
		driver.findElement(By.id("j_idt87:city_2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(@class,'ui-button-icon-primary ui-icon ui-icon-triangle')])")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//li[text()='Appium']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]")).click();
		driver.findElement(By.xpath("//li[text()='இரண்டு']")).click();
		Thread.sleep(2000);
		
	}

}
