package Seleniun_Bases;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirefoxNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.google.com/";
		//driver.get(url);
		driver.navigate(). to (url);

	}

}
