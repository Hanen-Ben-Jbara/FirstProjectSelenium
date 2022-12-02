package LocalisationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationAccessXpath {
	
	ChromeDriver driver = new ChromeDriver();
	
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  LocationAccessXpath m = new LocationAccessXpath(); 
	  m.openurl();
	  m.findElementbyID();
	  
	  }
	 	
		public void openurl()
		{
		WebDriverManager.chromedriver().setup();	
		driver.manage().window().maximize();
		driver.get("file://"+ System.getProperty("user.dir") +"/src/main/resources/applications/interaction.html");
		}
		public void findElementbyID()
	{
		WebElement titreElement = driver.findElement(By.id("TitlePage"));
		System.out.println(titreElement.getText());
	}

}
