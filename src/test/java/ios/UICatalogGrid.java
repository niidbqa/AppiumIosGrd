package ios;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.ios.IOSDriver;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UICatalogGrid {
IOSDriver driver;
public String setMobileNumber=null;


public static String firstDeviceName="16a241b5344bc50421ebc7a5a27edea3019f5536";
public static String SecondDeviceName="c84c5fd8fb6cd5e842473a1888c511b7cf8d9bef";


	@BeforeClass
	@Parameters({"port","deviceID"})
	public void startTime(String port1,String device_id) throws IOException, InterruptedException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "com.example.apple-samplecode.UICatalog");
		
		
		if(device_id.equalsIgnoreCase(firstDeviceName)){
			System.out.println(port1 + "-" + System.currentTimeMillis());
			System.out.println(device_id + "-" + System.currentTimeMillis());		
			capabilities.setCapability("deviceName",firstDeviceName);
			capabilities.setCapability("udid", firstDeviceName);
			capabilities.setCapability("platformVersion", "8.4");
			setMobileNumber=device_id;
		}else if(device_id.equalsIgnoreCase(SecondDeviceName)){
			System.out.println(port1 + "-" + System.currentTimeMillis());
			System.out.println(device_id + "-" + System.currentTimeMillis());
			
			capabilities.setCapability("deviceName",SecondDeviceName);
			capabilities.setCapability("udid", SecondDeviceName);
			capabilities.setCapability("platformVersion", "8.1.2");
			setMobileNumber=device_id;
		}
		
				driver=new IOSDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		     
	}



@Test()
public void Sliders() throws InterruptedException
{
	Thread.sleep(5000);
	driver.scrollTo("Sliders").click();
    
	   
 	
    
	
  }

 
 

 




 
 @AfterMethod
@AfterTest
  public void tearDown() throws Exception {
    driver.quit();
  }
 
 
 
 
 
}
