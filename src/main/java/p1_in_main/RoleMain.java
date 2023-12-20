
package p1_in_main;

import java.util.ArrayList;

public class RoleMain {
	public boolean isAdmin(String email,String Password){
		if(email.equals("s12028923@stu.najah.edu")&&  Password.equals("123abc")) {
			return true;
		}
	return false;
		
	}
	public boolean isInstaller(String email,String Password){
		if(email.equals("shorooqsousa@gmail.com")&&  Password.equals("123sh")) {
			return true;
		}
	return false;
		
	}
	public boolean isCustomer(String email,String Password,ArrayList <User>ar){
		String s1,s2;
		for(int i=2;i<ar.size();i++) {
			s1=ar.get(i).getEmail();
			s2=ar.get(i).getPwd();
			if((s1.equals(email))&&(s2.equals(Password))) {return true;}
			
		}
	return false;
		
	}
	
	
	
	

}
