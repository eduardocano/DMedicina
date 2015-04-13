package Dmedicina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {

	public static void Volver(WebDriver driver)
	{
		driver.findElement(By.linkText("Volver")).click();
	}
	
	public static void Entrar(String user, String pass, WebDriver driver)
	{
	    driver.findElement(By.id("edit-name--2")).sendKeys(user);
	    driver.findElement(By.id("edit-pass--2")).sendKeys(pass);
	    driver.findElement(By.id("edit-submit--2")).click();
	}
	
}
