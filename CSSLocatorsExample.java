import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.chrome.driver","D:\\automation practical 4th march\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
	
//		/3. By using 
		
		
		
//		5. By using tag id and attributes
		
//		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type='submit'][value='log In']"));
//		login.click();
		
		
		
//		6. By using starts with
		
		WebElement un = driver.findElement(By.cssSelector("input[name^='ema']"));
		un.sendKeys("Lovely");
		
//		7. By using end with - i
		
		WebElement pass = driver.findElement(By.cssSelector("input[type$='word']"));
		pass.sendKeys("Lovely");
		
//		8. By using the contains - it will find the locators based on character which is present or not
		
		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
		login.click();
	}

}
