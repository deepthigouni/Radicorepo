package com.radicocrm.invoices;

import org.testng.annotations.Test;

import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.FileLib;
import com.radicocrm.genericLib.WebDriverCommonLib;
import com.radicocrm.pages.CreateInvoicesPage;
import com.radicocrm.pages.HomePage;
import com.radicocrm.pages.InvoiceOrderPage;
import com.radicocrm.pages.NewInvoiceOrderPage;
import com.radicocrm.pages.SignInPage;

public class CreateInvoicesTest extends BaseTest {
	
	@Test
	public void CreateInvoices() throws Throwable
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
		
		InvoiceOrderPage io=new InvoiceOrderPage();
		io.InvoicePage();
		
		NewInvoiceOrderPage iop=new NewInvoiceOrderPage();
		iop.clicknewInvoice();
	
		CreateInvoicesPage cip=new CreateInvoicesPage();
		cip.saveinvoices("invoicesub" ,"invoiceacnum","invoiceproductname","invoicequantity","invoicelistprice");

}
}
