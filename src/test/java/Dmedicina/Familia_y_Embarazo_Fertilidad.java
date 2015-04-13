package Dmedicina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Familia_y_Embarazo_Fertilidad {

	public static void Seleccionar_opcion(WebDriver driver, String option) throws Exception 
	{
		switch(option)
		{
			case "Diccionario de fertilidad":
			{
			    driver.findElement(By.xpath("//section/h2/a")).click();
				break;
			}
		}
	}
}
