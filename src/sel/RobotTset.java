package sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotTset 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		 WebElement ele = driver.findElement(By.xpath("//a[text()='Gmail']"));
		 Actions act = new Actions(driver);
		 act.moveToElement(ele).contextClick().build().perform();
		// System.out.println();
		 Robot rb = new Robot();
		 Thread.sleep(2000);
		 rb.keyPress(KeyEvent.VK_T);
		 rb.keyRelease(KeyEvent.VK_T);
		// rb.keyPress(KeyEvent.VK_CONTROL);
		// rb.keyPress(KeyEvent.VK_T);
		 
	}
}
