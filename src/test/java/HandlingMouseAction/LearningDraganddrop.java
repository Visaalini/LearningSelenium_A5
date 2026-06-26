package HandlingMouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class LearningDraganddrop {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://vinothqaacademy.com/mouse-event/");
		  
		 Actions act = new Actions(driver);
		 
		  WebElement drag = driver.findElement(By.id("dragItem"));
		  WebElement drop = driver.findElement(By.id("dropZone"));
		  
		  //perform drag and drop 
		  //act.dragAndDrop(drag, drop).perform();

		  //Alternative Method
		  act.clickAndHold(drag).release(drop).perform();
		  
		  //context Click
		  
		  WebElement right = driver.findElement(By.id("rightBtn"));
		  act.contextClick(right).perform();
		  
		  //double click
		  
		  WebElement double1 = driver.findElement(By.id("doubleBtn"));
		  act.doubleClick(double1).perform();
		  
		  //hover click
		  WebElement hover = driver.findElement(By.id("tooltipTarget"));
		  act.moveToElement(hover).perform();
		  
		  
		  //slider Click 
		  act.dragAndDropBy(driver.findElement(By.id("handle_max")), 150, 0).perform();
		
		  //Scrolling
		  act.scrollByAmount(0, 500).perform();
		  
		  act.scrollToElement(hover).perform();
		  
		  act.scrollFromOrigin(ScrollOrigin.fromElement(hover),0, 500).perform();
		  
		  
	}
}
