package Dmedicina;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbrirChrome {

	static InputStream ficheroLogin = null; 
	static String user = "";
	static String pass = "";
	static String URL = "";
	static Properties propiedadesLogin = new Properties();
	
	
	public static WebDriver Open() throws IOException 
	{
		
		ficheroLogin = new FileInputStream("Recursos.properties");
		
		//Se cargan las propiedades
		propiedadesLogin.load(ficheroLogin);
		URL = propiedadesLogin.getProperty("URL");
		
		//ChromeDriverManager.setup();
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//driver = new HtmlUnitDriver();
		//driver = new ChromeDriver();
/*
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		ChromeOptions options = new ChromeOptions();
		//Se parametriza para que se ejecute el chrome portable
		//options.setBinary("chrome-win32/chrome.exe");
		//Se selecciona que el idioma sea ingles
		options.addArguments("--lang=en");
		
		capabilities.setCapability("chrome.binary", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		//driver = new OperaDriver(capabilities);
		driver = new ChromeDriver(capabilities);
		//driver = new Opera
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //DESARROLLO driver.get("http://portal-kobudev.paaspre.lvtc.gsnet.corp/portal");
		//PRE 
		 */
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);//"http://portal2-kobu.paaspre.lvtc.gsnet.corp/portal/login.jsp");	

        //driver.get("http://portal2-kobu.paaspre.lvtc.gsnet.corp/portal/login.jsp");	
		//local driver.get("http://paaspre.lvtc.gsnet.corp:8080/portal");
		return driver;
		
	}

}
