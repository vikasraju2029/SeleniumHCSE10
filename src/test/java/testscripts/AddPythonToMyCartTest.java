package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class AddPythonToMyCartTest extends BaseClass {
	
	@Test
	public void sendContactDetailsTest () {
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.switchToChildBrowser();
		
		soft.assertTrue(demoApp.getPageHeader().contains("ECommerce"));
		
		demoApp.selectCategory(web, 1);
		
		soft.assertEquals(testing.getpageheader(), "Testing");
		
		web.scrollTillelement(testing.getpythoniamge());
		web.dragAndDropElement(testing.getpythoniamge(),testing.getcartarea());
		
		web.scrollTillelement(testing.getfacebookicon());
		testing.getfacebookicon();
		
		soft.assertAll();

}
}
