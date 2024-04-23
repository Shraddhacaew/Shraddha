import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.chrome.driver","D:\\automation practical 4th march\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
	
		
		WebElement username = driver.findElement(By.className("inputtext"));
		WebElement password = driver.findElement(By.className("inputtext"));
		
		username.sendKeys("lovely");
		password.sendKeys("lovely123");
		
	}

}
