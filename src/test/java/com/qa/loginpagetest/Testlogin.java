package com.qa.loginpagetest;

import org.testng.annotations.Test;

public class Testlogin {
		
		@Test(priority = 1)
		public void test()
		{
		System.out.println("test");
		}
		
		@Test(priority = 0)
		public void test2()
		{
		System.out.println("Testing");
		}
		
		@Test(priority = 2)
		public void test3()
		{
			System.out.println("testng");
		}
		}
		
	



