package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;



public class CreateContatPage extends BaseTest{
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement ltntb;
	@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement svbtn;
	@FindBy(xpath="(//input[@value='Edit'])[1]") private WebElement Edbtn;
	@FindBy(xpath="(//input[@value='Clone'])[1]") private WebElement clnbtn;
	public CreateContatPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getLtntb() {
		return ltntb;
	}
	
	public WebElement getSvbtn() {
		return svbtn;
	}
	public WebElement getEdbtn() {
		return Edbtn;
	}
	
	public WebElement getClnbtn() {
		return clnbtn;
	}

	public void ContactDetails(String ln, String lan)
	{
		ltntb.sendKeys(ln);
		svbtn.click();
		Edbtn.click();
		ltntb.clear();
		ltntb.sendKeys(lan);
		svbtn.click();
		clnbtn.click();
		
		
		
		
	}
	

}
