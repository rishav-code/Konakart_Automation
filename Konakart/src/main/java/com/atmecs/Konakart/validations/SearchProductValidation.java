package com.atmecs.Konakart.validations;

import org.testng.Assert;

import com.atmecs.Konakart.constants.Findloc;
import com.atmecs.Konakart.helper.CommonUtlity;

public  class SearchProductValidation {
	Findloc loc = new Findloc();
	public void SearchValidate(String expectedtext,String expectedprice) {
		String actualSearchText=CommonUtlity.getElement(loc.getlocator("loc.gametitle.text")).getText();
		System.out.println(actualSearchText);
		Assert.assertEquals(actualSearchText, expectedtext, "Search result avlidation failed");
		System.out.println("search result validation passed");
		String actualprice=CommonUtlity.getElement(loc.getlocator("loc.gameprice.txt")).getText();
		System.out.println(actualprice);
		Assert.assertEquals(actualprice, expectedprice, "Search result avlidation failed");
		System.out.println("search result validation passed");

		
	}
	public void negativesearchvalidate(String negexpectedtext) {
		String negactualSearchText=CommonUtlity.getElement(loc.getlocator("loc.error.txt")).getText();
		System.out.println(negactualSearchText);
		Assert.assertEquals(negactualSearchText, negexpectedtext, "Search result negvlidation failed");
		System.out.println("search result negvalidation passed");
				
	}

}
