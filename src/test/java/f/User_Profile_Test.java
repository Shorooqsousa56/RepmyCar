package f;



import static org.junit.Assert.assertTrue;
import static p_1.MyApp.theProductIsInterior;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import p_1.MyApp;

public class User_Profile_Test {
	
	public MyApp obj;
	
		public User_Profile_Test(MyApp o) {
			super();
			this.obj=o;
			
		}
	
	
	@When("user try to edit userName")
	public void user_try_to_edit_user_name() {
	    // Write code here that turns the phrase above into concrete actions
	    obj.up.editUserName("yazan",2);
		
	}

	@Then("the userName was edited")
	public void the_user_name_was_edited() {
	    // Write code here that turns the phrase above into concrete actions
		boolean flag=false;
	    if(obj.arrayUser.get(2).getUserName().equals("yazan")) {
	    	flag=true;
	    }
	    assertTrue(flag);
		
	}

	@When("user try to edit Birthday")
	public void user_try_to_edit_birthday() {
	    // Write code here that turns the phrase above into concrete actions
		obj.up. editbday("2/2/2002",2);
	
	}

	@Then("the birthday was edited")
	public void the_birthday_was_edited() {
	    // Write code here that turns the phrase above into concrete actions
		boolean flag=false;
	    if(obj.arrayUser.get(2).getBday().equals("2/2/2002")) {
	    	flag=true;
	    }
	    assertTrue(flag);
		
	}

	@When("user try to edit pwd")
	public void user_try_to_edit_pwd() {
	    // Write code here that turns the phrase above into concrete actions
		  obj.up.editpwd("123",2);
			
	}

	@Then("the pwd was edited")
	public void the_pwd_was_edited() {
	    // Write code here that turns the phrase above into concrete actions
		boolean flag=false;
	    if(obj.arrayUser.get(2).getPwd().equals("123")) {
	    	flag=true;
	    }
	    assertTrue(flag);
	}

	@When("user try to edit phone")
	public void user_try_to_edit_phone() {
	    // Write code here that turns the phrase above into concrete actions
		obj.up.editphone("059837367",2);
	}

	@Then("the phone was edited")
	public void the_phone_was_edited() {
	    // Write code here that turns the phrase above into concrete actions
		boolean flag=false;
	    if(obj.arrayUser.get(2).getPhone().equals("059837367")) {
	    	flag=true;
	    }
	    assertTrue(flag);
	}
	
	

}