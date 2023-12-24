package p_1;



public class UserProfile {
	 
	
	 public void editUserProfileMenue() {
		 MyApp.logger.info("*****************************"+"\n");
		 MyApp.logger.info("1- edit User Name \n");
		 MyApp.logger.info("2- edit Birthday \n");
		 MyApp.logger.info("3- edit Password \n");
		 MyApp.logger.info("4- edit phone number\n ");
		 MyApp.logger.info("5- go back to the big menue\n ");
		 MyApp.logger.info("*****************************"+"\n");
		 
		 
		 
	 }
	
	
     public void  editUserName(String un,int unum){
		 
		
		MyApp.arrayUser.get(unum).setUserName(un);
	
		
	}
	
	
	
	public void  editbday(String bd,int unum){
		MyApp.arrayUser.get(unum).setBday(bd);
		
	}
	
	public void  editpwd(String pwd,int unum){
		MyApp.arrayUser.get(unum).setPwd(pwd);
		
	}
	
	
	public void  editphone(String phone,int unum){
		MyApp.arrayUser.get(unum).setPhone(phone);
		
	}
	
	
	
	
	
	
	

}
