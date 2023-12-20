
package p1_in_main;

import java.util.ArrayList;

public class User {
	
	 private String email;
	 private String userName;
	 private String Bday;
	 private String pwd;
	 private String phone;
	 public ArrayList<Product>purchaseBag=new ArrayList<Product>();
	 public ArrayList<Form>myForm=new ArrayList<Form>();
	 
	 public ArrayList< ArrayList<Product>   >history=new ArrayList<ArrayList<Product>>();
	 
	 
	
	@Override
	public String toString() {
		return " email= " + email + "   ,userName= " + userName + "   ,Bday= " + Bday + "   ,pwd= " + pwd + "   ,phone= "
				+ phone ;
	}
	public User(String email, String userName, String bday, String pwd, String phone) {
		super();
		this.email = email;
		this.userName = userName;
		Bday = bday;
		this.pwd = pwd;
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBday() {
		return Bday;
	}
	public void setBday(String bday) {
		Bday = bday;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}
