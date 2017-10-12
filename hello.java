package com.offcn.test;

import com.offcn.service.impl.PhoneService;
import com.offcn.service.impl.PhoneServiceImplService;

public class App {

	public static void main(String[] args) {
		PhoneService phoneservice=new PhoneServiceImplService().getPhoneServiceImplPort();
		
		
      System.out.println(phoneservice.searchByNumber("1888888888").getArea());
	}

}
