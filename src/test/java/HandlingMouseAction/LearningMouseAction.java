package HandlingMouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LearningMouseAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		driver.get("https://demowebshop.tricentis.com/");
		
		//1.Step to perform mouse operation
		//1.create an object
		  Actions actionobj = new Actions(driver);
		  
		  WebElement ele1 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]"));
		  
		  
		 //2.Using ref call by using movetoElement()method
		  actionobj.moveToElement(ele1).perform();
		  
		  WebElement ele2 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Desktops')]"));
		  
		  actionobj.click(ele2).perform();
		  
		 // actionobj.moveToElement(ele2).click(ele2).perform();
		  
		  //actionobj.moveToElement(ele2).doubleClick().perform();
		  
		  actionobj.moveToElement(ele2).contextClick(ele2).perform();
		 
		  
		  //perform drag and drop action
		  
		  driver.get("https://vinothqaacademy.com/mouse-event/");
		  
		   WebElement drag = driver.findElement(By.id("dragItem"));
		   
		  

		  
		  
		  
		  
		  
				  
				  
				  
		  
		  
	}

}
