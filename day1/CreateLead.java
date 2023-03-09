package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Padma");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Palaniappan");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select first=new Select(source);
		first.selectByVisibleText("Employee");
		
		WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select second=new Select(market);
		second.selectByValue("9001");
		
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select three=new Select(owner);
		three.selectByIndex(5);
		
		WebElement place = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select four=new Select(place);
		four.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println("Title of the page is:"+title);
		Thread.sleep(2000);
		driver.close();
	}
	
		

}
