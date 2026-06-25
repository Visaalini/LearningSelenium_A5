package HandlingJscode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearingJsCode {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		//1.use js code in typecasting
		JavascriptExecutor jseobj =(JavascriptExecutor) driver;
		
		//2.open the url
		jseobj.executeScript("window.location = arguments[0]","https://automationexercise.com/");
	
		jseobj.executeScript("history.go(0)");
		
		System.out.println(jseobj.executeScript("return document.title"));
		System.out.println(jseobj.executeScript("return document.URL"));
		
        jseobj.executeScript("arguments[0].click()",driver.findElement(By.partialLinkText("Log")));
        
        jseobj.executeScript("arguments[0].value='Vishal'",driver.findElement(By.name("name")));
        
        jseobj.executeScript("arguments[0].value='vishal25@gmail.com'",driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
        
        jseobj.executeScript("arguments[0].click()",driver.findElement(By.xpath("//button[@data-qa='signup-button']")));
        
        jseobj.executeScript("arguments[0].value='selenium123@gmail.com'",driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
        
        jseobj.executeScript("arguments[0].scrollIntoView(false)",driver.findElement(By.xpath("//h2/b[text()='Address Information']")));
        Thread.sleep(3000);
        
        //Note: IT will consider previous point for scrolling
		jseobj.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		//Note: It will consider origin point of scrolling
		jseobj.executeScript("window.scrollT0(0,500)");
		Thread.sleep(3000);

	}

}