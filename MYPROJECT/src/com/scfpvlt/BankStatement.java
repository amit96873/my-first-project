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

	public class BankStatement {

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
			     
			     //bank statement upload
			     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout")));
			     WebElement bank_statement_up = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout");
			     if(bank_statement_up.isEnabled()) {
			  	    System.out.println("bank statement upper page is Enabled");
			  	  bank_statement_up.click();
			      }
			     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/card_button")));
			     WebElement bank_statement_b = driver.findElementById("in.rebase.app:id/card_button");		     
			     if(bank_statement_b.isEnabled()) {
			  	    System.out.println("bank statement button is Enabled");
			  	  bank_statement_b.click();
			      }
			     
			     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout")));
			     WebElement select_bank_up = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout");
			     select_bank_up.click();
			     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/spinner")));
			     WebElement select_bank = driver.findElementById("in.rebase.app:id/spinner");		     
			     if(select_bank.isEnabled()) {
			  	    System.out.println("bank statement button is Enabled");
			  	  select_bank.click();
			      }
			     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.Button")));
			     WebElement select_bank_scroll = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.Button");
			     select_bank_scroll.click();
			     
			     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/image")));
			     WebElement upload_bank_pdf_up = driver.findElementById("in.rebase.app:id/image");
			     upload_bank_pdf_up.click();
			     
			     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/text_field_boxes_editTextLayout")));
			     WebElement bank_state_password_up = driver.findElementById("in.rebase.app:id/text_field_boxes_editTextLayout");
			     bank_state_password_up.click();
			     
			     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.EditText")));
			     WebElement pdf_enter_password = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.EditText");
			     if(pdf_enter_password.isEnabled()) {
			  	    System.out.println("bank statement upper page is Enabled");
			  	  pdf_enter_password.click();
			  	pdf_enter_password.sendKeys("12345678");
			      }
			     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout")));
			     WebElement panCard_front_up = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout");
			     panCard_front_up.click();
			     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera2:id/shutter_button")));
			     WebElement shooter_button = driver.findElementById("com.android.camera2:id/shutter_button");
			     shooter_button.click();
			     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera2:id/done_button")));
			     WebElement done_button = driver.findElementById("com.android.camera2:id/done_button");
			     done_button.click();
			     
			     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout")));
			     WebElement bank_continue_up = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout");
			     bank_continue_up.click();
			     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
			     WebElement upload_bank_pdf_continue = driver.findElementById("in.rebase.app:id/primary_action_text");
			     upload_bank_pdf_continue.click();
			     
			     Thread.sleep(5000);
			     driver.quit();
			     
		}
	}
			     
