package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {

	//Declaration
	
	@FindBy(xpath ="//div[@class='navbar-header']")
	private WebElement pageHeader;
	
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath ="//span/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	
	@FindBy(name = "addresstype")
	private WebElement categoryDD;
	
	@FindBy(xpath ="//a[text()='Contact Us']")
	private WebElement contactUsLink;
	
	//Initialization
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	/**
	 * This method returns page Header Text
	 * @return
	 */
	
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	/**
	 * This method is used to mouse hover course tab
	 * @param web
	 */

	public void mouseHoverToCourse(WebDriverUtility web) {
		web.mouseHover(courseTab);
	}
	
	/**
	 * This method is used to click on selenium training
	 */
	
	public void clickSeleniumTraining() {
		seleniumTrainingLink.click();
	}
	
	/**
	 * This method is used to select category
	 * @param web
	 * @param index
	 */
	
	public void selectCategory(WebDriverUtility web , int index) {
		web.dropdown(categoryDD,index);
	}
	
	/**
	 * This method returns contact us link
	 * @return
	 * @param index
	 */
	public WebElement getContactUsLink() {
		return contactUsLink;
	
	}
	
	/**
	 * This method is used to click on contact Us link 
	 */
public void clickContactUs() {
	contactUsLink.click();
}
}

