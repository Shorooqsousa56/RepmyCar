package p1_in_main;

public class Form {

	String UserName;
	String CarModel;
	String Product;
	String Date;
	
	
	@Override
	public String toString() {
		return "[UserName=" + UserName + ", CarModel=" + CarModel + ", Product=" + Product + ", Date=" + Date
				+ "]";
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getCarModel() {
		return CarModel;
	}
	public void setCarModel(String carModel) {
		CarModel = carModel;
	}
	public String getProduct() {
		return Product;
	}
	public void setProduct(String product) {
		Product = product;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	
	
	
	
}
