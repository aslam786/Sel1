package com.guru.test;

import org.testng.Assert;
import org.testng.annotations.Test;
public class ExceptionExample {

	@Test
	public void  testCaseEnabling(){
	
		System.out.println("I'm Not Ready, please don't execute me");
		
		Assert.assertEquals("test", "test1", "failed!!!!!"); 
		
		
	
		}	
	
}