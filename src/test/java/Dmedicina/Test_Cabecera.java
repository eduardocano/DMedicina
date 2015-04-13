package Dmedicina;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Cabecera {

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
	public void Cabecera_Test() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		Cabecera.Seleccionar_opcion(driver, "Enfermedades");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));
		assertEquals("Diccionario de Enfermedades", driver.findElement(By.cssSelector("h1")).getText());
		Thread.sleep(1000);
		
		Cabecera.Seleccionar_opcion(driver, "Medicamentos");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));
		assertEquals("Medicamentos", driver.findElement(By.cssSelector("h1")).getText());
		Thread.sleep(1000);
		
		Cabecera.Seleccionar_opcion(driver, "Vida Sana");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));
		assertEquals("Vida Sana", driver.findElement(By.cssSelector("h1")).getText());
		Thread.sleep(1000);
		
		Cabecera.Seleccionar_opcion(driver, "Familia y Embarazo");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));
		assertEquals("Familia y Embarazo", driver.findElement(By.cssSelector("h1")).getText());
		Thread.sleep(1000);
		
		Cabecera.Seleccionar_opcion(driver, "Directorio y Citas online");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));
		assertEquals("Directorio y Citas online", driver.findElement(By.cssSelector("h1")).getText());
		Thread.sleep(1000);
		/*
		Cabecera.Seleccionar_opcion(driver, "Shopping");
		Thread.sleep(1000);
		*/
		Cabecera.Seleccionar_opcion(driver, "Preguntas y Respuestas");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));
		assertEquals("Realiza tu consulta médica online", driver.findElement(By.cssSelector("h1")).getText());
		
	}

}
