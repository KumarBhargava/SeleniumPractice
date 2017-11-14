package sel;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Oyorooms
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TYSS\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.oyorooms.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		System.out.println(" 1");
		
		Actions act = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//a[@href='/oyos-in-delhi']"));
		act.moveToElement(ele).perform();
		WebElement element = driver.findElement(By.xpath("(//span[@class='js-md-location-link ember-view'])[6]"));
		act.moveToElement(element).click().perform();
		Thread.sleep(2000);
		
		System.out.println("2");
		driver.findElement(By.xpath("//div/div[@class='searchbar__checkin']")).click();
		
		
			driver.findElement(By.xpath("//div//button[2][@class='pika-next']")).click();
			
			driver.findElement(By.xpath("(//div//button[@class='pika-button pika-day' and text()='28'])[1]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@class='searchbar__searchButton']")).click();
		    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");
		    WebElement priceSlider = driver.findElement(By.xpath("//div[@class='EmberRangeSlider-handle EmberRangeSlider-handle--end ember-view']"));
		   // WebElement priceSlider = driver.findElement(By.xpath("//div[@class='EmberRangeSlider-handle EmberRangeSlider-handle--start ember-view']"));
		    Dimension slidersize = priceSlider.getSize();
		    int sliderwidth = slidersize.getWidth();
		    int xcordinate = priceSlider.getLocation().getX();
		    System.out.println(xcordinate);
		    Actions action = new Actions(driver);
		    action.clickAndHold(priceSlider).moveByOffset(sliderwidth -100, 0).release().build().perform();
		    Thread.sleep(2000);
		   // driver.close();
		   WebElement oyo = driver.findElement(By.xpath("//a[@href='/']"));
		   action.contextClick(oyo).perform();
		   Robot rb = new Robot();
		   rb.keyPress(KeyEvent.VK_T);
		   rb.keyRelease(KeyEvent.VK_T);
		   
		    
		

}
}
