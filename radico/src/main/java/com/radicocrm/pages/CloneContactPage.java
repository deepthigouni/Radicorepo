package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class CloneContactPage extends BaseTest {
	@FindBy(xpath="//input[@name='property(Email)'])") private WebElement clnbtn;
	//@FindBy(xpath="//input[@name='property(Email)']") private WebElement Emtb;
	@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement svbtn;
	@FindBy(xpath="//input[@value='Save & New']") private WebElement svntb;
	public CloneContactPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	public WebElement getClnbtn() {
		return clnbtn;
	}
	
	
	public WebElement getSvbtn() {
		return svbtn;
	}
	
	public WebElement getSvntb() {
		return svntb;
	}
	/*
	 * public WebElement getEmtb() { return Emtb; }
	 */
	public void Clone(String em)
	{
		clnbtn.click();
		svbtn.click();
		svntb.click();
		
		
		//Emtb.sendKeys(em);
		
		
	}

}
