package f1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import p1_in_main.MyApp;

public class Auth {
	public MyApp obj;
	
	public Auth(MyApp o) {
		super();
		this.obj=o;
		
	}
	
	@Given("I am not in system")
	public void i_am_not_in_system() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//assertTrue(obj.isLogIn==false);
		//assertTrue(true);
		obj.isLogIn=false;
		
	}

	///*

	@When("I enter wrong email and password")
	public void i_enter_wrong_email_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.isExist("ygbh@gmail.com", "123skbhby");
		//assertTrue(true);
	}

	@Then("log in fail")
	public void log_in_fail() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//assertTrue(true);
		assertTrue(obj.isLogIn==false);
		
	}
	//*/
	
	@When("I enter correct email and password")
	public void i_enter_correct_email_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
		//obj.isLogIn=
		MyApp.isExist("s12028923@stu.najah.edu","123abc");
		
		
	}

	@Then("log in succed")
	public void log_in_succed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();

		assertTrue(obj.isLogIn==true);//=true;   obj.isLogIn
		
	}

	@When("I enter all my information correctly")
	public void i_enter_all_my_information_correctly() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//email username bDay pwd phone
		String zx[]={"saq@gmail.com","Ahmad 12 Gg","19-7-2005","hjbb52","0542226718"};
		obj.isValidSignUp(zx);
	}


	@Then("sign up succed")
	public void sign_up_succed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		assertTrue(obj.isSignUp);
	}
	@Given("I do not have an account")
	public void i_do_not_have_an_account() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		obj.isSignUp=false;
	}

	@When("I enter all my information with resereved email")
	public void i_enter_all_my_information_with_resereved_email() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.isReservedEmail("s12028923@stu.najah.edu");
	}

	@Then("sign up failed")
	public void sign_up_failed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		assertTrue(obj.isSignUp==false);
	}

	@When("I enter my information , but ther is missing field")
	public void i_enter_my_information_but_ther_is_missing_field() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String arQQ[]= {"qq","ww","rr","cc",""};
		obj.isMissingField(arQQ);
		
	}

	@When("I enter my inf but there is special char in username")
	public void i_enter_my_inf_but_there_is_special_char_in_username() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.isSpecialChar("Ali@");
	}

	@Given("I am in system")
	public void i_am_in_system() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.isLogIn=true;
	}

	@When("I enter log out")
	public void i_enter_log_out() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		obj.logOut();
	}

	@Then("log out succeeded")
	public void log_out_succeeded() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		assertTrue(obj.isLogIn==false);
	}

	
	
	
	

}
