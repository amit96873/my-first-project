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

	
	public class Mobile_num_veri {
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
			//setup
					DesiredCapabilities dc = new DesiredCapabilities();
					dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
					dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
					dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
					dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
					dc.setCapability("appPackage", "in.rebase.app");
					dc.setCapability("appActivity", "com.payvoo.app.ui.activity.SplashScreenActivity");
//					dc.setCapability("appActivity", "com.payvoo.app.ui.activity.TabActivity");
					URL url = new URL("http://127.0.0.1:4723/wd/hub");
					AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
					Thread.sleep(5000);
					
			//test sign in
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
			     
			     //giving permision(allow)
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
			     
			     //sign in with gmail(google)
			     
			    /* wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/sign_in_google")));
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
			      }*/
			     
			     
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
			     
			     
			     //setup smartcoin password
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
			     
//			     verification of mobile number requires to unlock the loan offer
			     
				   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/banner_viewpager")));
				     WebElement Mobile_number_verification = driver.findElementById("in.rebase.app:id/banner_viewpager");
				     
				     if(Mobile_number_verification.isEnabled()) {
				  	    System.out.println("mobile number verification upper page is Enabled");
				  	  Mobile_number_verification.click();
				      }
				     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/card_button")));
				     WebElement verify_button = driver.findElementById("in.rebase.app:id/card_button");
				     
				     if(verify_button.isEnabled()) {
				  	    System.out.println("mobile number verify button is Enabled");
				  	  verify_button.click();
				      }
				     //change number
				     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/change_number")));
				     WebElement change_number = driver.findElementById("in.rebase.app:id/change_number");
				     
				     if(change_number.isEnabled()) {
				  	    System.out.println("change mobile number button is Enabled");
				  	  change_number.click();
				      }
				     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/phone_number_to_be_changed")));
				     WebElement Enter_change_number = driver.findElementById("in.rebase.app:id/phone_number_to_be_changed");
				     
				     if(Enter_change_number.isEnabled()) {
				  	    System.out.println("change mobile number text is Enabled");
				  	  Enter_change_number.click();
				  	Enter_change_number.sendKeys("8073420765");
				      }
				     
				     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView")));
				     WebElement change_number_save_button = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView");
				     change_number_save_button.click();
				     
//				     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView")));
//				     WebElement change_number_cancle_button = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView");
//				     change_number_cancle_button.click();
				     
				     //resend otp
//				     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/resend_code")));
//				     WebElement resend_otp = driver.findElementById("in.rebase.app:id/resend_code");
//				     resend_otp.click();
//				     
				     
				     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/otp_code_part_1")));
				     WebElement enter_otp1 = driver.findElementById("in.rebase.app:id/otp_code_part_1");
				     
				     if(enter_otp1.isEnabled()) {
				  	    System.out.println("enter otp text one is Enabled");
				  	  enter_otp1.click();
				  	enter_otp1.sendKeys("1");
				      }
				     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText[2]")));
				     WebElement enter_otp2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText[2]");
				     
				     if(enter_otp2.isEnabled()) {
				  	    System.out.println("enter otp text two is Enabled");
				  	  enter_otp2.click();
				  	enter_otp2.sendKeys("2");
				      }
				     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText[3]")));
				     WebElement enter_otp3 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText[3]");
				     
				     if(enter_otp3.isEnabled()) {
				  	    System.out.println("enter otp text three is Enabled");
				  	  enter_otp3.click();
				  	enter_otp3.sendKeys("3");
				      }
				     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText[4]")));
				     WebElement enter_otp4 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText[4]");
				     
				     if(enter_otp4.isEnabled()) {
				  	    System.out.println("enter otp text four is Enabled");
				  	  enter_otp4.click();
				  	enter_otp4.sendKeys("4");
				      }
				     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText[5]")));
				     WebElement enter_otp5 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText[5]");
				     
				     if(enter_otp5.isEnabled()) {
				  	    System.out.println("enter otp text five is Enabled");
				  	  enter_otp5.click();
				  	enter_otp5.sendKeys("5");
				      }
				     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout")));
				     WebElement up_page_otpVerification = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout");
				     
				     up_page_otpVerification.click();
				     
				     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
				     WebElement vrify_button2 = driver.findElementById("in.rebase.app:id/primary_action_text");
				     
				     if(vrify_button2.isEnabled()) {
				  	    System.out.println("continue button is Enabled");
				  	  vrify_button2.click();
				  
				      }
				     
		}

}
