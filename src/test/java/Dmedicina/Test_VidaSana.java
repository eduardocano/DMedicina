package Dmedicina;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Test_VidaSana {

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
	public void Test_Vida_Sana() throws Exception {
		
		Cabecera.Seleccionar_opcion(driver, "Vida Sana");
		//assertEquals("Deporte", driver.findElement(By.xpath("//a[contains(text(),'Deporte')]")).getText());
	    assertEquals("Deporte", driver.findElement(By.linkText("Deporte")).getText());
	    assertEquals("Belleza", driver.findElement(By.linkText("Belleza")).getText());
	    assertEquals("Sexualidad", driver.findElement(By.linkText("Sexualidad")).getText());
	    assertEquals("Alimentación", driver.findElement(By.linkText("Alimentación")).getText());
	    
	    
	}
	@Test
	public void Test_Vida_Sana_Alimentacion() throws Exception {
		
		Cabecera.Seleccionar_opcion(driver, "Vida Sana");
	    assertEquals("Deporte", driver.findElement(By.linkText("Deporte")).getText());
	    assertEquals("Belleza", driver.findElement(By.linkText("Belleza")).getText());
	    assertEquals("Sexualidad", driver.findElement(By.linkText("Sexualidad")).getText());
	    assertEquals("Alimentación", driver.findElement(By.linkText("Alimentación")).getText());
	    
	    Vida_Sana.Seleccionar_opcion(driver, "Alimentación");
	    assertEquals("Alimentación", driver.findElement(By.cssSelector("h1")).getText());
	    
	    Thread.sleep(1000);
	    Vida_Sana_Alimentacion.Seleccionar_opcion(driver, "Diccionario de alimentación");
	    assertEquals("Diccionario de alimentación", driver.findElement(By.cssSelector("h1")).getText());
	    
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Alimentación");
		Vida_Sana_Alimentacion.Seleccionar_opcion(driver, "Dietas");
		assertEquals("Dietas", driver.findElement(By.cssSelector("h1")).getText());
		
		/* Eliminada por el bug 0003287
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Alimentación");
		Vida_Sana_Alimentacion.Seleccionar_opcion(driver, "Tipos de alimentación");
		assertEquals("Tipos de alimentación", driver.findElement(By.cssSelector("h1")).getText());
		 */
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Alimentación");
		Vida_Sana_Alimentacion.Seleccionar_opcion(driver, "Nutrición");
		assertEquals("Nutrición", driver.findElement(By.cssSelector("h1")).getText());
		
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Alimentación");
		Vida_Sana_Alimentacion.Seleccionar_opcion(driver, "Recetas");
		assertEquals("Recetas", driver.findElement(By.cssSelector("h1")).getText());

	}
	
	@Test
	public void Test_Vida_Sana_Deporte() throws Exception {
		
		Cabecera.Seleccionar_opcion(driver, "Vida Sana");
	    assertEquals("Deporte", driver.findElement(By.linkText("Deporte")).getText());
	    assertEquals("Belleza", driver.findElement(By.linkText("Belleza")).getText());
	    assertEquals("Sexualidad", driver.findElement(By.linkText("Sexualidad")).getText());
	    assertEquals("Alimentación", driver.findElement(By.linkText("Alimentación")).getText());
	    
	    Vida_Sana.Seleccionar_opcion(driver, "Deporte");
	    assertEquals("Deporte", driver.findElement(By.cssSelector("h1")).getText());
	    
	    Thread.sleep(1000);
	    Vida_Sana_Deporte.Seleccionar_opcion(driver, "Diccionario de deporte");
	    assertEquals("Diccionario de deporte", driver.findElement(By.cssSelector("h1")).getText());
	    
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Deporte");
		Vida_Sana_Deporte.Seleccionar_opcion(driver, "Ejercicio físico");
		assertEquals("Ejercicio físico", driver.findElement(By.cssSelector("h1")).getText());
		
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Deporte");
		Vida_Sana_Deporte.Seleccionar_opcion(driver, "Gimnasias suaves");
		assertEquals("Gimnasia", driver.findElement(By.cssSelector("h1")).getText());
	/*
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Deporte");
		Vida_Sana_Deporte.Seleccionar_opcion(driver, "Entrenador personal");
		assertEquals("Entrenador personal", driver.findElement(By.cssSelector("h1")).getText());
		*/
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Deporte");
		Vida_Sana_Deporte.Seleccionar_opcion(driver, "Bienestar");
		assertEquals("Bienestar", driver.findElement(By.cssSelector("h1")).getText());
	}
	
	@Test
	public void Test_Vida_Sana_Belleza() throws Exception {
		
		Cabecera.Seleccionar_opcion(driver, "Vida Sana");
	    assertEquals("Deporte", driver.findElement(By.linkText("Deporte")).getText());
	    assertEquals("Belleza", driver.findElement(By.linkText("Belleza")).getText());
	    assertEquals("Sexualidad", driver.findElement(By.linkText("Sexualidad")).getText());
	    assertEquals("Alimentación", driver.findElement(By.linkText("Alimentación")).getText());
	    
	    Vida_Sana.Seleccionar_opcion(driver, "Belleza");
	    assertEquals("Belleza", driver.findElement(By.cssSelector("h1")).getText());
	    
	    Thread.sleep(1000);
	    Vida_Sana_Belleza.Seleccionar_opcion(driver, "Diccionario de belleza");
	    assertEquals("Diccionario de belleza", driver.findElement(By.cssSelector("h1")).getText());
	    
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Belleza");
		Vida_Sana_Belleza.Seleccionar_opcion(driver, "Cuidados faciales");
		assertEquals("Cuidados faciales", driver.findElement(By.cssSelector("h1")).getText());
		
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Belleza");
		Vida_Sana_Belleza.Seleccionar_opcion(driver, "Cuidados del cuerpo");
		assertEquals("Cuidados del cuerpo", driver.findElement(By.cssSelector("h1")).getText());
	
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Belleza");
		Vida_Sana_Belleza.Seleccionar_opcion(driver, "Cuidados del pelo");
		assertEquals("Cuidados del pelo", driver.findElement(By.cssSelector("h1")).getText());
		
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Belleza");
		Vida_Sana_Belleza.Seleccionar_opcion(driver, "Cirugía y medicina estética");
		assertEquals("Cirugía y medicina estética", driver.findElement(By.cssSelector("h1")).getText());
		/*
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Belleza");
		Vida_Sana_Belleza.Seleccionar_opcion(driver, "Belleza de novias");
		assertEquals("Belleza de novias", driver.findElement(By.cssSelector("h1")).getText());*/

	}
	
	@Test
	public void Test_Vida_Sana_Sexualidad() throws Exception {
		
		Cabecera.Seleccionar_opcion(driver, "Vida Sana");
	    assertEquals("Deporte", driver.findElement(By.linkText("Deporte")).getText());
	    assertEquals("Belleza", driver.findElement(By.linkText("Belleza")).getText());
	    assertEquals("Sexualidad", driver.findElement(By.linkText("Sexualidad")).getText());
	    assertEquals("Alimentación", driver.findElement(By.linkText("Alimentación")).getText());
	    
	    Vida_Sana.Seleccionar_opcion(driver, "Sexualidad");
	    assertEquals("Sexualidad", driver.findElement(By.cssSelector("h1")).getText());
	    
	    Thread.sleep(1000);
	    Vida_Sana_Sexualidad.Seleccionar_opcion(driver, "Diccionario de sexualidad");
	    assertEquals("Diccionario de sexualidad", driver.findElement(By.cssSelector("h1")).getText());
	    
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Sexualidad");
		Vida_Sana_Sexualidad.Seleccionar_opcion(driver, "Sexualidad masculina");
		assertEquals("Sexualidad masculina", driver.findElement(By.cssSelector("h1")).getText());
		
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Sexualidad");
		Vida_Sana_Sexualidad.Seleccionar_opcion(driver, "Sexualidad femenina");
		assertEquals("Sexualidad femenina", driver.findElement(By.cssSelector("h1")).getText());
	
		Thread.sleep(1000);
		Vida_Sana.Seleccionar_opcion(driver, "Sexualidad");
		Vida_Sana_Sexualidad.Seleccionar_opcion(driver, "Pareja");
		assertEquals("Pareja", driver.findElement(By.cssSelector("h1")).getText());

	}
}
