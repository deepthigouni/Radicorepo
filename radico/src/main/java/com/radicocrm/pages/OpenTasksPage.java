package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.WebDriverCommonLib;

public class OpenTasksPage {
	
	@FindBy(xpath="//select[@name='searchCr']") private WebElement Opentask;
	
	public OpenTasksPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
		public WebElement getOpentask() {
		return Opentask;
	}

   public void OpenTask()
   {
	   WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.selectOption(Opentask, "All");
   }



	
	
	
}
