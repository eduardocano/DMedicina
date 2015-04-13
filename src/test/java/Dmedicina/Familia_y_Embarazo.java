package Dmedicina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Familia_y_Embarazo {

	public static void Seleccionar_opcion(WebDriver driver, String option) throws Exception 
	{

		switch(option)
		{
			case "Fertilidad":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Fertilidad')]")).click();
				break;
			}
			case "Embarazo":
			{
				driver.findElement(By.xpath("(//a[contains(text(),'Embarazo')])[2]")).click();
				break;
			}
			case "Parto":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Parto')]")).click();
				break;
			}
			case "Mi bebé":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Mi bebé')]")).click();
				break;
			}
			case "Mi niño":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Mi niño')]")).click();
				break;
			}
			case "Adolescencia":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Adolescencia')]")).click();
				break;
			}
			
			//[contains(text(),'Prueba')]
			
		}	
	}

}
