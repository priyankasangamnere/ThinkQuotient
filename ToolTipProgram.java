package morning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","e:/geckodriver.exe"); //Set system properties for geckodriver
		WebDriver driver=new FirefoxDriver();
		driver.get("//https://www.toolsqa.com/selenium-webdriver/tooltip-in-selenium/");  //using action class method
		driver.manage().window().maximize();  //Instantiate Action Class
		
		WebElement button;
		
		button=driver.findElement(By.xpath("//div[@class='listPreview'])[1]"));
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver); //Instantiate Action Class
		act.moveToElement(button).build().perform();
		System.out.println("Toolkit Button:" +button.getText());
		Thread.sleep(3000);
		
		System.out.println("Code End");
		driver.close();
		

	}

}
