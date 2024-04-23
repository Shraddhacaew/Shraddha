import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.TypeResolutionStrategy.Passive;

public class RelativeXpathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","D:\\automation practical 4th march\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
	
//		1. Using simple xpath method by using tag and attributes.
//		
//		WebElement un =driver.findElement(By.xpath("//input[@id='email']"));
//		WebElement pass =driver.findElement(By.xpath("//input[@type='password']"));
//		WebElement login =driver.findElement(By.xpath("//input[@value='Log In']"));
//	
		
//		2.Using and Condition
		
//		WebElement un = driver.findElement(By.xpath("//input[@type='text' and @class='inputtext']"));
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password' and @name='pass']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
//		
//		3. Using or Condition
		
//		WebElement un = driver.findElement(By.xpath("//input[@type='text1' or @class='inputtext']"));
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password' or @name='password']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In1' or @type='submit']"));
//		
//		4. Using contains method
		
//		WebElement un = driver.findElement(By.xpath("//input[contains(@type,'tex')]"));
//		WebElement pass = driver.findElement(By.xpath("//input[contains(@class,'inp')]"));
//		WebElement login = driver.findElement(By.xpath("//input[contains(@value,'Log')]"));
//		
//		5. Using 
//		un.sendKeys("Lovely");
//		pass.sendKeys("Lovely");
//		login.click();
		
		
		
		
	}

}
