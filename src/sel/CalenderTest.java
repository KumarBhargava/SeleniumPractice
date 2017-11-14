package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderTest
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	     
	     driver.get("http://www.Cleartrip.com");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("DepartDate")).click();
	     Thread.sleep(1000);
	     
	     while(true)
	     {
	    	 try
	    	 {
	    		driver.findElement(By.xpath("//span[.='December']/../../..//a[.='19']")).click(); 
	    		break;
	    	 }
	    	 catch(Exception e)
	    	 {
	    		 driver.findElement(By.xpath("//div/div[1]/a[@data-handler='next']")).click();
	    	 }
	     }
	     
	    String text = driver.findElement(By.xpath("//span[@class='cleartripLogo']")).getText();
	    
	    System.out.println(text);
	    
	    System.out.println("*****CALENDER POP-UP HANDELED SUCCUESSFULLY******");
	}
}
