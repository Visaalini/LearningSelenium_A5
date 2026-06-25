package HandlingMutlipleElements;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import LearningLocator.webElement;

public class HandlingAutoSuggestion {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		driver.get("https://www.amazon.in/");
		
		//Take input of user
		Scanner sc= new Scanner(System.in);
		
		searchbox.sendKeys(searchdata);
		

	}

}
