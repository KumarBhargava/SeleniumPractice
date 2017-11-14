//Scenario : - A dynamic tabel is there in which Jhon Carter name is changing Dynamically , three click


package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_tabel 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TYSS\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/Tabels/dYNAMIC%20TABEL.HTML");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(.,'John Carter')]//..//input[@type='radio']")).click();
	}
}
