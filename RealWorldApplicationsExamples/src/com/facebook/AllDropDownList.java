package com.facebook;

public class AllDropDownList {

	public static void main(String[] args) throws InterruptedException {
		DropDwonUtility dropdown = new DropDwonUtility();
		System.out.println("Selecting Day By Index");
		dropdown.withoutSelect();
		Thread.sleep(2000);
		dropdown.selectDayByIndex();
		Thread.sleep(2000);
		System.out.println("Selecting Day By Value");
		dropdown.selectDayByValue();
		Thread.sleep(2000);
		System.out.println("Selecting Day By Visible Text");
		dropdown.selectDayByVisibleText();
		Thread.sleep(2000);
		System.out.println("Selecting Month By Index");
		dropdown.selectMonthByIndex();
		Thread.sleep(2000);
		System.out.println("Selecting Month By Value");
		dropdown.selectMonthByValue();
		Thread.sleep(2000);
		System.out.println("Selecting Month By Visible Text");
		dropdown.selectMonthByVisibleText();
		Thread.sleep(2000);
		System.out.println("Selecting Year By Index");
		dropdown.selectYearByIndex();
		Thread.sleep(2000);
		System.out.println("Selecting Year By Value");
		dropdown.selectYearByValue();
		Thread.sleep(2000);
		System.out.println("Selecting Year By Visible Text");
		dropdown.selectYearByVisibleText();
		Thread.sleep(2000);
		dropdown.closeApplication();

	}

}
