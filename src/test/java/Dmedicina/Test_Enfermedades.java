package Dmedicina;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Enfermedades {

	WebDriver driver;
	
	
	@Before
	public void setUp() throws Exception {
		
		driver = AbrirChrome.Open();
		
	}

	@After
	public void tearDown() throws Exception {
		
		//driver.close();
		
	}


	@Test
	public void testAbrir_Enfermedades() throws Exception {

		int i;
		int j;
		String Letra;
		String Enf;
		List<WebElement> Letras = null;
		List<WebElement> Enfermedad = null;
		Cabecera.Seleccionar_opcion(driver, "Enfermedades");
		//obtener todas las letras que hay
		Letras =  driver.findElements(By.xpath("/html/body/main/div/article/ul/li"));
		//Abrir todos los links de letras y comprobar que se está posiciona correctamente
		for (i=1; i<=Letras.size(); i++)
		{
			Letra = driver.findElement(By.xpath("/html/body/main/div/article/ul/li[" + i + "]/a")).getText();
			Enfermedades.Abrir_Letra(Letra, driver);
			assertEquals(Letra, driver.findElement(By.xpath("//section[2]/h2")).getText());
			Enfermedad = driver.findElements(By.xpath("/html/body/main/div/article/section[2]/div/ul/li"));
			for (j=1; j<=Enfermedad.size(); j++)
			{
				Enf = driver.findElement(By.xpath("/html/body/main/div/article/section[2]/div/ul/li[" + j + "]/a")).getText();
			  
				//Es una enfermedad
				if (!Enf.equals(Enf.toUpperCase()))
				{
					Enfermedades.Abrir_Enfermedad(Enf, driver);
					//Enfermedades_Enfermedad.Seleccionar_opcion(driver, "Información");
					//No todas las enfermedades tienen todo
					Enfermedades_Enfermedad_Informacion.Seleccionar_opcion(driver, "Qué es");
					assertEquals("Falta Que es en " + Enf, "Qué es", driver.findElement(By.cssSelector("h2.c")).getText());
					//Si tiene al menos una ficha de especialista tiene que aparecer la sección
					if (driver.findElements(By.xpath("/html/body/main/div/section[1]/article")).size() > 0)
					{
						assertTrue("Falta Especialidad en " + Enf, driver.findElement(By.xpath("//section/h2")).getText().contains("Especialistas relacionados con"));
					}
					if (driver.findElements(By.xpath("/html/body/main/div/section[2]/article")).size() > 0)
					{
						assertTrue("Falta centro medicos en " + Enf,driver.findElement(By.xpath("//section[2]/h2")).getText().contains("Centros médicos especializados en"));
					}
				    assertTrue("Falta pregunta en " + Enf,driver.findElement(By.cssSelector("h2.b")).getText().contains("¿Tienes alguna pregunta sobre"));
					/*
					
					Enfermedades_Enfermedad_Informacion.Seleccionar_opcion(driver, "Causas");
					assertEquals("Causas", driver.findElement(By.cssSelector("h2.c")).getText());
					Enfermedades_Enfermedad_Informacion.Seleccionar_opcion(driver, "Síntomas");
					assertEquals("Síntomas", driver.findElement(By.cssSelector("h2.c")).getText());
					Enfermedades_Enfermedad_Informacion.Seleccionar_opcion(driver, "Prevención");
					assertEquals("Prevención", driver.findElement(By.cssSelector("h2.c")).getText());
					*/
					//assertEquals("Qué es", driver.findElement(By.cssSelector("h2.c")).getText());
					//assertTrue("No existe link de especialista en " + Enf,driver.findElement(By.xpath("//section/h2")).getText().contains("Especialistas relacionados"));
					//assertTrue("No hay centros medicos de " + Enf, driver.findElement(By.xpath("//section[2]/h2")).getText().contains("Centros médicos especializados"));
					assertTrue(driver.findElement(By.cssSelector("h2.b")).getText().contains("¿Tienes alguna pregunta"));
					Enfermedades_Enfermedad.Seleccionar_opcion(driver, "Especialistas");
					assertEquals("Falta link de especialista de " + Enf, Enf, driver.findElement(By.cssSelector("h1")).getText());
					
					Enfermedades_Enfermedad.Seleccionar_opcion(driver, "Tratamientos");
					assertEquals("Falta link de Tratamientos de " + Enf, Enf, driver.findElement(By.cssSelector("h1")).getText());
					
					Enfermedades_Enfermedad.Seleccionar_opcion(driver, "Asociaciones");
					assertEquals("Falta link de Asociaciones de " + Enf, Enf, driver.findElement(By.cssSelector("h1")).getText());
					
					Enfermedades_Enfermedad.Seleccionar_opcion(driver, "Preguntas y Respuestas");
					assertEquals("Haznos aquí tu pregunta sobre ".toUpperCase()+ Enf.toUpperCase(), driver.findElement(By.cssSelector("h2.b")).getText().toUpperCase());
					driver.findElement(By.xpath("(//a[contains(text(),'Enfermedades')])[2]")).click();
					//driver.findElement(By.linkText("Diccionario de Enfermedades")).click();
					Enfermedades.Abrir_Letra(Letra, driver);
				}
				//Es una patologia
				else
				{
					driver.findElement(By.xpath("/html/body/main/div/article/section[2]/div/ul/li[" + j + "]/a")).click();
					//Enfermedades.Abrir_Enfermedad(Enf, driver);
					//Enfermedades_Enfermedad.Seleccionar_opcion(driver, "Información");
					//No todas las enfermedades tienen todo
					//Enfermedades_Enfermedad_Informacion.Seleccionar_opcion(driver, "Qué es");
					//assertEquals("Falta Que es en " + Enf, "Qué es", driver.findElement(By.cssSelector("h2.c")).getText());
					//Si tiene al menos una ficha de especialista tiene que aparecer la sección
					
					if (driver.findElements(By.xpath("/html/body/main/div/section[2]/article")).size() > 0)
					{
						assertTrue("Faltan Noticias destacas en " + Enf, driver.findElement(By.xpath("//section[2]/h2")).getText().contains("Noticias destacadas sobre"));
					}
					if (driver.findElements(By.xpath("/html/body/main/div/section[3]/article")).size() > 0)
					{
						assertTrue("Falta Especialidad en " + Enf, driver.findElement(By.xpath("//section[3]/h2")).getText().contains("Especialistas relacionados con"));
					}
					if (driver.findElements(By.xpath("/html/body/main/div/section[4]/article")).size() > 0)
					{
						assertTrue("Falta centro medicos en " + Enf,driver.findElement(By.xpath("//section[4]/h2")).getText().contains("Centros médicos especializados en"));
					}
				    assertTrue("Falta pregunta en " + Enf,driver.findElement(By.cssSelector("h2.b")).getText().contains("¿Tienes alguna pregunta sobre"));
					/*
					
					Enfermedades_Enfermedad_Informacion.Seleccionar_opcion(driver, "Causas");
					assertEquals("Causas", driver.findElement(By.cssSelector("h2.c")).getText());
					Enfermedades_Enfermedad_Informacion.Seleccionar_opcion(driver, "Síntomas");
					assertEquals("Síntomas", driver.findElement(By.cssSelector("h2.c")).getText());
					Enfermedades_Enfermedad_Informacion.Seleccionar_opcion(driver, "Prevención");
					assertEquals("Prevención", driver.findElement(By.cssSelector("h2.c")).getText());
					*/
					//assertEquals("Qué es", driver.findElement(By.cssSelector("h2.c")).getText());
					//assertTrue("No existe link de especialista en " + Enf,driver.findElement(By.xpath("//section/h2")).getText().contains("Especialistas relacionados"));
					//assertTrue("No hay centros medicos de " + Enf, driver.findElement(By.xpath("//section[2]/h2")).getText().contains("Centros médicos especializados"));
					assertTrue(driver.findElement(By.cssSelector("h2.b")).getText().contains("¿Tienes alguna pregunta"));
					Enfermedades_Enfermedad.Seleccionar_opcion(driver, "Especialistas");
					assertEquals("Falta link de especialista de " + Enf, Enf.toUpperCase(), driver.findElement(By.cssSelector("h1")).getText().toUpperCase());
					
					Enfermedades_Enfermedad.Seleccionar_opcion(driver, "Tratamientos");
					assertEquals("Falta link de Tratamientos de " + Enf, Enf.toUpperCase(), driver.findElement(By.cssSelector("h1")).getText().toUpperCase());
					
					Enfermedades_Enfermedad.Seleccionar_opcion(driver, "Asociaciones");
					assertEquals("Falta link de Asociaciones de " + Enf, Enf.toUpperCase(), driver.findElement(By.cssSelector("h1")).getText().toUpperCase());
					
					Enfermedades_Enfermedad.Seleccionar_opcion(driver, "Preguntas y Respuestas");
					assertEquals("Haznos aquí tu pregunta sobre ".toUpperCase()+ Enf.toUpperCase(), driver.findElement(By.cssSelector("h2.b")).getText().toUpperCase());
					driver.findElement(By.xpath("(//a[contains(text(),'Enfermedades')])[2]")).click();
					//driver.findElement(By.linkText("Diccionario de Enfermedades")).click();
					Enfermedades.Abrir_Letra(Letra, driver);
				}
			}
			
			
			driver.findElement(By.linkText("Diccionario de Enfermedades")).click();
		}


	}
	
}
