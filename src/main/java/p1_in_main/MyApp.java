

package p1_in_main;

import java.util.ArrayList;
import java.util.Scanner;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
public class MyApp {
	public static UserProfile Up=new UserProfile();
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
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
    public static boolean TheProductIsInterior;//only for the test without main
    public static boolean TheProductIsExterior;
    public static boolean TheProductIsElectronics;
    public static boolean TheProductIsExist;
    public static boolean TheProductIsAvailable;
    public static Product pr=new Product();
    
    
    //do not change the order 
    static User u1=new User("s12028923@stu.najah.edu","Samah Qaradeh","19-11-2002","123abc","0594426881");
    static User u2=new User("shorooqsousa@gmail.com","Shoroq123","9-11-2003","123sh","0591038227");
    static User u3=new User("s12029069@stu.najah.edu","Shorooooq45","20-10-2007","123456","0594440337");
    public static String email;
    public static String password;
    //ArrayUser.add(u1);
     public  MyApp() {
    	 //super();
    	 arrayUser.add(0,u1);
		 arrayUser.add(1,u2);
		 arrayUser.add(2,u3);
		 
		 
		 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 arrayProduct.add(p1);
		 arrayProduct.add(p2);
		 arrayProduct.add(p3);
		 arrayProduct.add(p4);
		 arrayProduct.add(p5);
		 arrayProduct.add(p6);
		 
		 
    	
    }
     
