package com.radicocrm.purchaseorders;

import org.testng.annotations.Test;

import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.FileLib;
import com.radicocrm.genericLib.WebDriverCommonLib;
import com.radicocrm.pages.HomePage;
import com.radicocrm.pages.NewPurchaseOrderPage;
import com.radicocrm.pages.PurchaseOrderPage;
import com.radicocrm.pages.SignInPage;

public class CreatePurchaseOrderTest extends BaseTest {
	
	

	@Test
	public void CreatePurchase() throws Throwable
	{

	//public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
	
		// BaseTest bt = new BaseTest();
		//bt.openBrowser();
		
		SignInPage sp = new SignInPage();
		FileLib flib=new FileLib();
		sp.login(flib.readPropData(PROP_PATH, "un"),flib.readPropData(PROP_PATH, "pw"));
		
		HomePage hp=new HomePage();
		hp.clickHomepage();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(FileLib .readPropData(PROP_PATH, "hometitle"),wlib.getPageTitle(), "hometitle ");
		
		PurchaseOrderPage po= new PurchaseOrderPage();
		po.ClickPurchase();
		
		NewPurchaseOrderPage pop = new NewPurchaseOrderPage();
		pop.clicknewPurchase();
		
		
		
		

}
}
