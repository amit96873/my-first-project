package com.scfpvlt;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SignupSmartCoin {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		//setup
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
		dc.setCapability("appPackage", "in.rebase.app");
		dc.setCapability("appActivity", "com.payvoo.app.ui.activity.SplashScreenActivity");
//		dc.setCapability("appActivity", "com.payvoo.app.ui.activity.TabActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		Thread.sleep(5000);
		
	
		//test
		WebElement signup = driver.findElementById("in.rebase.app:id/sign_up_button");
		signup.click();		
		
		//String currentActivity=driver.currentActivity(); //Activity changed "com.payvoo.app.ui.activity.TabActivity";
		
		WebDriverWait wait  = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
        ((WebElement)driver.findElementById("in.rebase.app:id/primary_action_text")).click();
        
        WebDriverWait  wait1= new WebDriverWait(driver,140);
        
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/text_field_boxes_editTextLayout")));
        WebElement upFullName = driver.findElementById("in.rebase.app:id/text_field_boxes_editTextLayout");
       
       upFullName.click();
        
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/name")));
       WebElement FullName = driver.findElementById("in.rebase.app:id/name");
       
       if(FullName.isEnabled()) {
    	   
    	    System.out.println("name is Enabled");
    	    FullName.click();
    	    FullName.sendKeys("Ajit Singh");
    	    
       }
       
       wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout")));
       WebElement upNumber = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout");
      
       upNumber.click();
       
       wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/mobile_number")));
      WebElement Number = driver.findElementById("in.rebase.app:id/mobile_number");
      
      if(Number.isEnabled()) {
   	    System.out.println("mobile number Enabled");
   	 Number.click();
   	Number.sendKeys("8073420765");
   	  
      }
      
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/drawer_layout")));
      WebElement UPPAGE = driver.findElementById("in.rebase.app:id/drawer_layout");
      UPPAGE.click();
      
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
      WebElement CONTINUE1 = driver.findElementById("in.rebase.app:id/primary_action_text");
      
      if(CONTINUE1.isEnabled()) {
   	    System.out.println("continue is Enabled");
   	    CONTINUE1.click();
       }
      
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/drawer_layout")));
      WebElement UPER3 = driver.findElementById("in.rebase.app:id/drawer_layout");
      UPER3.click();
      
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
      WebElement CONT3 = driver.findElementById("in.rebase.app:id/primary_action_text");
      
      if(CONT3.isEnabled()) {
   	    System.out.println("continue2 is Enabled");
   	 CONT3.click();
       }
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
      WebElement allow1 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
      
      if(allow1.isEnabled()) {
   	    System.out.println("allow1 is Enabled");
   	 allow1.click();
       }
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
      WebElement allow2 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
      
      if(allow2.isEnabled()) {
   	    System.out.println("allow2 is Enabled");
   	 allow2.click();
       }
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
      WebElement allow3 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
      
      if(allow3.isEnabled()) {
   	    System.out.println("allow3 is Enabled");
   	 allow3.click();
       }
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
      WebElement allow4 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
      
      if(allow4.isEnabled()) {
   	    System.out.println("allow4 is Enabled");
   	 allow4.click();
       }
      
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/login_google")));
      WebElement goog = driver.findElementById("in.rebase.app:id/login_google");
      
      if(goog.isEnabled()) {
   	    System.out.println("google click is Enabled");
   	 goog.click();
       }
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.gms:id/account_name")));
      WebElement A_name = driver.findElementById("com.google.android.gms:id/account_name");
      
      if(A_name.isEnabled()) {
   	    System.out.println("piced name by google is Enabled");
   	 A_name.click();
       }
      
      /*
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/dob")));
      WebElement dob = driver.findElementById("in.rebase.app:id/dob");
      
      if(dob.isEnabled()) {
   	    System.out.println("DOB click is Enabled");
   	 dob.click();
       }
      
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText")));
      WebElement sdate = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText");
      
      sdate.click();
     
       wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
      WebElement pic1 = driver.findElementById("android:id/button1");
      
      if(pic1.isEnabled()) {
   	    System.out.println("date picker is Enabled");
   	 pic1.click();
       }
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/text_field_boxes_editTextLayout")));
      WebElement Addressup = driver.findElementById("in.rebase.app:id/text_field_boxes_editTextLayout");
      
  if(Addressup.isEnabled()) {
   	    System.out.println("Address upper element is Enabled");
   	 Addressup.click();
       }
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/residence_address")));
      WebElement Address = driver.findElementById("in.rebase.app:id/residence_address");
      
      if(Address.isEnabled()) {
   	    System.out.println("address text is Enabled");
   	 Address.click();
   	Address.sendKeys("Aswath nagar marathhalli, kallamandi bangalore 560037");
       }
      
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View")));
    WebElement uppincode = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View");
   uppincode.click();
     
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/residence_pincode")));
      WebElement pincode = driver.findElementById("in.rebase.app:id/residence_pincode");
      
      if(pincode.isEnabled()) {
   	    System.out.println("pincode is Enabled");
   	 pincode.click();
   	pincode.sendKeys("560037");
       }   
      
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]")));
      WebElement upcount4 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]");
      upcount4.click();    
      
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
      WebElement count4 = driver.findElementById("in.rebase.app:id/primary_action_text");
      
      if(count4.isEnabled()) {
   	    System.out.println("continue is enabled Enabled");
   	 count4.click();
       }             
         */
     /* wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
      WebElement spiner1 = driver.findElementById("in.rebase.app:id/primary_action_text");
      spiner1.click();
      
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.Button")));
      WebElement spinerSel = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.Button");
      spinerSel.click();
      
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout")));
      WebElement Mincomeup = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout");
      Mincomeup.click();
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/monthly_income")));
      WebElement Mincome = driver.findElementById("in.rebase.app:id/monthly_income");
      if(Mincome.isEnabled()) {
     	    System.out.println("Monthly income text is Enabled");
     	   Mincome.click();
     	  Mincome.sendKeys("20000");
         } 
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View")));
      WebElement panup = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View");
      panup.click();
      
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/monthly_income")));
      WebElement pan = driver.findElementById("in.rebase.app:id/monthly_income");
      if(pan.isEnabled()) {
     	    System.out.println("pan number text is Enabled");
     	   pan.click();
     	  pan.sendKeys("GFLPK6195C");
         } 
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]")));
      WebElement upcount5 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]");
      upcount5.click();
      
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
      WebElement count5 = driver.findElementById("in.rebase.app:id/primary_action_text");
      if(count5.isEnabled()) {
     	    System.out.println("continue button is Enabled");
     	   count5.click();
         } */
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView")));
      WebElement pin1 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
      pin1.click();
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView")));
      WebElement pin2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView");
      pin2.click();
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView")));
      WebElement pin3 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView");
      pin3.click();
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView")));
      WebElement pin4 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
      pin4.click();
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView")));
      WebElement confirmpin1 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
      confirmpin1.click();
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView")));
      WebElement confirmpin2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView");
      confirmpin2.click();
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView")));
      WebElement confirmpin3 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView");
      confirmpin3.click();
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView")));
      WebElement confirmpin4 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
      confirmpin4.click();
      
      Thread.sleep(5000);
      driver.quit();
      
		}
	
		
		
	}


