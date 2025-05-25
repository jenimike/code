package org.myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myyntra {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/register");
		WebElement sm= driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		sm.sendKeys("9791152364");
		WebElement smm= driver.findElement(By.xpath("//input[@type='checkbox']"));
		smm.click();
		WebElement smmd= driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		smmd.click();
		
	}

}
