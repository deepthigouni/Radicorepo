package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class PurchaseOrderPage {
	
	@FindBy(xpath="//a[text()='Purchase Orders']") WebElement purchaseorders;
	
	public PurchaseOrderPage() {
	
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getPurchaseorders() {
		return purchaseorders;
	}
	
	public void ClickPurchase() {
		purchaseorders.click();
	}
	

}
