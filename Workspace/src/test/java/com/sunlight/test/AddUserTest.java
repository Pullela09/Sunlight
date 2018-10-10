package com.sunlight.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sunlight.base.Common;
import com.sunlight.pages.AddUser;
import com.sunlight.pages.Login;

	public class AddUserTest extends Common 
	{
		@Test
		public void AddUserTest() throws InterruptedException 
		{
			AddUser pageAddUser = PageFactory.initElements(driver, AddUser.class);			
			pageAddUser.adduserLink();

        }
	}
