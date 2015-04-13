package Dmedicina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vida_Sana_Deporte 
{
	public static void Seleccionar_opcion(WebDriver driver, String option) throws Exception 
	{
		switch(option)
		{
			case "Diccionario de deporte":
			{
			    driver.findElement(By.xpath("//section/h2/a")).click();
				break;
			}
			case "Ejercicio físico":
			{
				driver.findElement(By.xpath("//section[2]/h2/a")).click();
				break;
			}
			case "Gimnasias suaves":
			{
				driver.findElement(By.xpath("//section[3]/h2/a")).click();
				break;
			}
			case "Entrenador personal":
			{
				driver.findElement(By.xpath("//section[4]/h2/a")).click();
				break;
			}
			case "Bienestar":
			{
				driver.findElement(By.xpath("//section[4]/h2/a")).click();
				break;
			}			
		}	
	}
}
