
package p1_in_main;

import java.util.ArrayList;

public class Product {

	private String name;
	private String category;
	private String description;
	private String image;
	private String price;
	private String availability;
	//********
	//id     name      cat     desc      img              price      aval
	//
	
	
	
	public Product() {
		super();
	}
	
	
	
	
	void printMenuePurchse() {
		System.out.println("*****************");
		System.out.println("1 - delete ");
		System.out.println("2- confirm my bag");
		System.out.println("3- go back");
		System.out.println("*****************");
		
		
	}

	@Override
	public String toString() {
		String a;
		a=name+"\t"+category+"\t"+this.description+"\t"+this.price+"\t"+this.image+"\t"+this.availability;
		return a;
	}
    
	public Product(String ar[]) {
		super();
		this.name = ar[0];
		this.category = ar[1];
		this.description =ar[2];
		this.image = ar[3];
		this.price = ar[4];
		this.availability = ar[5];
	}
	public void printMenueInnerSearch() {
		System.out.println("******************************");
		System.out.println("1- add to my purchase bag");
	    System.out.println("2- go back ");
	    System.out.println("******************************");
		
	}
	
	
	
	
    public void printMenueForSearchProducts() {
		
		System.out.println("**************************************************");
		System.out.println("     choices for searching     ");
		System.out.println("1- show everything (no search)");
		System.out.println("2- search depends on Categories(Interior)");
		System.out.println("3- search depends on Categories(Exterior)");
		System.out.println("4- search depends on Categories(Electronics)");
		System.out.println("5- search depends on availability");
		System.out.println("6- search depends on name        ");
		 System.out.println("7- go back to the big menu ");
		System.out.println("**************************************************");
		
		
		
	}
	
	
    public void printTitle() {
    	System.out.println("id\tname\tcategory\tdesc\tprice\timage\tavailab\n");
    	
    }
	
	
	public boolean isItInterior(String name,ArrayList <Product>ar) {
		
		for(int i=0;i<ar.size();i++) {
			if((ar.get(i).getName().equals(name))&&(ar.get(i).getCategory().equals("Interior") )	 ) {
				return true;
			}
				
			}
		
		return false;
	}
    
    public boolean isItExterior(String name,ArrayList <Product>ar) {
		
		for(int i=0;i<ar.size();i++) {
		if((ar.get(i).getName().equals(name))&&(ar.get(i).getCategory().equals("Exterior") )	 ) {
			return true;
		}
			
		}
		
		
		return false;
	}
    
    public boolean isItElectronics(String name,ArrayList <Product>ar) {
	
	for(int i=0;i<ar.size();i++) {
	if((ar.get(i).getName().equals(name))&&(ar.get(i).getCategory().equals("Electronics") )	 ) {
		return true;
	}
		
	}
	
	
	return false;
}
    
    public boolean isItAvailable(String name,ArrayList <Product>ar) {
    	
	for(int i=0;i<ar.size();i++) {
	if((ar.get(i).getName().equals(name))&&(ar.get(i).getAvailability().equals("yes") )	 ) {
		return true;
	}
		
	}
	
	
	return false;
}

    public boolean isTheProductExist(String name,ArrayList <Product>ar) {
    	
    	for(int i=0;i<ar.size();i++) {
    	if((ar.get(i).getName().equals(name))	 ) {
    		return true;
    	}
    		
    	}
    	
    	
    	return false;
    }
	
    public int whatIsTheID(String name,ArrayList <Product>ar) {
    	
    	for(int i=0;i<ar.size();i++) {
    		if(name.equals(ar.get(i).getName()))return i;
    		
    		
    	}
    	
    	return -1;
    }
	
	
	////setters and getters
	///////////////////////////////////////////////////////////////////////////////////
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
