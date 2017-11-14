package sel;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Goibibo 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Trains']")).click();
		Thread.sleep(2000);
		
	    WebElement ele1 = driver.findElement(By.xpath("(//input[@id='gosuggest_inputL'])[1]"));
	    
	    ele1.sendKeys("Kolkata Howrah Junction");
	    driver.manage().deleteAllCookies();
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='gosuggest_inputL'])[2]")).sendKeys("Mysore");
		//rb.keyPress(KeyEvent.VK_ENTER);
		//rb.keyRelease(KeyEvent.VK_ENTER);
		 driver.manage().deleteAllCookies();
		//rb.keyPress(KeyEvent.VK_DOWN);
		//rb.keyPress(KeyEvent.VK_DOWN);
		//rb.keyPress(KeyEvent.VK_DOWN);
		//rb.keyPress(KeyEvent.VK_ENTER);
		//rb.keyRelease(KeyEvent.VK_DOWN);
		//rb.keyRelease(KeyEvent.VK_DOWN);
		//rb.keyRelease(KeyEvent.VK_DOWN);
		
		//rb.keyRelease(KeyEvent.VK_ENTER);
		 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='form-control inputTxtLarge widgetCalenderTxt']")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Day' and text()='5']")).click();
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//select[@class='form-control selectLarge width100']"));
		 ele.click();
		Select sel = new Select(ele);
		sel.selectByValue("2A");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gi_search_btn']")).click();
		Thread.sleep(2000);
		
		
		
		
	}
}
