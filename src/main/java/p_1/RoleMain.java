
package p_1;



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
	public boolean isCustomer(String email,String password){
		String s1;
		String s2;
		boolean mp=false;
		for(int i=2;i<MyApp.arrayUser.size();i++) {
			s1=MyApp.arrayUser.get(i).getEmail();
			s2=MyApp.arrayUser.get(i).getPwd();
			if((s1.equals(email))&&(s2.equals(password))) {mp= true;}
			
		}
	return mp;
		
	}
	
	
	
	

}
