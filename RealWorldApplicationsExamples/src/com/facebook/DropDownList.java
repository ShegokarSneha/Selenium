package com.facebook;

public class DropDownList {

	public static void main(String[] args) throws InterruptedException {
		DropDwonUtility dropdown = new DropDwonUtility();
		System.out.println("Opening Application");
		dropdown.openApplication();
		System.out.println("Selecting Day By Index");
		dropdown.withoutSelect();
		Thread.sleep(2000);
		System.out.println("Selecting Month By Value");
		dropdown.selectMonthByValue();
		Thread.sleep(2000);
		System.out.println("Selecting Year By Visible Text");
		dropdown.selectYearByVisibleText();
		Thread.sleep(2000);
		dropdown.closeApplication();
	}
}
		
		
/*		*/

