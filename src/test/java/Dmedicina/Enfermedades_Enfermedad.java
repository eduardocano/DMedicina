package Dmedicina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Enfermedades_Enfermedad {

	public static void Seleccionar_opcion(WebDriver driver, String option) throws Exception 
	{
		switch(option)
		{
			case "Información":
			{
				if (driver.findElements(By.linkText("Información")).size() > 0)
				{
					driver.findElement(By.linkText("Información")).click();
					break;
				}
			}
			case "Especialistas":
			{
				if (driver.findElements(By.linkText("Especialistas")).size() > 0)
				{
					driver.findElement(By.linkText("Especialistas")).click();
					break;
				}
			}
			case "Tratamientos":
			{
				if (driver.findElements(By.linkText("Tratamientos")).size() > 0)
				{
				    driver.findElement(By.linkText("Tratamientos")).click();
					break;
				}
			}
			case "Asociaciones":
			{
				if (driver.findElements(By.linkText("Asociaciones")).size() > 0)
				{
					driver.findElement(By.linkText("Asociaciones")).click();
					break;
				}
			}
			case "Preguntas y Respuestas":
			{
				if (driver.findElement(By.xpath("(//a[contains(text(),'Preguntas y Respuestas')])[2]")).isDisplayed())
				{
					driver.findElement(By.xpath("(//a[contains(text(),'Preguntas y Respuestas')])[2]")).click();
					break;
				}
			}
		}	
	}
	
}
