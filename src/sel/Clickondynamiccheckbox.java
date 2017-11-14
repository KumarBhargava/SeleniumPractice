package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickondynamiccheckbox 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/tabel%20-%20checkboc.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table//td[contains(text(),'Salaman Khan')]/../preceding-sibling::tr/td/input")).click();
	}
}
