package appium_demo_test;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumDemo {

	@Test
	public void appiumSample() throws MalformedURLException {
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("U8KVDMBYLFT4SK85");
		
		URL url = new URL("http://127.0.0.1:4723/");
		
		AndroidDriver driver = new AndroidDriver(url,options);
		
		
	}
}
