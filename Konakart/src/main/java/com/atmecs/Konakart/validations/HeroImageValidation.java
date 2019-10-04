package com.atmecs.Konakart.validations;

import org.testng.Assert;

import com.atmecs.Konakart.constants.Findloc;
import com.atmecs.Konakart.helper.CommonUtlity;

public class HeroImageValidation {
	Findloc loc = new Findloc();
	String presenttext;

	public void productDescriptionValidation(String ifexpectedkindle, String ifexpectedcoffe,
			String kindleproudctdesctext, String coffeproductdesctext) {
		presenttext = CommonUtlity.getElement(loc.getlocator("loc.kindlepagetitle.txt")).getText();
		if (presenttext.equalsIgnoreCase(ifexpectedkindle)) {
			String actualpdText = CommonUtlity.getElement(loc.getlocator("loc.gettextfor.text")).getText();
		

			Assert.assertTrue(actualpdText.contains(kindleproudctdesctext), "Search result vlidation for tab pd failed");

			System.out.println("search result validation fot tab pd passed");

		} else {
			String actualpdText2 = CommonUtlity.getElement(loc.getlocator("loc.gettextfor.text")).getText();
			
			Assert.assertTrue(actualpdText2.contains(coffeproductdesctext), "Search result vlidation for coffe pd failed");

			System.out.println("search result validation for coffe pd passed");

		}

	}

	public void productSpecificationValidation(String ifexpectedkindle, String ifexpectedcoffe, String kindledspecitext,
			String spectextcoffe) {
		if (presenttext.equalsIgnoreCase(ifexpectedkindle)) {
			String actualpsText = CommonUtlity.getElement(loc.getlocator("loc.spec.text")).getText();
			System.out.println(actualpsText);
			Assert.assertTrue(actualpsText.contains(kindledspecitext), "Search result vlidation for kindle ps failed");

			System.out.println("search result validation for kindle ps passed");

		} else {
			String actualpsText2 = CommonUtlity.getElement(loc.getlocator("loc.spec.text")).getText();
			System.out.println(actualpsText2);
			Assert.assertTrue(actualpsText2.contains(spectextcoffe), "Search result vlidation failed");
			System.out.println("earch result validation for coffe ps passed");

		}

	}

}
