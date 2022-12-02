package Seleniun_Bases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sephora {

	public static void main(String[] args) {
		
		//Lancement chrome avec WebdriverManager 
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Maximiser la fenêtre
		driver.manage().window().maximize();
		
		//Ouvrir site web
		String url = "https://www.sephora.com/";	
		driver.navigate(). to(url);
		
		//Dimensionner la fenêtre
		driver.manage().window().setSize(new Dimension(1024, 700));
		
		//Récupérer la page source
		String page_source = driver.getPageSource();
		System.out.println(page_source);
		
		//Récupérer l’url actuel
		String urlactuel=driver.getCurrentUrl();
		System.out.println(urlactuel);
				
		//Récupérer le titre de la page
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//Ouvrir le site web dans même onglet de la fenêtre
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		
		//Récupérer le titre de la page
		String Title2 = driver.getTitle();
		System.out.println(Title2);
		
		//Aller à la page précédente
		driver.navigate().back();
		
		//Afficher le titre de la page en courant
		String Title3 = driver.getTitle();
		System.out.println(Title3);
		
		//Aller à la page suivante
		driver.navigate().forward();
		
		//Afficher le titre de la page en courant
		String Title4 = driver.getTitle();
		System.out.println(Title4);
		
		//Fermer l’onglet
		driver.close();
		
		//Fermer le navigateur
		driver.quit();
	}

}
