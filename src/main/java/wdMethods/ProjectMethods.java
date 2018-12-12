package wdMethods;

import org.junit.Test;

import org.openqa.selenium.WebElement;

public class ProjectMethods extends SeMethod {

	@Test
	public void login()
	{
		startApp("chrome","http://leaftaps.com/opentaps");
		WebElement eleUser = locateElement("id", "username");
		type(eleUser, "DemoSalesManager");
		WebElement elePass = locateElement("id", "password");
		type(elePass, "crmsfa");
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
	}


}