package whandles;

import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		
		//driver.findElementByXPath("//iframe[@id = 'iframeResult']");
		System.out.println("Test 1");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text() = 'Try it']").click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Baskar");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String Text1 = driver.findElementByXPath("//p[text()[contains(. , 'Baskar')]]").getText();
		System.out.println(Text1);
		
		
		System.out.println("Test 2");
		//driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text() = 'Try it']").click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Baskar");
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		String Text = driver.findElementByXPath("//p[text()[contains(. , 'User')]]").getText();
		System.out.println(Text);
		
	}

}