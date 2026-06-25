package HandlingMutlipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import LearningLocator.webElement;

public class HandleWebTable {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
        driver.get("https://vinothqaacademy.com/webtable/");
        
        //print 3rows employee name
       
        WebElement element = driver.findElement(By.xpath("//table[@id='myTable']/tbody/tr[3]/td[2]"));
        System.out.println(element.getText());
        
        //all employee name details
        System.out.println("-------------------------------");
        List<WebElement> employee= driver.findElements(By.xpath("//table[@id='myTable']//tr/td[2]"));
        for(WebElement name:employee){
        System.out.println(name.getText());
        }
        
        //3 row employee details
        System.out.println("-------------------------------");
        List<WebElement> alldetails = driver.findElements(By.xpath("//table[@id='myTable']//tr[3]/td"));
       for(WebElement records:alldetails) {
    	   System.out.println(records.getText());   
       }
        driver.close();
	}

}
