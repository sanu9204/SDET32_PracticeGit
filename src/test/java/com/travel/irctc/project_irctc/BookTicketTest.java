package com.travel.irctc.project_irctc;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;

public class BookTicketTest extends BaseClass {
@Test
public void bookTicket() {
	
//	System.out.println("booking ticket");
	Reporter.log(System.getProperty("browser"));
	Reporter.log(System.getProperty("url"));
}
}
