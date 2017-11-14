package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_on_Element_of_dymanic_tabel
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\user\\ProgremsBasicsIQ\\SeleniumPractice\\resourse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/Tabels/Link_tabel.html");
		WebElement ele = driver.findElement(By.xpath("//tbody"));
		ele.findElement(By.xpath("//a[contains(.,'K')]")).click();
	}
}
