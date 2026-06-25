package LearnScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//1. typecasting
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//2.and 3. calling reference ts
		File temppath =ts.getScreenshotAs(OutputType.FILE);
		
		//4. permanent path
		File permanentpath = new File("./src/test/resources/TestScreenshot/Screenshot.png");
		
		//5.
	
			try {
				FileHandler.copy(temppath, permanentpath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		


	}

}
