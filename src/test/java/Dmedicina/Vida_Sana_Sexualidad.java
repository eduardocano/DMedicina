package Dmedicina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vida_Sana_Sexualidad {

	public static void Seleccionar_opcion(WebDriver driver, String option) throws Exception 
	{
		switch(option)
		{
			case "Diccionario de sexualidad":
			{
			    driver.findElement(By.xpath("//section/h2/a")).click();
				break;
			}
			case "Sexualidad masculina":
			{
				driver.findElement(By.xpath("//section[2]/h2/a")).click();
				break;
			}
			case "Sexualidad femenina":
			{
				driver.findElement(By.xpath("//section[3]/h2/a")).click();
				break;
			}
			case "Pareja":
			{
				driver.findElement(By.xpath("//section[4]/h2/a")).click();
				break;
			}
			case "Cirugía y medicina estética":
			{
				driver.findElement(By.xpath("//section[5]/h2/a")).click();
				break;
			}
			case "Belleza de novias":
			{
				driver.findElement(By.xpath("//section[6]/h2/a")).click();
				break;
			}	
		}	
	}

}
