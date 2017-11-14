package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox 
{
	//static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TYSS\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/checkbox.html");
		List<WebElement>lst = driver.findElements(By.xpath("(//input[@name='vehicle'])[position()<last()-1]"));
		for(WebElement element : lst)
		{
			element.click();
		}
		
		
	}
}
