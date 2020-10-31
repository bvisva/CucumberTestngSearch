package cucumberteststeps;

import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.java.DataTableType;
import io.cucumber.java.DocStringType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class test {	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in cucumber before class method");
	}
	
	@Given("I have launched URL")
	public void i_have_launched_url() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("hello");
	}
	
		
	@DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 1, "a" },
	      new Object[] { 2, "b" },
	    };
	  }

	@When("i click me")
	public void i_click_me() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("nothing happens")
	public void nothing_happens() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	
	
}
