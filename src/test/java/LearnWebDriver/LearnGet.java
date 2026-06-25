package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnGet {

	public static void main(String[] args) {
		//step:1 Open the browser
		WebDriver driver = new EdgeDriver();
		//step 2: Nav to App to URl
		driver.get("https://in.indeed.com/");
		//step3: close the browser
		driver.close();
		
		System.out.println("Excecution done by vishal");
		
	}

}
