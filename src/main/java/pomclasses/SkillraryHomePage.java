package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains elements and respective business libraries of skillrary homepage
 * @author vikas
 *
 */

public class SkillraryHomePage {

	//Declaration
	@FindBy(xpath = "//img[@alt='SkillRary']")
	private WebElement logo;
	
	@FindBy(xpath = "//ul[contains(@class,'home_menu')]/li[1]")
	private WebElement languageIcon;
	
	@FindBy(xpath ="//ul[contains(@class,'home_menu')]/li[1]")
	private WebElement english;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearstab;
	
	@FindBy(xpath ="//ul[@class='dropdown-menu gear_menu']//a[@class='ignorelink'][normalize-space()='SkillRary Demo APP']")
	private WebElement skillraryDemoAppLink;
	
	//Initialization
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	/**
	This method returns logo
	@return
	*/
	
	public WebElement getLogo() {
		return logo;
	}
	
	/**This method is used to english as default language
	 */
	
	public void chooseEnglish() {
		languageIcon.click();
	}
	
	/**
	 * This method is used to click on gears tab
	 */
	
	public void clickGearsTab() {
		gearstab.click();
	}
	
	/**This method is used to click on skilrarydemo app link
	 */
	public void clickSkillraryDemoAppLink() {
		skillraryDemoAppLink.click();
	}
	
	}
	
	
	