package Dmedicina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Enfermedades {
	
	public static void Abrir_Letra(String letra, WebDriver driver)
	{
		driver.findElement(By.linkText(letra)).click();
	}
	
	public static void Abrir_Enfermedad(String Enfermedad, WebDriver driver) throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver, 20000);

		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText(Enfermedad)));
		driver.findElement(By.xpath("//a[contains(text(),'" + Enfermedad  + "')]")).click();
		 //driver.findElement(By.linkText(Enfermedad)).click();
	}


}
