package com.naukri;

public class UploadFile {
	public static void main(String[] args) throws InterruptedException {
		String filelocation = "/home/admin1/Desktop/Files/Design Pattern Programming Problems.pdf";
		UploadFileUtility util = new UploadFileUtility();
		util.openApplication();
		util.clickFresher();
		Thread.sleep(2000);
		util.uploadFile(filelocation);
		Thread.sleep(2000);
		util.closeApplication();
	}

}
