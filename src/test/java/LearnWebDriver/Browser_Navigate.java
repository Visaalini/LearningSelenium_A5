package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URL;
import java.net.MalformedURLException;

public class Browser_Navigate {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to(new URL("https://online.kfc.co.in/"));
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		

	}

}
