package Dmedicina;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vida_Sana_Alimentacion {

	public static void Seleccionar_opcion(WebDriver driver, String option) throws Exception {

		switch(option)
		{
			case "Diccionario de alimentación":
			{
			    driver.findElement(By.xpath("//section/h2/a")).click();
				break;
			}
			case "Dietas":
			{
				driver.findElement(By.xpath("//section[2]/h2/a")).click();
				break;
			}
			case "Nutrición":
			{
				driver.findElement(By.xpath("//section[3]/h2/a")).click();
				break;
			}
			case "Recetas":
			{
				driver.findElement(By.xpath("//section[4]/h2/a")).click();
				break;
			}
			
		}	
	}
}
