package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class TestGeneralStoreApp extends DriverSetup{
	@Test
	public void OpenGeneralStoreAPP() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("spinnerCountry")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")).click();
		driver.findElement(By.id("nameField")).sendKeys("Test");
		driver.findElement(By.id("radioFemale")).click();
		driver.findElement(By.id("btnLetsShop")).click();
		Thread.sleep(5000);
	}
}
