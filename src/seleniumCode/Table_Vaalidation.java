package seleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Vaalidation {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("welcome to multi check box");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ratnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		Thread.sleep(5000);
		WebElement te = driver.findElement(By.xpath("/html/body/div[3]/div[1]/fieldset/legend"));
		String tee = te.getText();
		System.out.println("The text printed as...."+ " " +tee);
		Thread.sleep(5000);
		
//		Table validation
		WebElement table = driver.findElement(By.id("product"));

//		verify tr
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int si = rows.size();
		System.out.println(si);
		for(WebElement row:rows) {
//			verify the table data
			List<WebElement> data = row.findElements(By.tagName("td"));
			int sis = data.size();
			System.out.println("The table data"+" "+sis);
			for(WebElement cells:data) {
				String text = cells.getText();
				System.out.println(text);
			}
		}
		
	}

}
