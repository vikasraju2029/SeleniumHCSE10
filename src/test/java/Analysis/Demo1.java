package Analysis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\Downloads\\chromedriver_win32  se 4\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open an empty Chrome browser window
        driver.get("https://www.google.com/");
System.out.println(driver.getTitle());
        // Quit the driver and close all associated windows
        driver.quit();
    }
}
