package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Roleofjavascript 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\user\\ProgremsBasicsIQ\\SeleniumPractice\\resourse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.Yatra.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//h2[text()='Popular Hotel Destinations in India']")));
		Thread.sleep(3000);
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//li[@class='lable_ourFamily' and text()='Our Family']")));
		
	}
}
