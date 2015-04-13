package Dmedicina;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Login {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		
		driver = AbrirChrome.Open();
		
	}

	@After
	public void tearDown() throws Exception {
		
		driver.close();
		
	}

	@Test
	public void testVolver() throws Exception {
		
		Cabecera.Seleccionar_opcion(driver, "Iniciar sesión");
		Login.Volver(driver);
	}

	@Test
	public void testLogin_Correcto_User() throws Exception {
		
		Cabecera.Seleccionar_opcion(driver, "Iniciar sesión");
		Login.Entrar("dmedicina@mailinator.com", "dmedicina", driver);
		assertTrue(driver.findElement(By.xpath("//ul[@id='sesion']/li")).getText().contains("¡Hola"));
		
	}
	/*
	@Test
	public void testLogin_Correcto_Experto() throws Exception {
		
		Cabecera.Seleccionar_opcion(driver, "Iniciar sesión");
		Login.Entrar("experto1@dmedicina.com", "experto1", driver);
		assertTrue(driver.findElement(By.xpath("//ul[@id='sesion']/li")).getText().contains("¡Hola"));
		
	}
*/
	@Test
	public void testLogin_Erroneo() throws Exception {
		
		Cabecera.Seleccionar_opcion(driver, "Iniciar sesión");
		Login.Entrar("aaaa", "aaaa", driver);
	
	}
}
