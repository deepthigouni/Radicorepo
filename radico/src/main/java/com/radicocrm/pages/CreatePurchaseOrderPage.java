package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class CreatePurchaseOrderPage {
	
	
	@FindBy(xpath="//input[@name='property(Subject)']") WebElement subject;
	@FindBy(xpath="//input[@name='property(Requisition No)']") WebElement requisition;
	@FindBy(xpath="//input[@name=property(Vendor Name)']") WebElement vendorname;
	@FindBy(xpath="(//input[@value='Save'])[1]") WebElement save;
	
	/*@FindBy(xpath="//input[@name='property(Contact Name)']") WebElement ;
	@FindBy(xpath="//input[@name='']") WebElement ;
	@FindBy(xpath="//input[@name='']") WebElement ;
	@FindBy(xpath="//input[@name='']") WebElement ;
	@FindBy(xpath="//input[@name='']") WebElement ;
	@FindBy(xpath="//input[@name='']") WebElement ;
	@FindBy(xpath="//input[@name='']") WebElement ;
	@FindBy(xpath="//input[@name='']") WebElement ;
	@FindBy(xpath="//input[@name='']") WebElement ;
	@FindBy(xpath="//input[@name='']") WebElement ;*/
	
	public CreatePurchaseOrderPage() {
		PageFactory.initElements(BaseTest.driver,this);
	}

	

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getRequisition() {
		return requisition;
	}

	public WebElement getVendorname() {
		return vendorname;
	}

	public WebElement getSave() {
		return save;
	}
	
	public void savepurchase(String purchasesub) {
		
		subject.sendKeys(purchasesub);
		save.click();
		
	}
	
	
	

}
