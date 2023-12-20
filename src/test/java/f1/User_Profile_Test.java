package f1;



import static org.junit.Assert.assertTrue;
import static p1_in_main.MyApp.TheProductIsInterior;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import p1_in_main.MyApp;

public class User_Profile_Test {
	
	public MyApp obj;
	
		public User_Profile_Test(MyApp o) {
			super();
			this.obj=o;
			
		}
	
	
	@When("user try to edit userName")
	public void user_try_to_edit_user_name() {
	    // Write code here that turns the phrase above into concrete actions
	    obj.Up.editUserName("yazan",2,obj.arrayUser);
		
	}

	@Then("the userName was edited")
	public void the_user_name_was_edited() {
	    // Write code here that turns the phrase above into concrete actions
		boolean flag=false;
	    if(obj.arrayUser.get(2).getUserName().equals("yazan")) {
	    	flag=true;
	    }
	    assertTrue(flag==true);
		
	}

	@When("user try to edit Birthday")
	public void user_try_to_edit_birthday() {
	    // Write code here that turns the phrase above into concrete actions
		obj.Up. editbday("2/2/2002",2,obj.arrayUser);
	
	}

	@Then("the birthday was edited")
	public void the_birthday_was_edited() {
	    // Write code here that turns the phrase above into concrete actions
		boolean flag=false;
	    if(obj.arrayUser.get(2).getBday().equals("2/2/2002")) {
	    	flag=true;
	    }
	    assertTrue(flag==true);
		
	}

	@When("user try to edit pwd")
	public void user_try_to_edit_pwd() {
	    // Write code here that turns the phrase above into concrete actions
		  obj.Up.editpwd("123",2,obj.arrayUser);
			
	}

	@Then("the pwd was edited")
	public void the_pwd_was_edited() {
	    // Write code here that turns the phrase above into concrete actions
		boolean flag=false;
	    if(obj.arrayUser.get(2).getPwd().equals("123")) {
	    	flag=true;
	    }
	    assertTrue(flag==true);
	}

	@When("user try to edit phone")
	public void user_try_to_edit_phone() {
	    // Write code here that turns the phrase above into concrete actions
		obj.Up.editphone("059837367",2,obj.arrayUser);
	}

	@Then("the phone was edited")
	public void the_phone_was_edited() {
	    // Write code here that turns the phrase above into concrete actions
		boolean flag=false;
	    if(obj.arrayUser.get(2).getPhone().equals("059837367")) {
	    	flag=true;
	    }
	    assertTrue(flag==true);
	}
	
	

}