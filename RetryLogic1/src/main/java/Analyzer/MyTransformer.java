package Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer implements IAnnotationTransformer {   //@runtime,it will run any test that fails,IAnnotationTransformer from this interface we override transform method below	

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor ,Method testMethod) {//transform is method in IAnnotationTransformer,no need to remember it is standard method
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
}