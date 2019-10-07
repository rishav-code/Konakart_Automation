package com.atmecs.Konkart.pages;

import java.sql.Driver;

import com.atmecs.Konakart.constants.Findloc;
import com.atmecs.Konakart.helper.CommonUtlity;
import com.atmecs.Konakart.testbase.TestBase;

public class ProductSearch extends TestBase {
	Findloc loc = new Findloc();
	
	
	public void selectAndSearch(String Games,String text) {
		CommonUtlity.selectDropdown(loc.getlocator("loc.dpdn.click"), 30,Games );
		CommonUtlity.clickAndSendText(loc.getlocator("loc.search.txt"), 30,text );
		CommonUtlity.clickElement(loc.getlocator("loc.search.click"));
		
		
	
	}
	public void navigateback() {
		driver.navigate().back();
		
	}

}
