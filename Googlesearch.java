package morning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Googlesearch {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	Actions act = new Actions(driver);
	Thread.sleep(3000);
	WebElement txtbox = driver.findElement(By.xpath("//input[@name='q']"));
	act.moveToElement(txtbox).click().keyDown(Keys.SHIFT).sendKeys("Where is indore").build().perform();
	//txtbox.sendKeys(Keys.ARROW_LEFT);
	
	
	Thread.sleep(2000);
	act.moveToElement(txtbox).build().perform();
	
	
	
	System.out.println("End of Code");
	Thread.sleep(3000);
	driver.close();
	}
	
	
}
