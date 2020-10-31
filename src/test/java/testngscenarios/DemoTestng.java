package testngscenarios;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoTestng {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in testng before class method");
	}
	
	@Test
	public void printHelloworld() {
		System.out.println("I am in testng method");
	}
	
	
	
	

}
