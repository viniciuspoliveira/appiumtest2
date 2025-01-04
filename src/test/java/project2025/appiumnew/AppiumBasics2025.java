package project2025.appiumnew;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics2025 {
	
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException
	{
		
		//Code to start server
		AppiumServiceBuilder service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"));
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("PixelProduction");
		options.setApp("//Users//viniciusoliveira//eclipse-workspace//appiumnew//src//test//java//resources//ApiDemos-debug.apk");
		
		
		AndroidDriver driver = new AndroidDriver(new URI ("http://127.0.0.1:4723").toURL(), options );
		driver.quit();
		//stop
		
	}

}
