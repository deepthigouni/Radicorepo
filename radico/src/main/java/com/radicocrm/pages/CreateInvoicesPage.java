package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class CreateInvoicesPage {
	
	@FindBy(xpath="//input[@NAME='property(Subject)']") private WebElement subject;
	@FindBy(id="Account Name") private WebElement accname;
	@FindBy(xpath="(//input[@id='txtProduct1']") WebElement productname;
	@FindBy(xpath="(//input[@id='txtQty1']") WebElement quantity;
	@FindBy(xpath="//input[@id='txtListPrice1']") WebElement listprice;
	@FindBy(xpath="(//input[@value='Save'])[1]") WebElement save ;
	
	public CreateInvoicesPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getSubject() {
		return subject;
	}

	

	public WebElement getAccname() {
		return accname;
	}

	public WebElement getProductname() {
		return productname;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getListprice() {
		return listprice;
	}

	public WebElement getSave() {
		return save;
	}

	
	public void saveinvoices(String invoicesub, String invoiceacnum,String invoiceproductname, String invoicequantity, String invoicelistprice) {
		
		subject.sendKeys(invoicesub);
		accname.sendKeys(invoiceacnum);
		productname.sendKeys(invoiceproductname);
		quantity.sendKeys(invoicequantity);
		listprice.sendKeys(invoicelistprice);
		save.click();
	}
}
