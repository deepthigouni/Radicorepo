package com.radico.contact;

import org.testng.annotations.Test;

import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.FileLib;
import com.radicocrm.genericLib.WebDriverCommonLib;
import com.radicocrm.pages.CloneContactPage;
import com.radicocrm.pages.ContactsPage;
import com.radicocrm.pages.CreateContatPage;
import com.radicocrm.pages.HomePage;
import com.radicocrm.pages.SignInPage;



public class ContactRunningPage extends BaseTest {
	@Test
	public void ContactPage() throws Throwable {
		
		SignInPage sp = new SignInPage();
		FileLib flib=new FileLib();
		sp.login(flib.readPropData(PROP_PATH, "un"),flib.readPropData(PROP_PATH, "pw"));
		
		HomePage hp=new HomePage();
		hp.clickHomepage();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(FileLib .readPropData(PROP_PATH, "hometitle"),wlib.getPageTitle(), "hometitle ");
		
		
		
         ContactsPage cp=new ContactsPage();
         cp.ClickContactsTab();
         CreateContatPage ccp = new CreateContatPage();
         Thread.sleep(2000);
         ccp.ContactDetails(flib.readPropData(PROP_PATH, "ln"),
        		            flib.readPropData(PROP_PATH, "lan"));
        		           
         Thread.sleep(1000);
         
         CloneContactPage cc = new CloneContactPage();
         Thread.sleep(2000);
        
     
         
         
	}
	}