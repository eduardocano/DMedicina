package Dmedicina;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cabecera {

	public static void Seleccionar_opcion(WebDriver driver, String option) throws Exception {

		switch(option)
		{
			case "Enfermedades":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Enfermedades')]")).click();
				break;
			}
			case "Medicamentos":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Medicamentos')]")).click();
				break;
			}
			case "Vida Sana":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Vida Sana')]")).click();
				break;
			}
			case "Familia y Embarazo":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Familia y Embarazo')]")).click();
				break;
			}
			case "Directorio y Citas online":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Directorio y citas online')]")).click();
				break;
			}
			case "Shopping":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Shopping')]")).click();
				break;
			}
			case "Preguntas y Respuestas":
			{
				driver.findElement(By.xpath("//a[contains(text(),'Preguntas y Respuestas')]")).click();
				break;
			}
			case "Iniciar sesión":
			{
			    driver.findElement(By.linkText("Iniciar sesión")).click();
			    break;
			}
			case "Registro":
			{
				driver.findElement(By.linkText("Registro")).click();
			    break;
			}
		}	
	}
}
