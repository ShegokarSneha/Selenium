package com.swiggy;


public class ScrollBar {
	public static void main(String[] args) throws InterruptedException {
		ScrollBarUtility util = new ScrollBarUtility();
		util.openApplication();
		Thread.sleep(1000);
		util.scrollByPixel();
		Thread.sleep(2000);
		util.ScrollToVisibleElement();
		Thread.sleep(1000);
		util.ScrollToEnd();
		Thread.sleep(1000);
		util.closeApplication();
	}
}
