package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class dragAndDrop {
	public static void main(String[] args) {

		System.out.println("welcome to multi check box");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ratnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		driver.get("https://example.com"); // Replace with the URL you want to visit
		WebElement sourceElement = driver.findElement(By.id("sourceElementId")); // Replace with the appropriate selector for your source element
		WebElement targetElement = driver.findElement(By.id("targetElementId")); // Replace with the appropriate selector for your target element
		Actions actions = new Actions(driver);
		actions.perform();
		actions.clickAndHold(sourceElement).moveToElement(targetElement).release().perform();


	}

}
