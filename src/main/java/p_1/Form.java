package p_1;

public class Form {

	String userName;
	String carModel;
	String product;
	String date;
	
	
	@Override
	public String toString() {
		return "[UserName=" + userName + ", CarModel=" + carModel + ", Product=" + product + ", Date=" + date
				+ "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
}
