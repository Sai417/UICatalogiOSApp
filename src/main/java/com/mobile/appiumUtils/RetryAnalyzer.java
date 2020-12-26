package com.mobile.appiumUtils;
import org.testng.IAnnotationTransformer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
 
import org.testng.annotations.ITestAnnotation;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class RetryAnalyzer implements IRetryAnalyzer, IAnnotationTransformer {
  int count =0, maxRetryCount =2;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<maxRetryCount) {
			count++;
			return true;
		}
		
		return false;
	}
	@Override
	 public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	 annotation.setRetryAnalyzer(RetryAnalyzer.class);
	
	} 
	

}
