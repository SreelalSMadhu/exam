package luminar;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class website_exam {
	ChromeDriver driver;
	@BeforeTest
	public void web() {
		 driver =new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 
	}
	@Test(priority=1)
	public void login() throws Exception {
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		un.sendKeys("Admin");
		WebElement ps =driver.findElement(By.xpath("//input[@placeholder='Password']"));
		ps.sendKeys("admin123");
		WebElement log= driver.findElement(By.xpath("//button[@type='submit']"));
		log.click();
		
	}
	@Test(priority= 2)
	public void home_page(){
	 WebElement dash = driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']"));
	    if (dash.isDisplayed()) {
	    	System.out.println("is displayed");
	    }
	    else {
	    	System.out.println("not dispalyed");
	    }
	     TakesScreenshot s= ((TakesScreenshot)driver);
	    FileHandler s1 =((TakesScreenshot)driver).getScreenshotAs("C:\\Users\\sreel\\OneDrive\\Desktop\\Selenium Exam\\exam.png");
	    
	}
	@Test(priority=3)
	public void ad() throws Exception {
		Thread.sleep(2000);
		WebElement adm= driver.findElement(By.xpath("//span[normalize-space()='Admin']"));
		adm.click();
	}
	@Test(priority= 4)
	public void admi() {
		WebElement admin_name= driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--focus']"));
		admin_name.sendKeys("Admin");
		WebElement admin_select= driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']"));
		 
		WebElement adminn= driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		adminn.sendKeys("JohnMadhavan Doe");
		
		WebElement search= driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		
	}
	

}
