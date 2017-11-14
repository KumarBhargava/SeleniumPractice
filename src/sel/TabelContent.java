package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TabelContent 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/tabel.html");
		WebElement e = driver.findElement(By.tagName("tbody"));
		List<WebElement>lst = e.findElements(By.tagName("tr"));
		//System.out.println(lst);
		
		// And iterate over them, getting the cells 
		for (WebElement row : lst) 
		{ 
			
		    List<WebElement> columns = row.findElements(By.tagName("td")); 

		    // Print the contents of each cell
		    for (WebElement col : columns)
		    { 
		        System.out.println(col.getText());
		    }
		}
	}
}
