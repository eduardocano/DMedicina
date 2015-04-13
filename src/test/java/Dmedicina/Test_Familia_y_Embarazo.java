package Dmedicina;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Familia_y_Embarazo {

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
	public void Test_Familia_y_Embarazo_Main() throws Exception {
		
		Cabecera.Seleccionar_opcion(driver, "Familia y Embarazo");
	    assertEquals("Fertilidad", driver.findElement(By.linkText("Fertilidad")).getText());
	    assertEquals("Embarazo", driver.findElement(By.linkText("Embarazo")).getText());
	    assertEquals("Parto", driver.findElement(By.linkText("Parto")).getText());
	    assertEquals("Mi bebé", driver.findElement(By.linkText("Mi bebé")).getText());
	    assertEquals("Mi niño", driver.findElement(By.linkText("Mi niño")).getText());
	    //Por la correción del bug 0003318 esta sección no debe aparecer
	    //assertEquals("Adolescencia", driver.findElement(By.linkText("Adolescencia")).getText());
	    
	}
	
	@Test
	public void Test_Familia_y_Embarazo_Fertilidad() throws Exception {
		
		Cabecera.Seleccionar_opcion(driver, "Familia y Embarazo");
	    Familia_y_Embarazo.Seleccionar_opcion(driver, "Fertilidad");
	    assertEquals("Fertilidad", driver.findElement(By.cssSelector("h1")).getText());
	    
	    Thread.sleep(1000);
	    Familia_y_Embarazo_Fertilidad.Seleccionar_opcion(driver, "Diccionario de fertilidad");
	    assertEquals("Diccionario de fertilidad", driver.findElement(By.cssSelector("h1")).getText());
	    
	}
	@Test
	public void Test_Familia_y_Embarazo_Embarazo() throws Exception {
		
		Cabecera.Seleccionar_opcion(driver, "Familia y Embarazo");
		Thread.sleep(1000);
		
	    Familia_y_Embarazo.Seleccionar_opcion(driver, "Embarazo");
	    Thread.sleep(1000);
	    assertEquals("Embarazo", driver.findElement(By.cssSelector("h1")).getText());
	    
	    Thread.sleep(1000);
	    Familia_y_Embarazo_Embarazo.Seleccionar_opcion(driver, "Diccionario de embarazo");
	    assertEquals("Diccionario de embarazo", driver.findElement(By.cssSelector("h1")).getText());
	    
		Thread.sleep(1000);
	    Familia_y_Embarazo.Seleccionar_opcion(driver, "Embarazo");
	    Familia_y_Embarazo_Embarazo.Seleccionar_opcion(driver, "Consejos");
	    Thread.sleep(1000);
		assertEquals("Consejos", driver.findElement(By.cssSelector("h1")).getText());
		
		Thread.sleep(1000);
	    Familia_y_Embarazo.Seleccionar_opcion(driver, "Embarazo");
	    Familia_y_Embarazo_Embarazo.Seleccionar_opcion(driver, "Etapas");
	    Thread.sleep(1000);
		assertEquals("Etapas", driver.findElement(By.cssSelector("h1")).getText());
	
		Thread.sleep(1000);
	    Familia_y_Embarazo.Seleccionar_opcion(driver, "Embarazo");
	    Familia_y_Embarazo_Embarazo.Seleccionar_opcion(driver, "Embarazo");
	    Thread.sleep(1000);
		assertEquals("Embarazo", driver.findElement(By.cssSelector("h1")).getText());
		
	}
}
