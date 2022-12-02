package LocalisationSelenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;

public class ExerciceDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demoqa.com/droppable/";	
		driver.navigate(). to(url);
		Thread.sleep(2000);
		WebElement From=driver.findElement(By.id("draggable"));
		WebElement To=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);					
		action.dragAndDrop(From, To).build().perform();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	}

}
