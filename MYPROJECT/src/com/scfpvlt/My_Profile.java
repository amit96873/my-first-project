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

public class My_Profile {

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
		WebElement signin = driver.findElementById("in.rebase.app:id/sign_in_button");
		signin.click();		
		
        //String currentActivity=driver.currentActivity(); //Activity changed "com.payvoo.app.ui.activity.TabActivity";
		
		 WebDriverWait wait1  = new WebDriverWait(driver, 180);
		 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
       ((WebElement)driver.findElementById("in.rebase.app:id/primary_action_text")).click();
        
     
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/drawer_layout")));
     WebElement UPER3 = driver.findElementById("in.rebase.app:id/drawer_layout");
     UPER3.click();
     
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
     WebElement CONT3 = driver.findElementById("in.rebase.app:id/primary_action_text");
     
     if(CONT3.isEnabled()) {
  	    System.out.println("continue button is Enabled");
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
     //signin with gmail
     /*wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/sign_in_google")));
     WebElement goog = driver.findElementById("in.rebase.app:id/sign_in_google");
     
     if(goog.isEnabled()) {
  	    System.out.println("google id picker is Enabled");
  	 goog.click();
      }
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.gms:id/account_name")));
     WebElement A_name = driver.findElementById("com.google.android.gms:id/account_name");
     
     if(A_name.isEnabled()) {
  	    System.out.println("google_name picker is Enabled");
  	 A_name.click();
      }
      */
     //sign in with facebook
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/fb_sign_in")));
     WebElement fb = driver.findElementById("in.rebase.app:id/fb_sign_in");
     
     if(fb.isEnabled()) {
  	    System.out.println("redirect fb login page is Enabled");
  	  fb.click();
      }
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.EditText")));
     WebElement fb_user_name = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.EditText");
     
     if(fb_user_name.isEnabled()) {
  	    System.out.println("facebook user name text is Enabled");
  	    fb_user_name.click();
  	    fb_user_name.sendKeys("amit96873@gmail.com");
  	    System.out.println("user name is enterd succesfully");
      }
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText")));
     WebElement fb_password = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText");
     
     if(fb_password.isEnabled()) {
  	    System.out.println("facebook password text is Enabled");
  	    fb_password.click();
  	    fb_password.sendKeys("8226993297");
  	    System.out.println("password is enterd succesfully");
      }
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button")));
     WebElement fb_login_button = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button");
     
     if(fb_login_button.isEnabled()) {
  	    System.out.println("facebook login button is Enabled");
  	  fb_login_button.click();
      }
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.Button")));
     WebElement fb_continue_button = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.Button");
     
     if(fb_continue_button.isEnabled()) {
  	    System.out.println("facebook continue button is Enabled");
  	  fb_continue_button.click();
      }
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
     
     //my profile
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Open\"]")));
     WebElement menu_button = driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open\"]");
     menu_button.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView")));
     WebElement menu_My_Profile = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView");
     menu_My_Profile.click();
     System.out.println("in my profile");
     
     /*
     //chat_with_us
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/chat_shortcut")));
     WebElement chat_button = driver.findElementById("in.rebase.app:id/chat_shortcut");
     chat_button.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/chat_sdk_et_message_to_send")));
     WebElement type_message = driver.findElementById("in.rebase.app:id/chat_sdk_et_message_to_send");
     type_message.click();
     type_message.sendKeys("hi how to upload the documents");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/chat_sdk_btn_chat_send_message")));
     WebElement send_message = driver.findElementById("in.rebase.app:id/chat_sdk_btn_chat_send_message");
     send_message.click();
     System.out.println("message has been send succesfully");
     */
     
    /*    
     //edit my profile      
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/fab_expand_menu_button")));
     WebElement edit_my_profile = driver.findElementById("in.rebase.app:id/fab_expand_menu_button");
     edit_my_profile.click(); 
     //edit persional details
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton[1]")));
     WebElement edit_P_Details = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton[1]");
     edit_P_Details.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/name")));
     WebElement edit_my_name = driver.findElementById("in.rebase.app:id/name");
     edit_my_name.click();
     edit_my_name.sendKeys("Ajit Singh Rathore");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/mobile_number")));
     WebElement edit_my_num = driver.findElementById("in.rebase.app:id/mobile_number");
     edit_my_num.click();
     edit_my_num.sendKeys("8226993297");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/dob")));
     WebElement edit_DOB = driver.findElementById("in.rebase.app:id/dob");
     edit_DOB.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
     WebElement edit_DOB_select_ok = driver.findElementById("android:id/button1");
     edit_DOB_select_ok.click();
//     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button2")));
//     WebElement edit_DOB_select_cancle = driver.findElementById("android:id/button2");
//     edit_DOB_select_cancle.click();     
     //select gender
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[3]")));
     WebElement trans = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[3]");
     trans.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]")));
     WebElement female = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]");
     female.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[1]")));
     WebElement male = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[1]");
     male.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/residence_address")));
     WebElement edit_my_address = driver.findElementById("in.rebase.app:id/residence_address");
     edit_my_address.click();
     edit_my_address.sendKeys("5th cross aswath nagar marathahalli kala mandir banglore karnatka");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/residence_pincode")));
     WebElement edit_my_pinc = driver.findElementById("in.rebase.app:id/residence_pincode");
     edit_my_pinc.click();
     edit_my_pinc.sendKeys("560037");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/father_name")));
     WebElement edit_Fname = driver.findElementById("in.rebase.app:id/father_name");
     edit_Fname.click();
     edit_Fname.sendKeys("xyzabc singh");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/mother_name")));
     WebElement edit_Mname = driver.findElementById("in.rebase.app:id/mother_name");
     edit_Mname.click();
     edit_Mname.sendKeys("defghi singh");     
     //edit material status     
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[1]")));
     WebElement maried = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[1]");
     maried.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]")));
     WebElement unmaried = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]");
     unmaried.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
     WebElement edit_continue = driver.findElementById("in.rebase.app:id/primary_action_text");
     edit_continue.click();
     */
     
     
     
     /*
     //edit work details
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/fab_expand_menu_button")));
     WebElement edit_my_profile = driver.findElementById("in.rebase.app:id/fab_expand_menu_button");
     edit_my_profile.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton[2]")));
     WebElement edit_work_Details = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton[2]");
     edit_work_Details.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/spinner")));
     WebElement edit_EmpStatus = driver.findElementById("in.rebase.app:id/spinner");
     edit_EmpStatus.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.Button")));
     WebElement edit_sel_EmpStatus = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.Button");
     edit_sel_EmpStatus.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/monthly_income")));
     WebElement edit_M_Income = driver.findElementById("in.rebase.app:id/monthly_income");
     edit_M_Income.click();
     edit_M_Income.sendKeys("55000");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/pan")));
     WebElement edit_pan = driver.findElementById("in.rebase.app:id/pan");
     edit_pan.click();
     edit_pan.sendKeys("GFLPK6195F");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")));
     WebElement edit_designation = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
     edit_designation.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.Button")));
     WebElement edit_desig_sel = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.Button");
     edit_desig_sel.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/work_options_card")));
     WebElement edit_workspace_Details_card = driver.findElementById("in.rebase.app:id/work_options_card");
     edit_workspace_Details_card.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/workplace_name")));
     WebElement edit_workspace_name = driver.findElementById("in.rebase.app:id/workplace_name");
     edit_workspace_name.click();
     edit_workspace_name.sendKeys("xyxabcd corporation limimited");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout")));
     WebElement edit_workspace_address_up = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout");
     edit_workspace_address_up.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/workplace_address")));
     WebElement edit_workspace_address = driver.findElementById("in.rebase.app:id/workplace_address");
     edit_workspace_address.click();
     edit_workspace_address.sendKeys("banashawadi bangalore ");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout")));
     WebElement edit_workspace_pincode_up = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout");
     edit_workspace_pincode_up.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/workplace_pincode")));
     WebElement edit_workspace_pincode = driver.findElementById("in.rebase.app:id/workplace_pincode");
     edit_workspace_pincode.click();
     edit_workspace_pincode.sendKeys("560057");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]")));
     WebElement edit_workspace_coniti_up = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]");
     edit_workspace_coniti_up.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
     WebElement edit_workspace_continue = driver.findElementById("in.rebase.app:id/primary_action_text");
     edit_workspace_continue.click();
     */
     
     //KYC UPLOAD DOCUMENTS
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/fab_expand_menu_button")));
     WebElement edit_my_profile = driver.findElementById("in.rebase.app:id/fab_expand_menu_button");
     edit_my_profile.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/kyc_edit_button")));
     WebElement edit_kyc_docs = driver.findElementById("in.rebase.app:id/kyc_edit_button");
     edit_kyc_docs.click();
     //aadhar front
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]")));
     WebElement edit_kyc_AadharFront = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]");
     edit_kyc_AadharFront.click();
     System.out.println("clicked on aadhar front");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
     WebElement edit_kyc_docs_allow = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
     edit_kyc_docs_allow.click();
     System.out.println("give permission");
