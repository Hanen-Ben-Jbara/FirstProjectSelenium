package JunitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitsAssert {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("avant tous les cas de test");
		WebDriverManager.chromedriver().setup();
		
	}
	@Before
	public void beforeTest(){
		System.out.println("avant chaque cas de test");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://"+ System.getProperty("user.dir") +"/src/main/resources/applications/interaction.html");
	}	
	@After
	public void AfterTest() {
		driver.close();
	}

@Test
	public void test01() {
	
		String title_obtenu = driver.getTitle();
		String title_attendu = "Interactive Elements";
		
		assertEquals("Interactive Elements", title_obtenu ,title_attendu );
		System.out.println("test réussi");
}
@Test
	public void Test02() {

	String title_obtenu = driver.getTitle();
	String title_attendu = "Interactive Elements";
	
	assertTrue("le titre n'est pas correct", title_obtenu.equals(title_attendu));
	System.out.println("test réussi");	
}
	public void Test03() {
		
		String title_obtenu = driver.getTitle();
		String title_attendu = "Interactive Elements";
		
		assertSame("le titre n'est pas correct", title_obtenu, title_attendu);
		System.out.println("test réussi");

	}
}

