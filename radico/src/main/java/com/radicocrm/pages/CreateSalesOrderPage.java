package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class CreateSalesOrderPage {

	@FindBy(xpath="//input[@NAME='property(Subject)']") private WebElement subject;
	@FindBy(xpath="//input[@NAME='property(Customer No)']")   private WebElement custno;
	@FindBy(xpath="//input[@NAME='property(Quote Name)']")   private WebElement quotename;
	@FindBy(xpath="//input[@NAME='property(Pending)']")   private WebElement pending ;
	@FindBy(id="Account Name") private WebElement accnme;
	@FindBy(xpath="//input[@NAME='property(Sales Commission)']")   private WebElement scommission ;
	@FindBy(xpath="//input[@NAME='property(Carrier)']") private WebElement  carrier;
	@FindBy(xpath="//input[@NAME='property(Potential Name)']") private WebElement potentialname  ;
	@FindBy(xpath="//input[@NAME='property(Purchase Order)']") private WebElement purchaseorder ;
	@FindBy(xpath="//input[@NAME='property(Due Date)']") private WebElement duedate ;
	@FindBy(xpath="//input[@NAME='property(Contact Name)']") private WebElement contname ;
	@FindBy(xpath="//input[@NAME='property(Excise Duty)']") private WebElement exciseduty ;
	@FindBy(xpath="//input[@NAME='property(Status)']") private WebElement status ;
	
	@FindBy(xpath="//input[@id='txtProduct1']") private WebElement productname ;
	@FindBy(xpath="") private WebElement quantity ;
	@FindBy(xpath="") private WebElement listprice ;
	
	@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement save;
	
	public WebElement getProductname() {
		return productname;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getListprice() {
		return listprice;
	}

	public CreateSalesOrderPage()
	{
		
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getSubject() {
		return subject;
	}
	
	
		
	public WebElement getAccnme() {
		
		return accnme;
	}
	
	
	
	

	public WebElement getCustno() {
		return custno;
	}
	
	

	
	public WebElement getQuotename() {
		return quotename;
	}
	
	

	public WebElement getPending() {
		return pending;
	}

	
	

	public WebElement getScommission() {
		return scommission;
	}

	public WebElement getCarrier() {
		return carrier;
	}

	public WebElement getPotentialname() {
		return potentialname;
	}

	public WebElement getPurchaseorder() {
		return purchaseorder;
	}

	public WebElement getDuedate() {
		return duedate;
	}

	public WebElement getContname() {
		return contname;
	}

	public WebElement getExciseduty() {
		return exciseduty;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getSave() {
		return save;
	}

	public void SaveSales(String salessub, String salesacnum, String salesproductname,String salesquantity,String saleslistprice) {
		
		subject.sendKeys(salessub);
		accnme.sendKeys(salesacnum);
		productname.sendKeys(salesproductname);
		quantity.sendKeys(salesquantity);
		listprice.sendKeys(saleslistprice);
	    
		save.click();
		
	}
	
}



