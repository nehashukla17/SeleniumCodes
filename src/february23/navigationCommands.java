package february23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationCommands {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neha Shukla\\Downloads\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
/*	    driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Selenium Easy")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    Thread.sleep(2000);
	    driver.navigate().to("https://www.toolsqa.com/selenium-tutorial/");//Navigate To works same as get command
	    
	    //Find AllLinks
	   List<WebElement> allLinks= driver.findElements(By.tagName("a"));
	   System.out.println(allLinks);
	   for(WebElement link: allLinks){
		   System.out.println(link.getText() + "-->" + link.getAttribute("href"));
	   }*/
	   //Format of creating XPath "//tagName[@locator='locatorValue']"-> Relative XPath
	   
	   driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("TESTSELENIUM");//USING @NAME LOCATOR
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@attribute='yes']")).click();//USING @ATTRIBUTE LOCATOR
	   
	   //When the name, id, attribute is not present
	   
	   driver.findElement(By.xpath("//button[contains(text(), 'Show Message')]")).click();
	}

}
