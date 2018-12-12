package day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Screenshot
		
		/*driver.get("https://www.guru99.com/introduction-to-selenium.html");
		Thread.sleep(6000);		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File loc = new File("./scrnshots/test1.png");
		FileUtils.copyFile(src, loc);*/
		
		//PROMPT
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_state_switch4");
		Thread.sleep(3000);
				
		driver.switchTo().frame("//iframe[@id = 'iframeResult']");
				
		driver.findElementByXPath("//button[text()[contains(. , 'Try it')]]").click();
				
	}

}
