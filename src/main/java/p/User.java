
package p;

import java.util.ArrayList;

public class User {
	
	 private String email;
	 private String userName;
	 private String bday;
	 private String pwd;
	 private String phone;
	 public ArrayList<Product>purchaseBag=new ArrayList<>();
	 public ArrayList<Form>myForm=new ArrayList<>();
	 
	 public ArrayList< ArrayList<Product>   >history=new ArrayList<ArrayList<Product>>();
	 
	 
	
	@Override
	public String toString() {
		return " email= " + email + "   ,userName= " + userName + "   ,Bday= " + bday + "   ,pwd= " + pwd + "   ,phone= "
				+ phone ;
	}
	public User(String email, String userName, String bday, String pwd, String phone) {
		super();
		this.email = email;
		this.userName = userName;
		this.bday = bday;
		this.pwd = pwd;
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBday() {
		return bday;
	}
	public void setBday(String bday) {
		this.bday = bday;
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
