package testIRCTC;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


public class sqaTest1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByLinkText("AGENT LOGIN").click();
		driver.findElementByLinkText("Contact Us").click();
		
		//Window Handles
		Set<String> Win = driver.getWindowHandles();
		List<String> List = new ArrayList<String>();
		List.addAll(Win);
		
		for (String win : List) 
		{
			System.out.println(win);
		}
		
		driver.switchTo().window(List.get(1));
		
		String winTitle = driver.getTitle();
		System.out.println(winTitle);
		
		Win = driver.getWindowHandles();
		List.addAll(Win);
		
		//Close Parent Window
		driver.switchTo().window(List.get(0)).close();
		
		//Close All Windows
		driver.quit();		
		
	}

}

