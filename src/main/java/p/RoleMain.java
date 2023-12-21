
package p;

import java.util.ArrayList;

public class RoleMain {
	public boolean isAdmin(String email,String Password){
		boolean qq=false;
		if(email.equals("s12028923@stu.najah.edu")&&  Password.equals("123abc")) {
			qq=true;
		}
	return qq;
		
	}
	public boolean isInstaller(String email,String Password){
		boolean nn=false;
		if(email.equals("shorooqsousa@gmail.com")&&  Password.equals("123sh")) {
			nn=true;
		}
	return nn;
		
	}
	public boolean isCustomer(String email,String Password,ArrayList <User>ar){
		String s1,s2;
		boolean mp=false;
		for(int i=2;i<ar.size();i++) {
			s1=ar.get(i).getEmail();
			s2=ar.get(i).getPwd();
			if((s1.equals(email))&&(s2.equals(Password))) {mp= true;}
			
		}
	return mp;
		
	}
	
	
	
	

}
