package f1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import p1_in_main.MyApp;

public class installation_test {

	public MyApp obj22;
	//boolean isReserve=false;
	boolean isFree=false;
	boolean isValid=false;
	public installation_test(MyApp o) {
		super();
		this.obj22=o;
		
	}
	
	

@When("customer try to reserve a free time")
public void customer_try_to_reserve_a_free_time() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
	//isReserve=obj22.ins.is_Free("10");
	isFree=obj22.ins.is_Free("10");
	
	
}

@Then("the time was free")
public void the_time_was_free() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	assertTrue(isFree);
}


@When("user enter invalid input")
public void user_enter_invalid_input() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	isValid=obj22.ins.is_the_input_available("ab");
	
}

@Then("the input is unavailable")
public void the_input_is_unavailable() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	assertFalse(isValid);
}





@When("customer try to reserve a reserved time")
public void customer_try_to_reserve_a_reserved_time() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	
	//isReserve=obj22.ins.is_Free("01");
	isFree=obj22.ins.is_Free("01");
}

@Then("the time was a reserved")
public void the_time_was_a_reserved() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	assertFalse(isFree);
}

@When("trying to make this time free")
public void trying_to_make_this_time_free() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	obj22.ins.make_Free("01");
}

@Then("the time becomes free")
public void the_time_becomes_free() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	assertEquals('F',obj22.ins.values[0][1]);
}

@When("trying to make this time reserved")
public void trying_to_make_this_time_reserved() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	
	obj22.ins.make_Reserve("01");
	}


@Then("the time becomes reserved")
public void the_time_becomes_reserved() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	
	assertEquals('R',obj22.ins.values[0][1]);
}

	
	
	
	
	
	
	
}
