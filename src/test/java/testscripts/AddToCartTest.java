package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class AddToCartTest extends BaseClass {
	
	@Test
	public void addToCartTest() {
		
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.switchToChildBrowser();
		
		soft.assertTrue(demoApp.getPageHeader().contains("ECommerce"));
		
		demoApp.mouseHoverToCourse(web);
		demoApp.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getpagegeader(),"Selenium Training");
		
		int initialQuantity = Integer.parseInt(selenium.getquantity());
		selenium.doubleclickplusbutton(web);
		int finalQuantity = Integer.parseInt(selenium.getquantity());
		
		soft.assertEquals(finalQuantity, initialQuantity+1);
		
		selenium.clickaddtocart();
		web.handleAlert("ok");
		soft.assertEquals(selenium.getitemaddmessage(), "Item added to cart");
		
		soft.assertAll();
	}
	
}