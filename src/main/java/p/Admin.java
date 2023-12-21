package p;


public class Admin {
	
	private static final String A="**************************";
	
	public void printMenu() {
		MyApp.logger.info(A+"\n");
		MyApp.logger.info("1-product\n");
		MyApp.logger.info("2-customer\n");
		MyApp.logger.info("3-installer\n");
		MyApp.logger.info("4-logout\n");
		
	
		MyApp.logger.info(A+"\n");
			
		
	}
	public void printMenuProduct() {
		MyApp.logger.info(A+"\n");
		MyApp.logger.info("1-view product\n");
		MyApp.logger.info("2-edit product\n");
		MyApp.logger.info("3-delete product\n");
		MyApp.logger.info("4-add product\n");
		MyApp.logger.info("5-go back\n");
		
	
		MyApp.logger.info(A+"\n");
		
		
		
	}

	
	
	
	public void printMenuCustomer() {
		MyApp.logger.info(A+"\n");
		MyApp.logger.info("1-view customer\n");
		MyApp.logger.info("2-delete customer\n");
		MyApp.logger.info("3-go back\n");
		
		
	
		MyApp.logger.info(A+"\n");
		
	}
	
	
	public void printMenuInst() {
		MyApp.logger.info(A+"\n");
		MyApp.logger.info("1-view installation req\n");
		MyApp.logger.info("2-make time free\n");
		MyApp.logger.info("3-make time reserved\n");
		
		MyApp.logger.info("4-view my schedule\n");
		MyApp.logger.info("5-go back\n");
		
		
	
		MyApp.logger.info(A+"\n");
		
		
		
	}
	 public void editProductMenue() {
		 MyApp.logger.info(A+"\n");
		 
		 MyApp.logger.info("1- edit category\n ");
		 MyApp.logger.info("2- edit description \n");
		 MyApp.logger.info("3- edit image \n ");
		 MyApp.logger.info("4- edit price \n");
		 MyApp.logger.info("5- edit availability\n ");
		
		 MyApp.logger.info(A+"\n");
		 
		 
		 
	 }
	

}
