package Dmedicina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vida_Sana {
	
	public static void Seleccionar_opcion(WebDriver driver, String option) throws Exception 
	{

		switch(option)
		{
			case "Alimentación":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Alimentación')]")).click();
				break;
			}
			case "Deporte":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Deporte')]")).click();
				break;
			}
			case "Belleza":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Belleza')]")).click();
				break;
			}
			case "Sexualidad":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Sexualidad')]")).click();
				break;
			}
			
			//[contains(text(),'Prueba')]
			
		}	
	}
}
