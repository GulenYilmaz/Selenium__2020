package com.syntax.seleniumclass02_Locatior;

public class SChromeDriver implements SWebDriver{
	
	public SChromeDriver() {//constructor
		
		System.err.println("Opening Chrome Browser....");//--->Opening Chrome Browser....
		                                                 //--->with red color because of the err
	}

	@Override
	public void get(String url) {
		
		System.out.println("Lunching the url:: "+url);
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("Retrieving Current URL");
		
	}

	@Override
	public void close() {

		System.out.println("Closing the current window");
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

}
