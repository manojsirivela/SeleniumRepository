import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KKK {

	public static void main(String[] args) {
	

			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			WebDriver page=new ChromeDriver();
			page.get("https://selenium.dev");
			page.manage().window().maximize()
	}

}
