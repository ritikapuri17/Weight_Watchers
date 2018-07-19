import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Selenium_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\workr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.weightwatchers.com/us/");

		String title = driver.getTitle();
		System.out.println(title);
		// Assert.assertEquals(title, expected);
		if (title.equals("Weight Loss Program, Recipes & Help | Weight Watchers")) {
			System.out.println("Pass");
		}

		else {
			System.out.println("Fail");
		}

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = driver.findElement(By.id("ela-menu-visitor-desktop-supplementa_find-a-meeting"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();

		String title2 = driver.getTitle();
		System.out.println(title2);

		String title3 = title2.substring(16, 46);

		System.out.println(title3);

		if (title3.equals("Get Schedules & Times Near You")) {
			System.out.println("Pass");
		}

		else {
			System.out.println("Fail");
		}

		driver.findElement(By.id("meetingSearch")).click();

		driver.findElement(By.id("meetingSearch")).sendKeys("10011");

		driver.findElement(By.className("input-group-btn")).click();

		WebDriverWait wait12 = new WebDriverWait(driver, 20);
		wait12.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ml-1180510']")));

		String st = driver.findElement(By.xpath("//*[@id='ml-1180510']")).getText();

		System.out.println(st.substring(0, 45));

		String message = driver.findElement(By.className("location__address")).getText();

		String message1 = message.concat(driver.findElement(By.className("location__city-state-zip")).getText());

		System.out.println("Location name of first search result:" + message1);

		driver.findElement(By.xpath("//*[@id='ml-1180510']")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("location__address")));
		String st1 = driver.findElement(By.className("location__address")).getText();

		String st3 = st1.concat(driver.findElement(By.className("location__city-state-zip")).getText());

		System.out.println(st3);

		System.out.println(
				"verifying displayed location name matches with the name of the first searched result that was clicked ");

		if (message1.equals(st3)) {
			System.out.println("Pass");
		}

		else {
			System.out.println("Fail");
		}

		JavascriptExecutor ex = (JavascriptExecutor) driver;

		ex.executeScript("window.scrollBy(600,700)");

		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.className("hours-list-item-wrapper")));
		WebElement element2 = driver.findElement(By.className("hours-list-item-wrapper"));
		System.out.println("Today's hour of operation:" + " ");
		System.out.println(element2.getText());

	}

}
