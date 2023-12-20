package p1_in_main;

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
	
	
     public void  editUserName(String UN,int Unum,ArrayList <User>ar){
		 
		
		ar.get(Unum).setUserName(UN);
	
		
	}
	
	
	
	public void  editbday(String bd,int Unum,ArrayList <User>ar){
		ar.get(Unum).setBday(bd);
		
	}
	
	public void  editpwd(String pwd,int Unum,ArrayList <User>ar){
		ar.get(Unum).setPwd(pwd);
		
	}
	
	
	public void  editphone(String phone,int Unum,ArrayList <User>ar){
		ar.get(Unum).setPhone(phone);
		
	}
	
	
	
	
	
	
	

}
