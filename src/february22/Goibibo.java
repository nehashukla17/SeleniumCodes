package february22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neha Shukla\\Downloads\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://newtours.demoaut.com/");
    driver.findElement(By.linkText("REGISTER")).click();
    driver.findElement(By.name("firstName")).sendKeys("Monika");
    driver.findElement(By.name("lastName")).sendKeys("Monika");
    driver.findElement(By.name("phone")).sendKeys("4364454");
    driver.findElement(By.name("userName")).sendKeys("sh.gmail.com");
    driver.findElement(By.name("address1")).sendKeys("MAGARPATTA");
    driver.findElement(By.name("city")).sendKeys("Sing");
    driver.findElement(By.name("state")).sendKeys("MP");
    driver.findElement(By.name("postalCode")).sendKeys("45565");
    driver.findElement(By.name("email")).sendKeys("TEST");
    driver.findElement(By.name("password")).sendKeys("ROOT@123");
    driver.findElement(By.name("confirmPassword")).sendKeys("ROOT@123");
    driver.findElement(By.name("register")).click();
    

}
}