 	public static void main(String[] args) {
 		/////////////////////////
 	     arrayUser.add(u1);
 		 arrayUser.add(u2);
 		 arrayUser.add(u3);
 		 
 		 ////////////////////////////////////////////////////////////////////////////////////////////////
 		 arrayProduct.add(p1);
 		 arrayProduct.add(p2);
 		 arrayProduct.add(p3);
 		 arrayProduct.add(p4);
 		 arrayProduct.add(p5);
 		 arrayProduct.add(p6);
 		 
 		 
 		Scanner input =new Scanner (System.in);
 		int n1;
 		boolean b1;

 		while (true) {
 			printLogInSignUpMenue();
 			n1=input.nextInt();
 			
 			if(n1==1) {//log in
 				String s[]=logInForm();
 				isExist(s[0],s[1]);
 				if(isLogIn) {//valid log in as customer,installer,admin
 					System.out.println("log in Succeded");
 				/////////////////////////////////////////////////////////////////////////////////////////////////////	
 				if(r.isCustomer(s[0],s[1], arrayUser)) {
 					//1- show products
 					//2- purchase bag
 					//3- view orders history
 					//4- make installation
 					//5- view install history
 					//6- view my profile
 					//7- edit my profile
 					//8- log out
 					int fi;
 					while(true) {
 					printCustomerMenu();
 					fi=input.nextInt();
 					if(fi==1) {//1- show products
 						while(true) {
 							pr.printMenueForSearchProducts();
 							int z=input.nextInt();
 							if(z==1) {//1- show everything (no search)
 								pr.printTitle();
 								for(int i=0; i<arrayProduct.size();i++) {
 									System.out.println(i+"\t"+arrayProduct.get(i));
 									
 								}
 								while(true) {
 								pr.printMenueInnerSearch();
 								int ce;
 								ce=input.nextInt();
 								if(ce==1) {
 									
 									while(true) {
 									System.out.println("Please enter the number to add to purchase bag");
 									int a=input.nextInt();
 									if(a<arrayProduct.size() && ( a>=0) &&  arrayProduct.get(a).isItAvailable(arrayProduct.get(a).getName(), arrayProduct) ) {
 										arrayUser.get(userNumber).purchaseBag.add(arrayProduct.get(a)   );
 									
 										System.out.println("we add to the bag successfully!");
 										break;
 									}
 									
 									}
 									
 									
 								}
 								else if(ce==2) {
 									break;
 								}
 								
 								}
 								
 								
 							}
 							else if(z==2) {//2- search depends on Categories(Interior)
 								
 								pr.printTitle();
 								for(int i=0; i<arrayProduct.size();i++) {
 									if( arrayProduct.get(i).isItInterior(arrayProduct.get(i).getName(), arrayProduct)      )
 									System.out.println(i+"\t"+arrayProduct.get(i));
 									
 								}
 								
 								while(true) {
 									pr.printMenueInnerSearch();
 									int ce;
 									ce=input.nextInt();
 									if(ce==1) {
 										
 										while(true) {
 										System.out.println("Please enter the number to add to purchase bag");
 										int a=input.nextInt();
 										if(a<arrayProduct.size() && ( a>=0) &&  arrayProduct.get(a).isItAvailable(arrayProduct.get(a).getName(), arrayProduct)&&arrayProduct.get(a).isItInterior(arrayProduct.get(a).getName(), arrayProduct)  ) {
 											arrayUser.get(userNumber).purchaseBag.add(arrayProduct.get(a)   );
 										
 											System.out.println("we add to the bag successfully!");
 											break;
 										}
 										
 										}
 										
 										
 									}
 									else if(ce==2) {
 										break;
 									}
 									
 									}
 								
 								
 								
 								
 							}
 							else if (z==3) {//search depends on Categories(Exterior)
 								
 								
 								pr.printTitle();
 								for(int i=0; i<arrayProduct.size();i++) {
 									if( arrayProduct.get(i).isItExterior(arrayProduct.get(i).getName(), arrayProduct)      )
 									System.out.println(i+"\t"+arrayProduct.get(i));
 									
 								}
 								
 								while(true) {
 									pr.printMenueInnerSearch();
 									int ce;
 									ce=input.nextInt();
 									if(ce==1) {
 										
 										while(true) {
 										System.out.println("Please enter the number to add to purchase bag");
 										int a=input.nextInt();
 										if(a<arrayProduct.size() && ( a>=0) &&  arrayProduct.get(a).isItAvailable(arrayProduct.get(a).getName(), arrayProduct)&&arrayProduct.get(a).isItExterior(arrayProduct.get(a).getName(), arrayProduct)  ) {
 											arrayUser.get(userNumber).purchaseBag.add(arrayProduct.get(a)   );
 										
 											System.out.println("we add to the bag successfully!");
 											break;
 										}
 										
 										}
 										
 										
 									}
 									else if(ce==2) {
 										break;
 									}
 									
 									}
 								
 								
 								
 								
 								
 								
 								
 								
 							}
 else if (z==4) {//search depends on Categories(Electronics)
 								
 								pr.printTitle();
 								for(int i=0; i<arrayProduct.size();i++) {
 									if( arrayProduct.get(i).isItElectronics(arrayProduct.get(i).getName(), arrayProduct)      )
 									System.out.println(i+"\t"+arrayProduct.get(i));
 									
 								}
 								
 								while(true) {
 									pr.printMenueInnerSearch();
 									int ce;
 									ce=input.nextInt();
 									if(ce==1) {
 										
 										while(true) {
 										System.out.println("Please enter the number to add to purchase bag");
 										int a=input.nextInt();
 										if(a<arrayProduct.size() && ( a>=0) &&  arrayProduct.get(a).isItAvailable(arrayProduct.get(a).getName(), arrayProduct)&&arrayProduct.get(a).isItElectronics(arrayProduct.get(a).getName(), arrayProduct)  ) {
 											arrayUser.get(userNumber).purchaseBag.add(arrayProduct.get(a)   );
 										
 											System.out.println("we add to the bag successfully!");
 											break;
 										}
 										
 										}
 										
 										
 									}
 									else if(ce==2) {
 										break;
 									}
 									
 									}
 								
 								
 								
 								
 								
 								
 							}
 							else if (z==5) {//search depends on availability
 								
 								pr.printTitle();
 								for(int i=0; i<arrayProduct.size();i++) {
 									if( arrayProduct.get(i).isItAvailable(arrayProduct.get(i).getName(), arrayProduct)      )
 									System.out.println(i+"\t"+arrayProduct.get(i));
 									
 								}
 								
 								while(true) {
 									pr.printMenueInnerSearch();
 									int ce;
 									ce=input.nextInt();
 									if(ce==1) {
 										
 										while(true) {
 										System.out.println("Please enter the number to add to purchase bag");
 										int a=input.nextInt();
 										if(a<arrayProduct.size() && ( a>=0) &&  pr.isItAvailable(arrayProduct.get(a).getName(), arrayProduct) ) {
 											arrayUser.get(userNumber).purchaseBag.add(arrayProduct.get(a)   );
 										
 											System.out.println("we add to the bag successfully!");
 											break;
 										}
 										
 										}
 										
 										
 									}
 									else if(ce==2) {
 										break;
 									}
 									
 									}
 								
 								
 								
 											
 								
 								
 							}
 							else if(z==6) {//search depends on name
 								
 								pr.printTitle();
 								for(int i=0; i<arrayProduct.size();i++) {
 									System.out.println(i+"\t"+arrayProduct.get(i));
 									
 								}
 								while(true) {
 								pr.printMenueInnerSearch();
 								int ce;
 								ce=input.nextInt();
 								if(ce==1) {
 									
 									while(true) {
 									System.out.println("Please enter the product name to add to purchase bag");
 									String a=input.next();
 									//if(a<arrayProduct.size() && ( a>=0) &&  arrayProduct.get(a).isItAvailable(arrayProduct.get(a).getName(), arrayProduct) ) {
 									if(pr.isTheProductExist(a, arrayProduct)&&pr.isItAvailable(a,arrayProduct))
 									{
 										int q=pr.whatIsTheID(a, arrayProduct);
 										arrayUser.get(userNumber).purchaseBag.add(arrayProduct.get(q)   );///
 										
 										
 										
 										System.out.println("we add to the bag successfully!");
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
 					else if(fi==2) {//2- purchase bag
 						boolean flag1=false;
 						if(arrayUser.get(userNumber).purchaseBag.size()>0) {
 						
 						pr.printTitle();
 						for(int i=0; i<arrayUser.get(userNumber).purchaseBag.size();i++) {
 							System.out.print(i+"\t");
 					    System.out.println(arrayUser.get(userNumber).purchaseBag.get(i));
 						}
 						}
 						else System.out.println("empty burchasebag !");
 						while(arrayUser.get(userNumber).purchaseBag.size()>0) {
 							if(flag1)break;
 							pr.printMenuePurchse();
 							int a=input.nextInt();
 							if(a==1) {
 								while (true) {
 								System.out.println("please enter number you want to delete");
 								int qw=input.nextInt();
 								if(qw>=0 &&  qw< arrayUser.get(userNumber).purchaseBag.size()) {
 									
 									arrayUser.get(userNumber).purchaseBag.remove(qw);
 									flag1=true;
 								break;
 								
 								}
 								
 								}
 							}
 							else if (a==2) {
 								System.out.println("Done succesfully");
 								
 								//ArrayList<Product>pu=new ArrayList<Product>();
 								ArrayList<Product>pu=  (ArrayList)arrayUser.get(userNumber).purchaseBag.clone();
 								arrayUser.get(userNumber).history.add(pu);
 								
 								arrayUser.get(userNumber).purchaseBag.clear();
 								
 						        // Email properties
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
 								System.out.println("please enter valid number");
 							}
 							
 							
 							
 						}
 						
 					}
 					else if(fi==3) {//3- view orders history
 						
 						for(int i=0;i<arrayUser.get(userNumber).history.size(); i++) {
 							System.out.println("***********This is order #"+i+"***********");
 							pr.printTitle();
 							
 							for(int m=0;m<arrayUser.get(userNumber).history.get(i).size(); m++) {
 								System.out.print(m+"\t");
 								System.out.println(
 						arrayUser.get(userNumber).history.get(i).get(m)
 										
 										);
 								
 								
 							}
 							
 							
 						}
 						
 						
 					}
                     else if(fi==4) {//4- make installation
                     	boolean flag=false;
                     	while(true) {
                     	ins.printInstallmenu();
                     	System.out.println("Enter B to Return Back.");
                     	String A=input.next();
                         if(A.equals("B"))break;
                          while(true) {
                         	if( ins.is_the_input_available(A)) {
                         		
                         		if(!ins.is_Free(A)) {
                         			System.out.println("This Date is Reserved Please Choose Another Date!.");
                         			break;
                         		}
                         		else {
                         			 Form F=new Form();
                         		    F.setUserName(arrayUser.get(userNumber).getUserName());
                         		 
                         			System.out.println("Reserved Done Succesfully!.");
                         			ins.make_Reserve(A);
                         			System.out.println("Please Enter Car Model:");
                         			String A2=input.next();
                         			F.setCarModel(A2);
                         			System.out.println("Please Enter Product Name:");
                         			A2=input.next();
                         			System.out.println(" Done Succesfully!.");
                         			F.setProduct(A2);
                         		    F.setDate(ins.myDate(A));
                         		    arrayUser.get(userNumber).myForm.add(F);
                         		    installForm.add(F);
                         		    
                         		    notification("installation done succesfully "+F);
                         		    int us=userNumber;
                         		    userNumber=1;
                         		    notification("There is customer who make install request"+F);
                         		    userNumber=us;
                         		    
                         			flag=true;
                         			break;
                         			
                         		}
                         		
                         		
                         		
                         		
                         	}
                         	else {
                         		System.out.println("You Have Entered Invalid Input Please Try Again!.");
                         		break;
                         	}
                         	
                         	 
                          }
                          if(flag==true)break;
                     	}
                     	
                     	
 						
 					}
                     else if(fi==5) {//5- view install history
 						for(int i=0;i<arrayUser.get(userNumber).myForm.size();i++) {
 							
 							System.out.println("Form "+i+":"+arrayUser.get(userNumber).myForm.get(i));
 							System.out.println("****************************************************");
 							
 							
 	
 						}
                     	
                     	
 					}
                     else if(fi==6) {//6- view my profile
 						System.out.println(arrayUser.get(userNumber));
 					}
                     else if(fi==7) {//7- edit my profile
                     	while(true) {
                     		
                     		Up.editUserProfileMenue();
                     		int as=input.nextInt();
                     		String sss;
                     		if(as==1) {
                     			System.out.println("please enter your new user name");
                     			sss=input.next();
                     			Up.editUserName(sss, userNumber, arrayUser);
                     			break;
                     		}
                     		else if(as==2) {
                     			System.out.println("please enter your new birthday");
                     			sss=input.next();
                     			Up.editbday(sss, userNumber, arrayUser);
                     			break;
                     			
                     			
                     		}
                     		else if(as==3) {
                     			System.out.println("please enter your new password");
                     			sss=input.next();
                     			Up.editpwd(sss, userNumber, arrayUser);
                     			break;
                     			
                     		}
                     		else if(as==4) {
                     			
                     			System.out.println("please enter your new phone number");
                     			sss=input.next();
                     			Up.editphone(sss, userNumber, arrayUser);
                     			break;
                     			
                     		}
                     		else if(as==5) {
                     			
                     			break;
                     		}
                     		
                     		
                     		
                     	}
                     	
 						
 					}
                     else if(fi==8) {//8- log out
 						break;
 					}
                     else {
                     System.out.println("You have entered invalid number, please try again")	;
                     }
 					
 					
 					}//loop for the customer
 					
 					
 					
 					
 					
 				}
 				else if(r.isAdmin(s[0],s[1])) {
 					
 					
 					while(true) {
 					myAdmin.printMenu();
 					int a=input.nextInt();
 					if(a==1) {//product
 						
 						while(true) {
 						myAdmin.printMenuProduct();
 						int q=input.nextInt();
 						if(q==1) {
 							pr.printTitle();
 							for(int i=0; i<arrayProduct.size();i++) {
 								System.out.print(i+"\t");
 								System.out.println(arrayProduct.get(i));
 							}
 							
 							
 						}
 						else if(q==2) {//edit product
 							pr.printTitle();
 							for(int i=0; i<arrayProduct.size();i++) {
 								System.out.print(i+"\t");
 								System.out.println(arrayProduct.get(i));}
 							boolean f=false;
 							while(true) {
 								if(f)break;
 								System.out.println("select id you want to edit");
 								int c=input.nextInt();
 								if((c>-1 )&&  (c<arrayProduct.size())) {
 									myAdmin.editProductMenue();
 									while(true) {
 									int y=input.nextInt();
 									if(y>0 && y<6) {
 									f=true;
 									/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 									
 									System.out.println("Please enter the new value");
 									String z=input.next();
 									if(y==1)arrayProduct.get(c).setCategory(z);
 									else if(y==2)arrayProduct.get(c).setDescription(z);
 									else if (y==3)arrayProduct.get(c).setImage(z);
 								    else if (y==4)arrayProduct.get(c).setPrice(z);
 								  	else if (y==5)arrayProduct.get(c).setAvailability(z); 	
 										
 									
 									break;	
 									}
 									else {
 										System.out.println("please enter valid input");
 									}
 									}
 								}
 								
 								
 							}
 							
 							
 							
 							
 							
 						}
 						else if(q==3) {//delete product
 							pr.printTitle();
 							for(int i=0; i<arrayProduct.size();i++) {
 								System.out.print(i+"\t");
 								System.out.println(arrayProduct.get(i));}
 							while(true) {
 								System.out.println("enter index you want to delete");
 								int g;
 								g=input.nextInt();
 								if((g<0)||g>arrayProduct.size())System.out.println("please enter valid input");
 								else {
 									arrayProduct.remove(g);
 									System.out.println("done successfully");
 									
 									
 									break;
 								}
 							}
 							
 						}
 						else if (q==4) {
 							//break;
 							String ar[]=new String[6];
 							System.out.println("Please enter name");
 							ar[0]=input.next();
 							System.out.println("Please enter category");
 							ar[1]=input.next();
 							System.out.println("Please enter description");
 							ar[2]=input.next();
 							
 							System.out.println("Please enter price");
 							ar[4]=input.next();
 							 
 							System.out.println("Please enter image");
 							ar[3]=input.next();
 							
 							System.out.println("Please enter availability");
 							ar[5]=input.next();
 							
 							Product qw=new Product(ar);
 							arrayProduct.add(qw);
 							
 							
 							
 						}
 						else if (q==5) {
 							break;
 							
 						}
 						else {
 							System.out.println("please enter valid input");
 							
 						}
 						
 						
 						}
 					}
 					else if (a==2) {//customer
 						
 						
 						
 						
 						while(true) {
 							myAdmin.printMenuCustomer();
 							int u=input.nextInt();
 							if(u==1) {
 								for(int i=2;i<arrayUser.size();i++) {
 									System.out.print((i-2)+"- ");
 									System.out.println(arrayUser.get(i));
 							
 							}
 								
 							}
 							else if(u==2) {
 								for(int i=2;i<arrayUser.size();i++) {
 									System.out.print((i-2)+"- ");
 									System.out.println(arrayUser.get(i));
 							
 							}
 								while(true) {
 									int y=input.nextInt();
 									if((y>=0)&&(y<(arrayUser.size()-2))) {
 										arrayUser.remove(y+2);
 										
 										break;
 									}
 									else {
 										System.out.println("please enter valid input");
 									}
 								}
 								
 								
 							}
 							else if (u==3) {
 								break;
 							}
 							else {
 								System.out.println("please enter valid");
 							}
 							
 						}
 						
 						
 						
 					}
 					else if(a==3) {//installer
 						
 						instFun();
 						
 						
 					}
 					else if(a==4) {//logout
 						break;
 					}
 					else {
 						System.out.println("please enter valid input");
 					}
 					
 					}
 					
 					
 					
 					
 					
 					
 				}
                 else if(r.isInstaller(s[0],s[1])) {
                 	instFun();
 					
 				}
 				
 				
 					
 					
 					
 					
 					
 					
 					
 					
 				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
 					
 				}
 				else {
 					
 					System.out.println("You have enter invalid parameter ,please try again!");
 				}
 				
 				
 				
 			}
 			else if(n1==2) {//sign up
 				String s[]=signUpForm();
 				isValidSignUp(s);
 				if(isSignUp) {
 					User qw=new User(s[0],s[1],s[2],s[3],s[4]);
 					arrayUser.add(qw);
 					System.out.println("Sign Up succeded!");
 					
 				}else {
 					System.out.println("Sign Up failed! please try again");
 					
 				}
 				
 			}
 			else {//invalid input
 				System.out.println("You have entered invalid input, please try again!");
 				//for(int i=0;i<arrayUser.size();i++) {
 				//System.out.println(arrayUser.get(i).getBday());}
 			}
 			
 			
 		}//end the big while
 		
       
 		
 	}//main
 	
 	
   
	public static void instFun() {
		while(true) {
			Scanner input =new Scanner(System.in);
			
			myAdmin.printMenuInst();
			int za=input.nextInt();
			if(za==1) {
		for(int i=0;i<installForm.size();i++) {
			System.out.println(installForm.get(i));
			
		}
				
				
			}
			else if(za==2) {
				ins.printInstallmenu();
				System.out.println("please enter symbol");
				while(true) {
				String u=input.next();
				if(ins.is_the_input_available(u)) {
					ins.make_Free(u);
					
					break;
				}
				else {
					System.out.println("please enter valid input");
				}
				}
			}
            else if(za==3) {
            	ins.printInstallmenu();
				System.out.println("please enter symbol");
				while(true) {
				String u=input.next();
				if(ins.is_the_input_available(u)) {
					ins.make_Reserve(u);
					
					break;
				}
				else {
					System.out.println("please enter valid input");
				}
				}
				
			}
            else if(za==4) {
            	ins.printInstallmenu();
            	
            }
            else if(za==5) {
            	break;
            }
            else {
            	System.out.println("Please enter valid input");
            }
			
			
		}
		
	}
	
	
	public static void notification(String u) {
		

		n=true;
		
	    final String username = "s12028923@stu.najah.edu";
        final String password = "qcxb ceer pebu fkgn";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {//s12029069@stu.najah.edu
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("s12028923@stu.najah.edu"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(arrayUser.get(userNumber).getEmail()));
            message.setSubject("confirmation");
            
           
                     message.setText(u);
            Transport.send(message);
          //  flagNotificationOrder=true;

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
		
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
        

        // Print the top row of stars
        for (int i = 0; i < menuWidth + 2; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the menu items with stars on the left and right columns
        
        for (String item : menuItems) {
            System.out.println(" "+ item );

        }

        // Print the bottom row of stars
        for (int i = 0; i < menuWidth + 2; i++) {
            System.out.print("*");
        }
        System.out.println();
}
	
	public static void printLogInSignUpMenue() {
        int menuWidth = 30;
        String[] menuItems = {
                "1. Log  IN",
                "2. Sign Up"

        };
        String menu = "Welcome to Car Accessories";

        // Print the top row of stars
        for (int i = 0; i < menuWidth + 2; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the menu items with stars on the left and right columns
        System.out.println(" " + menu);
        for (String item : menuItems) {
            System.out.println(" "+ item );

        }

        // Print the bottom row of stars
        for (int i = 0; i < menuWidth + 2; i++) {
            System.out.print("*");
        }
        System.out.println();
}
	
	/////////
	public static boolean isVaildParameterInTheMenue(int a,int sizeOfMenue) {
		
		if(a<1) {return false;}
		if(a>sizeOfMenue) {return false;}
		return true;
	}
	
	
	public static String[]logInForm(){
		String s1,s2;
		System.out.print("Please enter your email:");
		Scanner input=new Scanner(System.in);
		s1=input.next();
		System.out.println();
		System.out.print("Please enter your password:");
		s2=input.next();
		System.out.println();
		String s[]= {s1,s2};
		return s;
		
	}

	public static String [] signUpForm() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Your Email:");
		String email = input.next();
		 System.out.println();
			
			
		System.out.print("Please Enter Your Name:");
		String name = input.next();
		 System.out.println();
			
		System.out.print("Please Enter Your Birthdate:");
		String bd = input.next();
		 System.out.println();
			
		System.out.print("Please Enter Your Password:");
		String password = input.next();
		 System.out.println();
			
		System.out.print("Please Enter Your PhoneNumber:");
		String number = input.next();
		 System.out.println();
		 
		String information[]= {email,name,bd,password,number};
	
		return information;
		
		
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
		
		
		}//end for
		
		 isLogIn=q;
		
		
		//return q;
	}
	
	
	public static void isReservedEmail(String em) {
		boolean q=true;
		for(int i=0;i<arrayUser.size();i++) {
			if(arrayUser.get(i).getEmail().equals(em)) {
				q=false;
				//isSignUp=false;
				
				}
			
		}
		isSignUp=q;
		
		//return isReserved;
		
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
		boolean s,c,n,sp;
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
		//email username bDay pwd phone
		 boolean f1,f2,f3;
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
		// TODO Auto-generated method stub
		isLogIn=false;
	}
    
	
	
	

}//class



