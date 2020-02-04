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

public class Chat_shortcut_homePage {

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
		
		 WebDriverWait wait1  = new WebDriverWait(driver, 30);
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
     /*
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/sign_in_google")));
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
     
     //help and support
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
     Thread.sleep(5000);
		driver.quit();
     
     /*
     //send media files and image as concern
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/chat_sdk_btn_options")));
     WebElement files_button = driver.findElementById("in.rebase.app:id/chat_sdk_btn_options");
     files_button.click();
     //select take photo
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")));
     WebElement take_Chat_pic = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
     take_Chat_pic.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
     WebElement Pic_allow_button = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
     Pic_allow_button.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_deny_button")));
     WebElement Pic_deny_button = driver.findElementById("com.android.packageinstaller:id/permission_deny_button");
     Pic_deny_button.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera2:id/shutter_button")));
     WebElement Pic_shoot_button = driver.findElementById("com.android.camera2:id/shutter_button");
     Pic_shoot_button.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera2:id/done_button")));
     WebElement Pic_shoot_done_button = driver.findElementById("com.android.camera2:id/done_button");
     Pic_shoot_done_button.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera2:id/cancel_button")));
     WebElement Pic_cancle_done_button = driver.findElementById("com.android.camera2:id/cancel_button");
     Pic_cancle_done_button.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera2:id/retake_button")));
     WebElement Pic_retake_done_button = driver.findElementById("com.android.camera2:id/retake_button");
     Pic_retake_done_button.click();
     
     //choose photo
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")));
     WebElement choose_chat_pic = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
     choose_chat_pic.click();
     //allow galary axcess
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
     WebElement choose_Pic_allow_button = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
     choose_Pic_allow_button.click();
     //deny galary axcess
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_deny_button")));
     WebElement choose_deny_deny_button = driver.findElementById("com.android.packageinstaller:id/permission_deny_button");
     choose_deny_deny_button.click();
     
     
     
     
		Thread.sleep(5000);
		driver.quit();
		*/
}
}
        

