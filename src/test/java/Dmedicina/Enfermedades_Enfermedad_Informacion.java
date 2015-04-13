package Dmedicina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Enfermedades_Enfermedad_Informacion {

	public static void Seleccionar_opcion(WebDriver driver, String option) throws Exception 
	{
		switch(option)
		{
			case "Qué es":
			{
				driver.findElement(By.linkText("Qué es")).click();
				break;
			}
			case "Causas":
			{
				driver.findElement(By.linkText("Causas")).click();
				break;
			}
			case "Síntomas":
			{
				driver.findElement(By.linkText("Síntomas")).click();
				break;
			}
			case "Prevención":
			{
				driver.findElement(By.linkText("Prevención")).click();
				break;
			}
		}	
	}
	
}
