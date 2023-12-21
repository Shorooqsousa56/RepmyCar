
package p;

import java.util.ArrayList;

public class RoleMain {
	public boolean isAdmin(String email,String paer){
		boolean qq=false;
		if(email.equals("s12028923@stu.najah.edu")&&  paer.equals("123abc")) {
			qq=true;
		}
	return qq;
		
	}
	public boolean isInstaller(String email,String paer){
		boolean nn=false;
		if(email.equals("shorooqsousa@gmail.com")&&  paer.equals("123sh")) {
			nn=true;
		}
	return nn;
		
	}
	public boolean isCustomer(String email,String password,ArrayList <User>ar){
		String s1;
		String s2;
		boolean mp=false;
		for(int i=2;i<ar.size();i++) {
			s1=ar.get(i).getEmail();
			s2=ar.get(i).getPwd();
			if((s1.equals(email))&&(s2.equals(password))) {mp= true;}
			
		}
	return mp;
		
	}
	
	
	
	

}
