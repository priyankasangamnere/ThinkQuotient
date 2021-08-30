package morning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Chrome {

	
		
		public static void main(String[] args)throws InterruptedException{
			// TODO Auto-generated method stub
				
				System.setProperty("webdriver.chrome.driver","e://chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://login.salesforce.com/");
				
			
				driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("Hello");
				Thread.sleep(2000);
				
				

				System.out.println("End of code");
				Thread.sleep(3000);
				driver.close();
				

		}
}
