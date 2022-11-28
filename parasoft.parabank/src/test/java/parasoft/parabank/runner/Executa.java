package parasoft.parabank.runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import parasoft.parabank.drivers.Drivers;

public class Executa extends Drivers {
	/**
	 * Metodo para abrir Navegador Chrome
	 * 
	 * @author Adilson Theodoro
	 */
	public static void abrirNavegador() {
		String navegador = "chrome";
		String url = "https://parabank.parasoft.com/parabank/register.htm";
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions = new ChromeOptions();
		driver = new ChromeDriver(chromeoptions);
		driver.get(url);
		driver.manage().window().maximize();
		
	
	}

}

