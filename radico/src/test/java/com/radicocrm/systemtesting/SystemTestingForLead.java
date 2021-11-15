package com.radicocrm.systemtesting;

import org.testng.annotations.Test;

import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.FileLib;
import com.radicocrm.genericLib.WebDriverCommonLib;
import com.radicocrm.pages.ChangeStatusPage;
import com.radicocrm.pages.HomePage;
import com.radicocrm.pages.LeadCreateTask;
import com.radicocrm.pages.LeadPage;
import com.radicocrm.pages.LeadslistPage;
import com.radicocrm.pages.NewTaskPage;
import com.radicocrm.pages.SignInPage;


public class SystemTestingForLead extends BaseTest
{
	  @Test
	  public  void SigninPage() throws Throwable
		
	  {
		  
		    
		  SignInPage sp = new SignInPage();
			FileLib flib=new FileLib();
			sp.login(flib.readPropData(PROP_PATH, "un"),flib.readPropData(PROP_PATH, "pw"));
			
			HomePage hp=new HomePage();
			hp.clickHomepage();
		    LeadPage lp = new LeadPage();
	        lp.Lead();
	        Thread.sleep(2000);
	        
	        LeadslistPage lpage = new LeadslistPage();
	        lpage.Leadlist();
	        Thread.sleep(2000);
	        
	        ChangeStatusPage cspage = new ChangeStatusPage();
	        cspage.NewStatus();
	        Thread.sleep(2000);
	       
	        LeadCreateTask lct = new LeadCreateTask();
	        lct.CreateTasktoLead();
	        Thread.sleep(2000);
	         
	      NewTaskPage ntask = new NewTaskPage();
	      ntask.CreateTask(flib.readPropData(PROP_PATH,"Sub"), flib.readPropData(PROP_PATH,"Description"), flib.readPropData(PROP_PATH,"DueDate"));
	      Thread.sleep(2000);
}
}
	
	

