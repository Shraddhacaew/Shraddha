import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","D:\\automation practical 4th march\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
//		WebElement login = driver.findElement(By.id("u_0_5_mD"));
//		
		
		username.sendKeys("shraddhamehta23@gmail.com");
		password.sendKeys("jung0109kook");
		
//		login.click();

	}

}
