
package p;

import java.util.ArrayList;

public class Product {

	private String name;
	private String category;
	private String description;
	private String image;
	private String price;
	private String availability;
	
	
	
	
	
	
	public Product() {
		super();
	}
	
	
	
	
	void printMenuePurchse() {
		MyApp.logger.info("*****************"+"\n");
		MyApp.logger.info("1 - delete\n ");
		MyApp.logger.info("2- confirm my bag\n");
		MyApp.logger.info("3- go back\n");
		MyApp.logger.info("*****************"+"\n");
		
		
	}
	public void printMenueInnerSearch() {
		MyApp.logger.info("******************************"+"\n");
		MyApp.logger.info("1- add to my purchase bag\n");
	    MyApp.logger.info("2- go back\n ");
	    MyApp.logger.info("******************************"+"\n");
		
	}
	
	
	
	
    public void printMenueForSearchProducts() {
		
		MyApp.logger.info("**************************************************"+"\n");
		MyApp.logger.info("     choices for searching    \n ");
		MyApp.logger.info("1- show everything (no search)\n");
		MyApp.logger.info("2- search depends on Categories(Interior)\n");
		MyApp.logger.info("3- search depends on Categories(Exterior)\n");
		MyApp.logger.info("4- search depends on Categories(Electronics)\n");
		MyApp.logger.info("5- search depends on availability\n");
		MyApp.logger.info("6- search depends on name       \n ");
		 MyApp.logger.info("7- go back to the big menu \n");
		MyApp.logger.info("**************************************************"+"\n");
		
		
		
	}
	

	@Override
	public String toString() {
		String a;
		a=name+"\t"+category+"\t"+this.description+"\t"+this.price+"\t"+this.image+"\t"+this.availability;
		return a;
	}
    
	public Product(String []ar) {
		super();
		this.name = ar[0];
		this.category = ar[1];
		this.description =ar[2];
		this.image = ar[3];
		this.price = ar[4];
		this.availability = ar[5];
	}
	
	
    public void printTitle() {
    	MyApp.logger.info("id\tname\tcategory\tdesc\tprice\timage\tavailab\n\n");
    	
    }
	
	
	public boolean isItInterior(String name) {
		
		for(int i=0;i<MyApp.arrayProduct.size();i++) {
			if((MyApp.arrayProduct.get(i).getName().equals(name))&&(MyApp.arrayProduct.get(i).getCategory().equals("Interior") )	 ) {
				return true;
			}
				
			}
		
		return false;
	}
    
    public boolean isItExterior(String name) {
		
		for(int i=0;i<MyApp.arrayProduct.size();i++) {
		if((MyApp.arrayProduct.get(i).getName().equals(name))&&(MyApp.arrayProduct.get(i).getCategory().equals("Exterior") )	 ) {
			return true;
		}
			
		}
		
		
		return false;
	}
    
    public boolean isItElectronics(String name) {
	
	for(int i=0;i<MyApp.arrayProduct.size();i++) {
	if((MyApp.arrayProduct.get(i).getName().equals(name))&&(MyApp.arrayProduct.get(i).getCategory().equals("Electronics") )	 ) {
		return true;
	}
		
	}
	
	
	return false;
}
    
    public boolean isItAvailable(String name) {
    	
	for(int i=0;i<MyApp.arrayProduct.size();i++) {
	if((MyApp.arrayProduct.get(i).getName().equals(name))&&(MyApp.arrayProduct.get(i).getAvailability().equals("yes") )	 ) {
		return true;
	}
		
	}
	
	
	return false;
}

    public boolean isTheProductExist(String name) {
    	
    	for(int i=0;i<MyApp.arrayProduct.size();i++) {
    	if((MyApp.arrayProduct.get(i).getName().equals(name))	 ) {
    		return true;
    	}
    		
    	}
    	
    	
    	return false;
    }
	
    public int whatIsTheID(String name) {
    	
    	for(int i=0;i<MyApp.arrayProduct.size();i++) {
    		if(name.equals(MyApp.arrayProduct.get(i).getName()))return i;
    		
    		
    	}
    	
    	return -1;
    }
	
	
	
	
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public String getDescription() {
		return description;
	}
	public String getImage() {
		return image;
	}
	public String getPrice() {
		return price;
	}
	public String getAvailability() {
		return availability;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	
	
	
}
