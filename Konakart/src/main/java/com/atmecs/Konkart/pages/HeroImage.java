package com.atmecs.Konkart.pages;

import com.atmecs.Konakart.constants.Findloc;
import com.atmecs.Konakart.helper.CommonUtlity;

public class HeroImage  {
	
	Findloc loc = new Findloc();
    
	public void ProductDiscription() {
		CommonUtlity.clickElement(loc.getlocator("loc.heroimage.click"));
		CommonUtlity.clickElement(loc.getlocator("loc.productdiscription.click"));

       
		
	

	}
	public void ProductSpecification() {
		CommonUtlity.clickElement(loc.getlocator("loc.productspecification.click"));
		
	}
	/*
	 * public void CustomerReview() {
	 * CommonUtlity.clickElement(loc.getlocator("loc.customerreview.click"));
	 * 
	 * }
	 */
	
}

