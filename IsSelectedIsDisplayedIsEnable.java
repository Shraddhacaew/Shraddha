import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManagerOutput.Result;

public class IsSelectedIsDisplayedIsEnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","D:\\automation practical 4th march\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
	
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
	
//		boolean result = username.isDisplayed();
//		boolean result1 =username.isEnabled();
//		System.out.println(result);
//		System.out.println(result1);
//	
		
//		Is Displayed method is used to variable element is present or not
		if(username.isDisplayed()&& username.isEnabled())
		{
			username.sendKeys("Lovely");
			
		}
		else 
		{
			System.out.println("User is not displayed");
		}
		
		if(password.isDisplayed()&& password.isEnabled())
		{
			password.sendKeys("Lovely123");
		}
		else
		{
		System.out.println("Password is not displayed");	
		}
		
		WebElement Checkbox = driver.findElement(By.id("persist_box"));
		
//		IsSelected method is used to validate checkbox or radio button is already selected or not
		boolean result =Checkbox.isSelected();
		System.out.println(result);
	
	}

}
