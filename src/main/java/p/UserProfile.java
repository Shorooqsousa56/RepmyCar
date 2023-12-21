package p;

import java.util.ArrayList;

public class UserProfile {
	 
	
	 public void editUserProfileMenue() {
		 System.out.println("*****************************");
		 System.out.println("1- edit User Name ");
		 System.out.println("2- edit Birthday ");
		 System.out.println("3- edit Password ");
		 System.out.println("4- edit phone number ");
		 System.out.println("5- go back to the big menue ");
		 System.out.println("*****************************");
		 
		 
		 
	 }
	
	
     public void  editUserName(String un,int unum,ArrayList <User>ar){
		 
		
		ar.get(unum).setUserName(un);
	
		
	}
	
	
	
	public void  editbday(String bd,int unum,ArrayList <User>ar){
		ar.get(unum).setBday(bd);
		
	}
	
	public void  editpwd(String pwd,int unum,ArrayList <User>ar){
		ar.get(unum).setPwd(pwd);
		
	}
	
	
	public void  editphone(String phone,int unum,ArrayList <User>ar){
		ar.get(unum).setPhone(phone);
		
	}
	
	
	
	
	
	
	

}
