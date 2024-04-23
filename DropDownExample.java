import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","D:\\automation practical 4th march\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		WebElement country = driver.findElement(By.name("country"));
		
		Select select = new Select(country);
		
//		1.select by visible text
		select.selectByVisibleText("CHINA");
//		
//		2. Select by value
//		select.selectByValue("BERMUDA");
//		
//		3. SELECT BY INDEX
		select.deselectByIndex(5);
		
		
	}

}