//     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_deny_button")));
//     WebElement edit_kyc_docs_deny = driver.findElementById("com.android.packageinstaller:id/permission_deny_button");
//     edit_kyc_docs_deny.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/positive_button")));
     WebElement edit_kyc_docs_capture = driver.findElementById("in.rebase.app:id/positive_button");
     edit_kyc_docs_capture.click();
     System.out.println("capture button");
//     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/negative_button")));
//     WebElement edit_kyc_docs_cancle = driver.findElementById("in.rebase.app:id/negative_button");
//     edit_kyc_docs_cancle.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]")));
     WebElement edit_kyc_docs_shooter_button = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Shutter\"]");
     edit_kyc_docs_shooter_button.click();
     System.out.println("click on shooter");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera2:id/done_button")));
     WebElement edit_kyc_docs_shooter_done_button = driver.findElementById("com.android.camera2:id/done_button");
     edit_kyc_docs_shooter_done_button.click();
     System.out.println("final click");
//     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera2:id/cancel_button")));
//     WebElement edit_kyc_docs_shooter_cancle_button = driver.findElementById("com.android.camera2:id/cancel_button");
//     edit_kyc_docs_shooter_cancle_button.click();
//     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera2:id/retake_button")));
//     WebElement edit_kyc_docs_shooter_retake_button = driver.findElementById("com.android.camera2:id/retake_button");
//     edit_kyc_docs_shooter_retake_button.click();
     //aadhar back     
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]")));
     WebElement edit_kyc_Aadharback = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]");
     edit_kyc_Aadharback.click();
     System.out.println("clicked on aadhar back");
