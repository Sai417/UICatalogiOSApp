package com.mobile.testscripts.alertViews;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	int i=0;
	@Test
	public void retrycheck() {
		
		if(i==2) {
			
			Assert.assertEquals(i,2);
		}
		else {
			i++;
			Assert.assertEquals(i,2);
		}
	}
	

}
