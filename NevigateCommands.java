import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NevigateCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","D:\\automation practical 4th march\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
//		1. To open the url we can use navigate.to method
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");	
	
//		2. To refresh the page
		driver.navigate().refresh();
		
//		3.To redirect on one step back
		WebElement flight = driver.findElement(By.linkText("Flights"));
		flight.click();
		Thread.sleep(1000);
		driver.navigate().back();
		
//		4. to redirect on one step forward
		driver.navigate().forward();
	
	
	}

}