//     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
//     WebElement edit_kyc_docs_allow2 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//     edit_kyc_docs_allow2.click();
//     System.out.println("give permission");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/positive_button")));
     WebElement edit_kyc_docs_capture2 = driver.findElementById("in.rebase.app:id/positive_button");
     edit_kyc_docs_capture2.click();
     System.out.println("capture button");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera2:id/shutter_button")));
     WebElement edit_kyc_docs_shooter_button2 = driver.findElementById("com.android.camera2:id/shutter_button");
     edit_kyc_docs_shooter_button2.click();
     System.out.println("click on shooter");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera2:id/done_button")));
     WebElement edit_kyc_docs_shooter_done_button2 = driver.findElementById("com.android.camera2:id/done_button");
     edit_kyc_docs_shooter_done_button2.click();
     System.out.println("final click");
     //selfee
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")));
     WebElement edit_kyc_selfee = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[2]");
     edit_kyc_selfee.click();
     System.out.println("clicked on selfee");
//     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
//     WebElement edit_kyc_docs_allow3 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//     edit_kyc_docs_allow3.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/positive_button")));
     WebElement edit_kyc_docs_capture3 = driver.findElementById("in.rebase.app:id/positive_button");
     edit_kyc_docs_capture3.click();
     System.out.println("capture button");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera2:id/shutter_button")));
     WebElement edit_kyc_docs_shooter_button3 = driver.findElementById("com.android.camera2:id/shutter_button");
     edit_kyc_docs_shooter_button3.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera2:id/done_button")));
     WebElement edit_kyc_docs_shooter_done_button3 = driver.findElementById("com.android.camera2:id/done_button");
     edit_kyc_docs_shooter_done_button3.click();  
     System.out.println("click on shooter");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]")));
     WebElement edit_kyc__docs_continue_up = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]");
     edit_kyc__docs_continue_up.click();
     System.out.println("final click");
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
     WebElement edit_kyc_docs_continue_button = driver.findElementById("in.rebase.app:id/primary_action_text");  
     edit_kyc_docs_continue_button.click();
		Thread.sleep(5000);
		driver.quit();
     }
}
        