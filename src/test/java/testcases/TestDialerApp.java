package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class TestDialerApp extends DriverSetup{
	
	@Test
	public void openApp() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.id("com.android.dialer:id/fab")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.android.dialer:id/zero")).click();
		driver.findElement(By.id("com.android.dialer:id/one")).click();
		driver.findElement(By.id("com.android.dialer:id/two")).click();
		driver.findElement(By.id("com.android.dialer:id/five")).click();
		System.out.println(driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"6,MNO\"]/android.widget.LinearLayout/android.widget.TextView")).getText());
		Thread.sleep(3000);
	}

}
