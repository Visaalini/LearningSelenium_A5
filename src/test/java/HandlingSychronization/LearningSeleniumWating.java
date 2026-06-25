package HandlingSychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningSeleniumWating {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		driver.get("https://www.shoppersstack.com/");

		WebElement heading = driver.findElement(By.xpath("//h3[contains(text(), 'Enjoy ')]"));
		String text = heading.getText();
		System.out.println(text);
		
		 WebElement loginbtn = driver.findElement(By.xpath("#loginBtn"));
		 loginbtn.click();
		 
		 driver.close();
		 
		
		

	}

}
