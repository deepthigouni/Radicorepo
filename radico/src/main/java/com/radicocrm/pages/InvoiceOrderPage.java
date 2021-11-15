package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class InvoiceOrderPage {
	
@FindBy(xpath="//a[text()='Invoices']") private WebElement invoicesPage;
	
	public InvoiceOrderPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	  
	public WebElement getInvoicesPage() {
		return invoicesPage;
	}
	
	public void InvoicePage()
	{
		invoicesPage.click();
	}

}
