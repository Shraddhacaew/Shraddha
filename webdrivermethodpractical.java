import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethodpractical {
	

	public static void main(String[] args) {
		
//		This method will help you to the browser path which we need to use to run the automation script.
		
		System.setProperty("Webdriver.chrome.driver","D:\\automation practical 4th march\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
//		to create chromedriver object we need to create Webdriver interface reference variable and need to create object for browser.
		
		WebDriver driver = new ChromeDriver();
		
//		1. get() - This method will help you to open the any URL.
		
		driver.get("https://www.google.com/");
		
//		3. to get the title od current opened URL we can use get title method. 
		
		String title = driver.getTitle();
		System.out.println(title);
	
//		4. To get the currently opened url we can use get current url method.
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
//		5. To get the source code of opened url we can use this method get page source.
		
		String source = driver.getPageSource();
		System.out.println(source);
		
		
//		2. close()- To close the current opend URL we need to use close method.
		
//		driver.close();
		
//		6. To close the all the opened url we need to use quit method
		
		driver.quit();

	}

}
