package sel;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class Googleautosuggest
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TYSS\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.findElement(By.id("lst-ib")).sendKeys("wipro");
		Thread.sleep(2000);
	    List<WebElement> lst = driver.findElements(By.xpath("//div[@class = 'sbqs_c']"));
	    for(WebElement element: lst)
	    {
		   String actualResult = "wipro bangalore";
		   String expectedResult = element.getText();
		   System.out.println(expectedResult);
		   	if(actualResult.equals(expectedResult))
		   		{
		   			element.click();
		   		}
		  }
	    	driver.close();
	}
}
