package com.radicocrm.sales;

import org.testng.annotations.Test;

import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.FileLib;
import com.radicocrm.genericLib.WebDriverCommonLib;
import com.radicocrm.pages.CreateSalesOrderPage;
import com.radicocrm.pages.HomePage;
import com.radicocrm.pages.NewSalesOrderPage;
import com.radicocrm.pages.SalesOrderPage;
import com.radicocrm.pages.SignInPage;

public class CreateSalesTest extends BaseTest {

	

	@Test
	public void CreateSales() throws Throwable
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
		
		SalesOrderPage so=new SalesOrderPage();
		so.SalesPage();
		
		wlib.verify(FileLib .readPropData(PROP_PATH, "SalesOrdertitle"),wlib.getPageTitle(), "SalesOrdertitle ");
		
		NewSalesOrderPage ns = new NewSalesOrderPage();
		ns.clicknewsales();
		
		CreateSalesOrderPage create = new CreateSalesOrderPage();
		create.SaveSales("salessub", "salesacnum","salesproductname","salesquantity","saleslistprice");
		
				
			

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
