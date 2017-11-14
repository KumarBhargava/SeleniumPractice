package sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Goibibo_hotels 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
		driver.findElement(By.xpath("//input[@id='gosuggest_inputL']")).sendKeys("bhagal");
		Thread.sleep(2000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		Actions act = new Actions(driver);
		   WebElement element =driver.findElement(By.xpath("//div[@id='Home']"));
		   act.moveToElement(element).click();
		
		//WebElement ele = driver.findElement(By.xpath("//h2[Text()='Find best deals across 200,000+ hotels worldwide']"));
		//act.moveToElement(ele).click().build().perform();
		
		
		WebElement ele1 = driver.findElement(By.xpath("(//input[@class='form-control inputTxtLarge widgetCalenderTxt'])[1]"));
		ele1.click();
		
		
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Day' and text()='30']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-control inputTxtLarge widgetCalenderTxt'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='DayPicker-Day' and text()='1']")).click();
		
	
	}
}
