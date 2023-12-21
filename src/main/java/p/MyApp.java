

package p;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.*;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
public class MyApp {
	 static final Logger logger = Logger.getLogger(MyApp.class.getName());
    static {
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return  record.getMessage();
            }
        });
        try {
        logger.addHandler(consoleHandler);
       // logger.setLevel(Level.ALL);
        }catch(Exception e) {
        	
        }
        Logger rootLogger = Logger.getLogger("");
        Handler[] handlers = rootLogger.getHandlers();
        if (handlers[0] instanceof ConsoleHandler) {
            rootLogger.removeHandler(handlers[0]);
        }
    }
	public static UserProfile up=new UserProfile();
	public boolean t=true;
	public static boolean n=false;
    public static Admin myAdmin =new Admin();
	public static int userNumber;
	public static boolean isLogIn;
	public static boolean isSignUp=false;
	public static RoleMain r=new RoleMain();
	public static install_req ins=new install_req();
    public static ArrayList<User> arrayUser=new ArrayList<User>();
    public static ArrayList<Form> installForm=new ArrayList<Form>();
    private static final String MSGPB="Please enter the number to add to purchase bag";
    private static final String MSGADD="we add to the bag successfully!";
    private static final String MSGADMN="s12028923@stu.najah.edu";
    private static final String MSGINVALID= "please enter valid input";
  
    public static ArrayList<Product> arrayProduct=new ArrayList<Product>();
    public static String ar0[]= {"p1","Interior","descr1","imgpath1","10$","yes"};
    public static String ar1[]= {"p2","Interior","descr2","imgpath2","20$","no"};
    public static String ar2[]= {"p3","Exterior","descr3","imgpath3","30$","yes"};
    public static String ar3[]= {"p4","Exterior","descr4","imgpath4","40$","no"};
    public static String ar4[]= {"p5","Electronics","descr5","imgpath5","50$","yes"};
    public static String ar5[]= {"p6","Electronics","descr6","imgpath6","60$","no"};
    static Product p1=new Product(ar0);
    static Product p2=new Product(ar1);
    static Product p3=new Product(ar2);
    static Product p4=new Product(ar3);
    static Product p5=new Product(ar4);
    static Product p6=new Product(ar5);
    public static boolean theProductIsInterior;
    public static boolean theProductIsExterior;
    public static boolean theProductIsElectronics;
    public static boolean theProductIsExist;
    public static boolean theProductIsAvailable;
    public static Product pr=new Product();
    
    
   
    static User u1=new User(MSGADMN,"Samah Qaradeh","19-11-2002","123abc","0594426881");
    static User u2=new User("shorooqsousa@gmail.com","Shoroq123","9-11-2003","123sh","0591038227");
    static User u3=new User("s12029069@stu.najah.edu","Shorooooq45","20-10-2007","123456","0594440337");
    public static String email;
    public static String password;
   
     public  MyApp() {
    	 
    	 arrayUser.add(0,u1);
		 arrayUser.add(1,u2);
		 arrayUser.add(2,u3);
		 
		 
		
		 arrayProduct.add(p1);
		 arrayProduct.add(p2);
		 arrayProduct.add(p3);
		 arrayProduct.add(p4);
		 arrayProduct.add(p5);
		 arrayProduct.add(p6);
		 
		 
    	
    }
    
     public static void main(String[] args) {
  		
  	     arrayUser.add(u1);
  		 arrayUser.add(u2);
  		 arrayUser.add(u3);
  		 
  		 arrayProduct.add(p1);
  		 arrayProduct.add(p2);
  		 arrayProduct.add(p3);
  		 arrayProduct.add(p4);
  		 arrayProduct.add(p5);
  		 arrayProduct.add(p6);
  		 
  		 
  		Scanner input =new Scanner (System.in);
  		int n1;
  		

  		while (true) {
  			printLogInSignUpMenue();
  			n1=input.nextInt();
  			
  			if(n1==1) {
  				String s[]=logInForm();
  				isExist(s[0],s[1]);
  				if(isLogIn) {
  					logger.info("log in Succeded\n");
  					
  				if(r.isCustomer(s[0],s[1], arrayUser)) {
  					
  					int fi;
  					while(true) {
  					printCustomerMenu();
  					fi=input.nextInt();
  					if(fi==1) {
  						while(true) {
  							pr.printMenueForSearchProducts();
  							int z=input.nextInt();
  							if(z==1) {
  								pr.printTitle();
  								for(int i=0; i<arrayProduct.size();i++) {
  									logger.info(i+"\t"+arrayProduct.get(i)+"\n");
  									
  								}
  								while(true) {
  								pr.printMenueInnerSearch();
  								int ce;
  								ce=input.nextInt();
  								if(ce==1) {
  									
  									while(true) {
  									logger.info(MSGPB+"\n");
  									int a=input.nextInt();
  									if(a<arrayProduct.size() && ( a>=0) &&  arrayProduct.get(a).isItAvailable(arrayProduct.get(a).getName(), arrayProduct) ) {
  										arrayUser.get(userNumber).purchaseBag.add(arrayProduct.get(a)   );
  									
  										logger.info(MSGADD+"\n");
  										break;
  									}
  									
  									}
  									
  									
  								}
  								else if(ce==2) {
  									break;
  								}
  								
  								}
  								
  								
  							}
  							else if(z==2) {
  								
  								pr.printTitle();
  								for(int i=0; i<arrayProduct.size();i++) {
  									if( arrayProduct.get(i).isItInterior(arrayProduct.get(i).getName(), arrayProduct)      )
  									{logger.info(i+"\t"+arrayProduct.get(i)+"\n");}
  									
  								}
  								
  								while(true) {
  									pr.printMenueInnerSearch();
  									int ce;
  									ce=input.nextInt();
  									if(ce==1) {
  										
  										while(true) {
  										logger.info(MSGPB+"\n");
  										int a=input.nextInt();
  										if(a<arrayProduct.size() && ( a>=0) &&  arrayProduct.get(a).isItAvailable(arrayProduct.get(a).getName(), arrayProduct)&&arrayProduct.get(a).isItInterior(arrayProduct.get(a).getName(), arrayProduct)  ) {
  											arrayUser.get(userNumber).purchaseBag.add(arrayProduct.get(a)   );
  										
  											logger.info(MSGADD+"\n");
  											break;
  										}
  										
  										}
  										
  										
  									}
  									else if(ce==2) {
  										break;
  									}
  									
  									}
  								
  								
  								
  								
  							}
  							else if (z==3) {
  								
  								
  								pr.printTitle();
  								for(int i=0; i<arrayProduct.size();i++) {
  									if( arrayProduct.get(i).isItExterior(arrayProduct.get(i).getName(), arrayProduct)      )
  									{logger.info(i+"\t"+arrayProduct.get(i)+"\n");}
  									
  								}
  								
  								while(true) {
  									pr.printMenueInnerSearch();
  									int ce;
  									ce=input.nextInt();
  									if(ce==1) {
  										
  										while(true) {
  										logger.info(MSGPB+"\n");
  										int a=input.nextInt();
  										if(a<arrayProduct.size() && ( a>=0) &&  arrayProduct.get(a).isItAvailable(arrayProduct.get(a).getName(), arrayProduct)&&arrayProduct.get(a).isItExterior(arrayProduct.get(a).getName(), arrayProduct)  ) {
  											arrayUser.get(userNumber).purchaseBag.add(arrayProduct.get(a)   );
  										
  											logger.info(MSGADD+"\n");
  											break;
  										}
  										
  										}
  										
  										
  									}
  									else if(ce==2) {
  										break;
  									}
  									
  									}
  								
  								
  								
  								
  								
  								
  								
  								
  							}
  else if (z==4) {
  								
  								pr.printTitle();
  								for(int i=0; i<arrayProduct.size();i++) {
  									if( arrayProduct.get(i).isItElectronics(arrayProduct.get(i).getName(), arrayProduct)      )
  									{logger.info(i+"\t"+arrayProduct.get(i)+"\n");}
  									
  								}
  								
  								while(true) {
  									pr.printMenueInnerSearch();
  									int ce;
  									ce=input.nextInt();
  									if(ce==1) {
  										
  										while(true) {
  										logger.info(MSGPB+"\n");
  										int a=input.nextInt();
  										if(a<arrayProduct.size() && ( a>=0) &&  arrayProduct.get(a).isItAvailable(arrayProduct.get(a).getName(), arrayProduct)&&arrayProduct.get(a).isItElectronics(arrayProduct.get(a).getName(), arrayProduct)  ) {
  											arrayUser.get(userNumber).purchaseBag.add(arrayProduct.get(a)   );
  										
  											logger.info(MSGADD+"\n");
  											break;
  										}
  										
  										}
  										
  										
  									}
  									else if(ce==2) {
  										break;
  									}
  									
  									}
  								
  								
  								
  								
  								
  								
  							}
  							else if (z==5) {
  								
  								pr.printTitle();
  								for(int i=0; i<arrayProduct.size();i++) {
  									if( arrayProduct.get(i).isItAvailable(arrayProduct.get(i).getName(), arrayProduct)      )
  									{logger.info(i+"\t"+arrayProduct.get(i)+"\n");}
  									
  								}
  								
  								while(true) {
  									pr.printMenueInnerSearch();
  									int ce;
  									ce=input.nextInt();
  									if(ce==1) {
  										
  										while(true) {
  										logger.info(MSGPB+"\n");
  										int a=input.nextInt();
  										if(a<arrayProduct.size() && ( a>=0) &&  pr.isItAvailable(arrayProduct.get(a).getName(), arrayProduct) ) {
  											arrayUser.get(userNumber).purchaseBag.add(arrayProduct.get(a)   );
  										
  											logger.info(MSGADD+"\n");
  											break;
  										}
  										
  										}
  										
  										
  									}
  									else if(ce==2) {
  										break;
  									}
  									
  									}
  								
  								
  								
  											
  								
  								
  							}
  							else if(z==6) {
  								
  								pr.printTitle();
  								for(int i=0; i<arrayProduct.size();i++) {
  									logger.info(i+"\t"+arrayProduct.get(i)+"\n");
  									
  								}
  								while(true) {
  								pr.printMenueInnerSearch();
  								int ce;
  								ce=input.nextInt();
  								if(ce==1) {
  									
  									while(true) {
  									logger.info("Please enter the product name to add to purchase bag\n");
  									String a=input.next();
  									
  									if(pr.isTheProductExist(a, arrayProduct)&&pr.isItAvailable(a,arrayProduct))
  									{
  										int q=pr.whatIsTheID(a, arrayProduct);
  										arrayUser.get(userNumber).purchaseBag.add(arrayProduct.get(q)   );
  										
  										
  										
  										logger.info(MSGADD+"\n");
  										break;
  										
  									}
  									
  									
  									}
  									
  									
  								}
  								else if(ce==2) {
  									break;
  								}
  								
  								}
  								
  									
  								
  								
  								
  								
  							}
  								
  								
  							
  					
  							else if(z==7) {
  								
  								    
  								
  								
  								break;
  							}
  							
  							
  							
  						}
  						
  						
  					}
  					else if(fi==2) {
  						boolean flag1=false;
  						if(!(arrayUser.get(userNumber).purchaseBag.isEmpty())) {
  						
  						pr.printTitle();
  						for(int i=0; i<arrayUser.get(userNumber).purchaseBag.size();i++) {
  							logger.info(i+"\t");
  					    logger.info(arrayUser.get(userNumber).purchaseBag.get(i)+"\n");
  						}
  						}
  						else logger.info("empty burchasebag !\n");
  						while(!(arrayUser.get(userNumber).purchaseBag.isEmpty())) {
  							if(flag1)break;
  							pr.printMenuePurchse();
  							int a=input.nextInt();
  							if(a==1) {
  								while (true) {
  								logger.info("please enter number you want to delete\n");
  								int qw=input.nextInt();
  								if(qw>=0 &&  qw< arrayUser.get(userNumber).purchaseBag.size()) {
  									
  									arrayUser.get(userNumber).purchaseBag.remove(qw);
  									flag1=true;
  								break;
  								
  								}
  								
  								}
  							}
  							else if (a==2) {
  								logger.info("Done succesfully\n");
  								
  								
  								ArrayList<Product>pu=  (ArrayList)arrayUser.get(userNumber).purchaseBag.clone();
  								arrayUser.get(userNumber).history.add(pu);
  								
  								arrayUser.get(userNumber).purchaseBag.clear();
  								
  						        
  								String u="Your order is confirmed successfully\n";
                                  for(int i=0;i<pu.size();i++) {
                                 	u+=pu.get(i);
                                 	u+="\n";
                                 	 
                                  }
  						      
  								notification(u);
  								
  								
  								
  								
  							}
  							else if(a==3) {
  								break;
  							}
  							else {
  								logger.info("please enter valid number\n");
  							}
  							
  							
  							
  						}
  						
  					}
  					else if(fi==3) {
  						
  						for(int i=0;i<arrayUser.get(userNumber).history.size(); i++) {
  							logger.info("***********This is order #"+i+"***********\n");
  							pr.printTitle();
  							
  							for(int m=0;m<arrayUser.get(userNumber).history.get(i).size(); m++) {
  								logger.info(m+"\t");
  								logger.info(
  						arrayUser.get(userNumber).history.get(i).get(m)+"\n"
  										
  										);
  								
  								
  							}
  							
  							
  						}
  						
  						
  					}
                      else if(fi==4) {
                      	boolean flag=false;
                      	while(true) {
                      	install_req.printInstallmenu();
                      	logger.info("Enter B to Return Back.\n");
                      	String aaazx=input.next();
                          if(aaazx.equals("B")) {break;}
                           while(true) {
                          	if( ins.is_the_input_available(aaazx)) {
                          		
                          		if(!ins.is_Free(aaazx)) {
                          			logger.info("This Date is Reserved Please Choose Another Date!.\n");
                          			break;
                          		}
                          		else {
                          			 Form fffty=new Form();
                          		    fffty.setUserName(arrayUser.get(userNumber).getUserName());
                          		 
                          			logger.info("Reserved Done Succesfully!.\n");
                          			ins.make_Reserve(aaazx);
                          			logger.info("Please Enter Car Model:\n");
                          			String aaanm=input.next();
                          			fffty.setCarModel(aaanm);
                          			logger.info("Please Enter Product Name:\n");
                          			aaanm=input.next();
                          			logger.info(" Done Succesfully!.\n");
                          			fffty.setProduct(aaanm);
                          		    fffty.setDate(install_req.myDate(aaazx));
                          		    arrayUser.get(userNumber).myForm.add(fffty);
                          		    installForm.add(fffty);
                          		    
                          		    notification("installation done succesfully "+fffty);
                          		    int us=userNumber;
                          		    userNumber=1;
                          		    notification("There is customer who make install request"+fffty);
                          		    userNumber=us;
                          		    
                          			flag=true;
                          			break;
                          			
                          		}
                          		
                          		
                          		
                          		
                          	}
                          	else {
                          		logger.info("You Have Entered Invalid Input Please Try Again!.\n");
                          		break;
                          	}
                          	
                          	 
                           }
                           if(flag) {break;}
                      	}
                      	
                      	
  						
  					}
                      else if(fi==5) {
  						for(int i=0;i<arrayUser.get(userNumber).myForm.size();i++) {
  							
  							logger.info("Form "+i+":"+arrayUser.get(userNumber).myForm.get(i)+"\n");
  							logger.info("****************************************************\n");
  							
  							
  	
  						}
                      	
                      	
  					}
                      else if(fi==6) {
  						logger.info(arrayUser.get(userNumber)+"\n");
  					}
                      else if(fi==7) {
                      	while(true) {
                      		
                      		up.editUserProfileMenue();
                      		int as=input.nextInt();
                      		String sss;
                      		if(as==1) {
                      			logger.info("please enter your new user name\n");
                      			sss=input.next();
                      			up.editUserName(sss, userNumber, arrayUser);
                      			break;
                      		}
                      		else if(as==2) {
                      			logger.info("please enter your new birthday\n");
                      			sss=input.next();
                      			up.editbday(sss, userNumber, arrayUser);
                      			break;
                      			
                      			
                      		}
                      		else if(as==3) {
                      			logger.info("please enter your new password\n");
                      			sss=input.next();
                      			up.editpwd(sss, userNumber, arrayUser);
                      			break;
                      			
                      		}
                      		else if(as==4) {
                      			
                      			logger.info("please enter your new phone number\n");
                      			sss=input.next();
                      			up.editphone(sss, userNumber, arrayUser);
                      			break;
                      			
                      		}
                      		else if(as==5) {
                      			
                      			break;
                      		}
                      		
                      		
                      		
                      	}
                      	
  						
  					}
                      else if(fi==8) {
  						break;
  					}
                      else {
                      logger.info("You have entered invalid number, please try again\n")	;
                      }
  					
  					
  					}
  					
  					
  					
  					
  					
  				}
  				else if(r.isAdmin(s[0],s[1])) {
  					
  					
  					while(true) {
  					myAdmin.printMenu();
  					int a=input.nextInt();
  					if(a==1) {
  						
  						while(true) {
  						myAdmin.printMenuProduct();
  						int q=input.nextInt();
  						if(q==1) {
  							pr.printTitle();
  							for(int i=0; i<arrayProduct.size();i++) {
  								logger.info(i+"\t");
  								logger.info(arrayProduct.get(i)+"\n");
  							}
  							
  							
  						}
  						else if(q==2) {
  							pr.printTitle();
  							for(int i=0; i<arrayProduct.size();i++) {
  								logger.info(i+"\t");
  								logger.info(arrayProduct.get(i)+"\n");}
  							boolean f=false;
  							while(true) {
  								if(f)break;
  								logger.info("select id you want to edit\n");
  								int c=input.nextInt();
  								if((c>-1 )&&  (c<arrayProduct.size())) {
  									myAdmin.editProductMenue();
  									while(true) {
  									int y=input.nextInt();
  									if(y>0 && y<6) {
  									f=true;
  									
  									
  									logger.info("Please enter the new value\n");
  									String z=input.next();
  									if(y==1)arrayProduct.get(c).setCategory(z);
  									else if(y==2)arrayProduct.get(c).setDescription(z);
  									else if (y==3)arrayProduct.get(c).setImage(z);
  								    else if (y==4)arrayProduct.get(c).setPrice(z);
  								  	else if (y==5)arrayProduct.get(c).setAvailability(z); 	
  										
  									
  									break;	
  									}
  									else {
  										logger.info(MSGINVALID+"\n");
  									}
  									}
  								}
  								
  								
  							}
  							
  							
  							
  							
  							
  						}
  						else if(q==3) {
  							pr.printTitle();
  							for(int i=0; i<arrayProduct.size();i++) {
  								logger.info(i+"\t");
  								logger.info(arrayProduct.get(i)+"\n");}
  							while(true) {
  								logger.info("enter index you want to delete\n");
  								int g;
  								g=input.nextInt();
  								if((g<0)||g>arrayProduct.size())logger.info(MSGINVALID+"\n");
  								else {
  									arrayProduct.remove(g);
  									logger.info("done successfully\n");
  									
  									
  									break;
  								}
  							}
  							
  						}
  						else if (q==4) {
  							
  							String ar[]=new String[6];
  							logger.info("Please enter name\n");
  							ar[0]=input.next();
  							logger.info("Please enter category\n");
  							ar[1]=input.next();
  							logger.info("Please enter description\n");
  							ar[2]=input.next();
  							
  							logger.info("Please enter price\n");
  							ar[4]=input.next();
  							 
  							logger.info("Please enter image\n");
  							ar[3]=input.next();
  							
  							logger.info("Please enter availability\n");
  							ar[5]=input.next();
  							
  							Product qw=new Product(ar);
  							arrayProduct.add(qw);
  							
  							
  							
  						}
  						else if (q==5) {
  							break;
  							
  						}
  						else {
  							logger.info(MSGINVALID+"\n");
  							
  						}
  						
  						
  						}
  					}
  					else if (a==2) {
  						
  						
  						
  						
  						while(true) {
  							myAdmin.printMenuCustomer();
  							int u=input.nextInt();
  							if(u==1) {
  								for(int i=2;i<arrayUser.size();i++) {
  									logger.info((i-2)+"- ");
  									logger.info(arrayUser.get(i)+"\n");
  							
  							}
  								
  							}
  							else if(u==2) {
  								for(int i=2;i<arrayUser.size();i++) {
  									logger.info((i-2)+"- ");
  									logger.info(arrayUser.get(i)+"\n");
  							
  							}
  								while(true) {
  									int y=input.nextInt();
  									if((y>=0)&&(y<(arrayUser.size()-2))) {
  										arrayUser.remove(y+2);
  										
  										break;
  									}
  									else {
  										logger.info(MSGINVALID+"\n");
  									}
  								}
  								
  								
  							}
  							else if (u==3) {
  								break;
  							}
  							else {
  								logger.info("please enter valid\n");
  							}
  							
  						}
  						
  						
  						
  					}
  					else if(a==3) {
  						
  						instFun();
  						
  						
  					}
  					else if(a==4) {
  						break;
  					}
  					else {
  						logger.info(MSGINVALID+"\n");
  					}
  					
  					}
  					
  					
  					
  					
  					
  					
  				}
                  else if(r.isInstaller(s[0],s[1])) {
                  	instFun();
  					
  				}
  				
  				
  					
  					
  					
  					
  					
  					
  					
  					
  				
  					
  				}
  				else {
  					
  					logger.info("You have enter invalid parameter ,please try again!\n");
  				}
  				
  				
  				
  			}
  			else if(n1==2) {
  				String s[]=signUpForm();
  				isValidSignUp(s);
  				if(isSignUp) {
  					User qw=new User(s[0],s[1],s[2],s[3],s[4]);
  					arrayUser.add(qw);
  					logger.info("Sign Up succeded!\n");
  					
  				}else {
  					logger.info("Sign Up failed! please try again\n");
  					
  				}
  				
  			}
  			else {
  				logger.info("You have entered invalid input, please try again!\n");
  				
  				
  			}
  			
  			
  		}
  		
        
  		
  	}
  	
    
     public String hashPassword(String password) throws NoSuchAlgorithmException {
         MessageDigest digest = MessageDigest.getInstance("SHA-256");
         byte[] encodedHash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
         return bytesToHex(encodedHash);
     }

     private String bytesToHex(byte[] hash) {
         StringBuilder hexString = new StringBuilder();
         for (byte b : hash) {
             String hex = Integer.toHexString(0xff & b);
             if (hex.length() == 1) {
                 hexString.append('0');
             }
             hexString.append(hex);
         }
         return hexString.toString();
     }
 

 	
 	public static void printCustomerMenu() {
         int menuWidth = 30;
         String[] menuItems = {
          
               "1- show products.",
                "2- purchase bag"
                ,"3- view orders history"
                ,"4- make installation"
                ,"5- view install history"
                ,"6- view my profile"
                ,"7- edit my profile"
               , "8- log out"

         };
         

        
         for (int i = 0; i < menuWidth + 2; i++) {
             logger.info("*");
         }
         logger.info("\n");

        
         
         for (String item : menuItems) {
             logger.info(" "+ item +"\n");

         }

        
         for (int i = 0; i < menuWidth + 2; i++) {
             logger.info("*");
         }
         logger.info("\n");
 }
 	
 	public static void printLogInSignUpMenue() {
         int menuWidth = 30;
         String[] menuItems = {
                 "1. Log  IN",
                 "2. Sign Up"

         };
         String menu = "Welcome to Car Accessories";

        
         for (int i = 0; i < menuWidth + 2; i++) {
             logger.info("*");
         }
         logger.info("\n");

       
         logger.info(" " + menu+"\n");
         for (String item : menuItems) {
             logger.info(" "+ item+"\n" );

         }

        
         for (int i = 0; i < menuWidth + 2; i++) {
             logger.info("*");
         }
         logger.info("\n");
 }
 	

 	public static String[]logInForm(){
 		String s1;
 		String s2;
 		logger.info("Please enter your email:");
 		Scanner input=new Scanner(System.in);
 		s1=input.next();
 		logger.info("\n");
 		logger.info("Please enter your password:");
 		s2=input.next();
 		logger.info("\n");
 		
 		return new String[]{s1, s2};
 		
 	}

 	public static String [] signUpForm() {
 		Scanner input = new Scanner(System.in);
 		logger.info("Please Enter Your Email:");
 		String email = input.next();
 		 logger.info("\n");
 			
 			
 		logger.info("Please Enter Your Name:");
 		String name = input.next();
 		 logger.info("\n");
 			
 		logger.info("Please Enter Your Birthdate:");
 		String bd = input.next();
 		 logger.info("\n");
 			
 		logger.info("Please Enter Your Password:");
 		String password = input.next();
 		 logger.info("\n");
 			
 		logger.info("Please Enter Your PhoneNumber:");
 		String number = input.next();
 		 logger.info("\n");
 		 
 		
 	
 		
 		return new String[]{email,name,bd,password,number};
 		
 		
 	}
 
 	
	public static void instFun() {
		while(true) {
			Scanner input =new Scanner(System.in);
			
			myAdmin.printMenuInst();
			int za=input.nextInt();
			if(za==1) {
		for(int i=0;i<installForm.size();i++) {
			logger.info(installForm.get(i)+"\n");
			
		}
				
				
			}
			else if(za==2) {
				install_req.printInstallmenu();
				logger.info("please enter symbol"+"\n");
				while(true) {
				String u=input.next();
				if(ins.is_the_input_available(u)) {
					ins.make_Free(u);
					
					break;
				}
				else {
					logger.info(MSGINVALID+"\n");
				}
				}
			}
            else if(za==3) {
            	install_req.printInstallmenu();
				logger.info("please enter symbol\n");
				while(true) {
				String u=input.next();
				if(ins.is_the_input_available(u)) {
					ins.make_Reserve(u);
					
					break;
				}
				else {
					logger.info(MSGINVALID+"\n");
				}
				}
				
			}
            else if(za==4) {
            	install_req.printInstallmenu();
            	
            }
            else if(za==5) {
            	break;
            }
            else {
            	logger.info(MSGINVALID+"\n");
            }
			
			
		}
		
	}
	
	
 	
	
	public static void notification(String u) {
		

		n=true;
		
	    final String username = MSGADMN;
       // final String password = "qcxb ceer pebu fkgn";
       
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
        	 @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username,"qcxb ceer pebu fkgn");
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(MSGADMN));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(arrayUser.get(userNumber).getEmail()));
            message.setSubject("confirmation");
            
           
                     message.setText(u);
            Transport.send(message);
         

            logger.info("Email sent successfully!\n");

        } catch (MessagingException e) {
          //  e.printStackTrace();
        }
		
	}
	
	
	
	public static boolean isVaildParameterInTheMenue(int a,int sizeOfMenue) {
		boolean m=true;
		if((a<1)||(a>sizeOfMenue) ){m=false;}
		
		
		return m;
	}
	
	
	public static  void isExist(String em,String pas) {
		boolean q=false;
		for(int i=0; i<arrayUser.size(); i++) {
			
		if(arrayUser.get(i).getEmail().equals(em)&&
				arrayUser.get(i).getPwd().equals(pas)) {
			userNumber=i;
			q=true;
			break;
			
		}
		
		
		}
		
		 isLogIn=q;
		
		
		
	}
	
	
	public static void isReservedEmail(String em) {
		boolean q=true;
		for(int i=0;i<arrayUser.size();i++) {
			if(arrayUser.get(i).getEmail().equals(em)) {
				q=false;
				
				
				}
			
		}
		isSignUp=q;
		
		
		
	}

	
	public static void isMissingField( String arS[]) {
		boolean q=true;
		for(int i=0; i<5; i++) {
			
			if(arS[i].isEmpty()) {
				 q=false;
				
			}
		}
		
		
		isSignUp=q;
				
		
		
	}

	
	public static void isSpecialChar(String userName) {
		boolean s;
		boolean c;
		boolean n;
		boolean sp;
		boolean q=true;
		for(int i=0;i<userName.length();i++) {
			s=false; c=false; n=false; sp=false;
			char myChar=userName.charAt(i);
			if((myChar>='a')&&(myChar<='z'))s=true;
			if((myChar>='A')&&(myChar<='Z'))c=true;
			if((myChar>='0')&&(myChar<='9'))n=true;
			if(myChar==' ')sp=true;
			
			if(!(s||c||n||sp)) {
			q=false;
			break;
			}
			
			
			
			
		}
		isSignUp=q;
		
	}
	
	public static void isValidSignUp (String q[]) {
		
		 boolean f1;
		 boolean f2;
		 boolean f3;
		 isReservedEmail(q[0]);
		 f1=isSignUp;
		 isMissingField(q);
		 f2=isSignUp;
		 isSpecialChar(q[1]);
		 f3=isSignUp;
		 
		 if(f1&&f2&&f3)isSignUp=true;
		 else isSignUp=false;
		 
		 
		 
		 
	 }


	public static void logOut() {
		
		isLogIn=false;
	}
    
	
	
	

}


