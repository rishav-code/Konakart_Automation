package com.atmecs.Konakart.testscripts;

import org.testng.annotations.Test;

import com.atmecs.Konakart.dataprovider.TestDataInputThree;
import com.atmecs.Konakart.testbase.TestBase;
import com.atmecs.Konakart.validations.HeroImageValidation;
import com.atmecs.Konkart.pages.HeroImage;

public class SecondScenerio extends TestBase {
	HeroImage heroimage = new HeroImage();
	HeroImageValidation hiv = new HeroImageValidation();

	@Test(priority = 3, dataProvider = "content", dataProviderClass = TestDataInputThree.class)//3
	public void select(String ifexpectedkindle, String ifexpectedcoffe, String kindleproudctdesctext,
			String coffeproductdesctext, String kindledspecitext, String spectextcoffe) {
		heroimage.ProductDiscription();
		hiv.productDescriptionValidation(ifexpectedkindle, ifexpectedcoffe, kindleproudctdesctext,
				coffeproductdesctext);
		heroimage.ProductSpecification();
		hiv.productSpecificationValidation(ifexpectedkindle, ifexpectedcoffe, kindledspecitext, spectextcoffe);
        
}
	@Test(priority=4)
	public void date() {
		heroimage.customerReview();
        
        heroimage.clickOncsdpdn(0);
        hiv.dateValidate(0);
        heroimage.clickOncsdpdn(1);
        hiv.dateValidate(1);
        heroimage.clickOncsdpdn(2);
        hiv.ratingValidate(2);
        heroimage.clickOncsdpdn(3);
        hiv.ratingValidate(3);
       
	}
}