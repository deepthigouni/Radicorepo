package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;



public class ContactsPage extends BaseTest {
	@FindBy(xpath="//a[text()='Contacts']") private WebElement ContactsTab;
	@FindBy(xpath="//input[@value='New Contact']") private WebElement NewContactTab;
	public ContactsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public WebElement getContactsTab() {
		return ContactsTab;
	
	}
	
	public WebElement getNewContactTab() {
		return NewContactTab;
	}
	public void ClickContactsTab()
	{
		ContactsTab.click();
		NewContactTab.click();
	}
}