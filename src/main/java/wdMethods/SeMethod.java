package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeMethod implements WdMethods{
	RemoteWebDriver driver;

	public void startApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();			
		} else if(browser.equalsIgnoreCase("firefox")) {			
			System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
			driver = new FirefoxDriver();
		}		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);

	}

	public WebElement locateElement(String locator, String locValue) {
		switch (locator) {
		case "id":return driver.findElementById(locValue);			
		case "class": return driver.findElementByClassName(locValue);		
		case "xpath": return driver.findElementByXPath(locValue);
		case "linktext": return driver.findElementByLinkText(locValue);
		}
		//System.out.println("This Element Located Successfully using "+locator);
		return null;
	}

	public WebElement locateElement(String locValue) {

		return null;
	}

	public void type(WebElement ele, String data) {		
		ele.sendKeys(data);
		//System.out.println("This Element typed Successfully using "+ele);
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		//System.out.println("This Element Clicked Successfully using "+ele);
		takeSnap();
	}

	public void clickWithNoSnap(WebElement ele) {
		ele.click();
		//System.out.println("This Element Clicked Successfully using "+ele);

	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		String text = ele.getText();
		return text;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
		try {
			Set<String> Win = driver.getWindowHandles();
			List<String> List = new ArrayList<String>();
			List.addAll(Win);
			driver.switchTo().window(List.get(index));
			
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			System.err.println("No such Window Exception");
		}
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}
	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;

	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.quit();

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}




}
