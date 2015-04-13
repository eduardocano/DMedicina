package Dmedicina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Familia_y_Embarazo_Embarazo {

	public static void Seleccionar_opcion(WebDriver driver, String option) throws Exception 
	{
		switch(option)
		{
			case "Diccionario de embarazo":
			{
			    driver.findElement(By.xpath("//section/h2/a")).click();
				break;
			}
			case "Consejos":
			{
				driver.findElement(By.xpath("//section[2]/h2/a")).click();
				break;
			}
			case "Etapas":
			{
				driver.findElement(By.xpath("//section[3]/h2/a")).click();
				break;
			}
			case "Embarazo":
			{
				driver.findElement(By.xpath("//section[4]/h2/a")).click();
				break;
			}
		}	
	}
	
	
}
