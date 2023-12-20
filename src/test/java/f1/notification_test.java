package f1;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import p1_in_main.MyApp;

public class notification_test {
	
	public MyApp obj;
	
	public notification_test (MyApp o) {
		super();
		this.obj=o;
		
	}


@When("customer have order")
public void customer_have_order() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
	obj.n=false;
	obj.notification("successfully");
	
}

@Then("notification send to customer via emial to confirm order")
public void notification_send_to_customer_via_emial_to_confirm_order() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	assertTrue(obj.n==true);
}

@When("customer make installation req")
public void customer_make_installation_req() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	obj.n=false;
	obj.notification("successfully");
}

@Then("notification send to customer via emial to confirm install req")
public void notification_send_to_customer_via_emial_to_confirm_install_req() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    assertTrue(obj.n==true);
}

@Then("notification send to installer via emial to confirm install req")
public void notification_send_to_installer_via_emial_to_confirm_install_req() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    assertTrue(obj.n==true);
}


}
