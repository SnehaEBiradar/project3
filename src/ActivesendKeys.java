import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivesendKeys {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement send=driver.switchTo().activeElement();
		send.sendKeys("admin");
		driver.close();
		
	}

}
