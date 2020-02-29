package february23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromDropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neha Shukla\\Downloads\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/automation-practice-form/");
	    
	    //DropDown 
	    WebElement dd= driver.findElement(By.id("continents"));
	    Select sel= new Select(dd);
	    sel.selectByVisibleText("Europe");
	    
	    // Radio Button
	    List<WebElement> list = driver.findElements(By.name("sex"));
		System.out.println(list.size());
		System.out.println(list);
		list.get(1).click();
		
		//CheckBoX Single Click 
		List<WebElement> list1 = driver.findElements(By.name("profession"));
		System.out.println(list1.size());
            for(WebElement els : list1){
             els.click();
            }	
		
		// CheckBoX Multiple Click
            List<WebElement> list2 = driver.findElements(By.name("tool"));
    		System.out.println(list2.size());
                for(WebElement els : list2){
                	if(els.getAttribute("value").contains("QTP")){
                		els.click();
                	}
                }	
        // DropDown Multiple select
             Select multipleDD= new Select(driver.findElement(By.id("continentsmultiple")));
             multipleDD.selectByIndex(1);
             multipleDD.selectByValue("AN");
             multipleDD.selectByVisibleText("North America");
             multipleDD.deselectAll();
             
             Thread.sleep(2000);
             driver.close();//To close the single browser window 
	   
	    
	    
	    

}
	}
