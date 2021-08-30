package morning;

//amazon move to element
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonsearchtext {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public static void main(String[]args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://amazon.in");
			driver.manage().window().maximize();
			
			Actions act = new Actions(driver);
			//webelement defined for readability
			Thread.sleep(3000);
			
			WebElement move = driver.findElement(By.xpath("//*[@id='nav-link-prime']/span[1]"));
			//moves the mouse over try prime
			//build and perform are required,in action since composite steps can be performed
			act.moveToElement(move).build().perform();
			//act.moveToElement(move).contextClick().build().perform();
			Thread.sleep(3000);
			//WebElement txtbox =driver.findElements(By.xpath("//input[@id='twotabsearchtextbox']"));
			
			//act.moveToElement(txtbox).click().keyDown(Keys.SHIFT).SENDkEYS("Samsung").build().perform();
			Thread.sleep(2000);
			//act.moveToelement(txtbox).doubleClick().build().perform();
			
			
			System.out.println("End of code");
			Thread.sleep(3000);
			driver.close();


	}

}
