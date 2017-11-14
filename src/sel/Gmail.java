package sel;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("kumarmishra651@gmail.com");
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kumar bhargava");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac'and text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		Thread.sleep(5000);
		
		//get the window handels
		
//		Set<String>winIds = driver.getWindowHandles();
//		System.out.println(winIds);
//		
//		//specify the parent and child window
//		
//		String parentwindow = (String)winIds.toArray()[0];
//		System.out.println(parentwindow);
//		
//		String childwindow = (String)winIds.toArray()[1];
//		System.out.println(childwindow);
//		
//		//switch to specific window
//		
//		driver.switchTo().window(childwindow);
//		
		
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("re");
		Thread.sleep(1000);
		
		Robot rb = new Robot();
		//rb.keyPress(KeyEvent.VK_DOWN);
		
		//rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		 driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Sample");
		
		By element = By.id(":p3");
		WebElement ele = driver.findElement(element);
		ele.click();
		StringSelection ss = new StringSelection("C:\\Users\\TYSS\\Desktop\\bridge-header.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().getContents(ss);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		driver.findElement(By.id(":n6")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sent Mail']")).click();
		//String sentsource = driver.getPageSource();
		//System.out.println(sentsource);
		String senttime = driver.findElement(By.xpath("//div[@class='yW' and @id=':v6'] /../..//td[8]")).getAttribute("title");
		System.out.println(senttime);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement k = driver.findElement(By.xpath("//span[@class='gb_7a gbii']"));
		act.moveToElement(k).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("gb_71")).click();
		
		
		
	}
}
