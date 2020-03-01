package february16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicJavaSeleniumCode2 {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neha Shukla\\Downloads\\chromedriver.exe");//This acts as an intermediate between the chrome browser and the url
		
		WebDriver driver=new ChromeDriver();//This line just initiates the browser
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");//This line gets the given URL 
		driver.findElement(By.name("first_name"));//We have user "Name" element locator of selenium
		WebElement tb=driver.findElement(By.name("first_name"));//The value of the "Name" element is stored in the tb object
		tb.sendKeys("JHON");//The value is being passed to the object
		
		WebElement tb2=driver.findElement(By.name("last_name"));
		tb2.sendKeys("SMITH");
		
		driver.findElement(By.name("email")).sendKeys("Smithjhons155@GMAIL.COM");
		driver.findElement(By.name("phone")).sendKeys("8999515986");//Why is double quotes required its not a string
		driver.findElement(By.name("address")).sendKeys("MAGARPATTA A403");
		driver.findElement(By.name("city")).sendKeys("PUNE");
		
		
		//driver.findElement(By.className("form-control selectpicker")).click();
		Select state= new Select(driver.findElement(By.name("state")));
		state.selectByVisibleText("Arkansas");
		state.selectByIndex(1);
		
		driver.findElement(By.name("zip")).sendKeys("486889");
		driver.findElement(By.name("website")).sendKeys("RADICAL");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		
		// RADIO BUTTON CODE
		
		List<WebElement> list = driver.findElements(By.name("hosting"));
		System.out.println(list.size());
		System.out.println(list);
		list.get(0).click();
				
		driver.findElement(By.name("comment")).sendKeys("TESTING THE SELENIUM KNOWLEDGE");
		
		driver.findElement(By.linkText("Selenium Easy")).click();
		
		/*driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
		driver.findElement(By.name("title")).sendKeys("Test User");
		driver.findElement(By.id("description")).sendKeys("TESTING COMMENTS");*///Why this is not getting searched by Name locator??
		
		
		
		

	}

}
