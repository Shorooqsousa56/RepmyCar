
package p_1;

import java.util.Arrays;


public class InstallReq {
	
	protected static char[][] values = new char[6][6];
	protected static String[] menuDays = {
             "Saturday  ",
             "Sunday    " ,
             "Monday    ",
             "Tuesday   ",
             "Wednesday ",
             "Thursday  "

     };
	 
	protected static String[] menuhours = {
             "08:00-09:00",
             "09:00-10:00" ,
             "10:00-11:00",
             "11:00-12:00",
             "12:00-13:00",
             "13:00-14:00"

     };
	public InstallReq() {
		 Arrays.fill(values[0], 'R');  
		 Arrays.fill(values[1], 'F');
		 Arrays.fill(values[2], 'R');
		 Arrays.fill(values[3], 'F');
		 Arrays.fill(values[4], 'R');
		 Arrays.fill(values[5], 'F');
		
		
	}
	 public boolean istheinputavailable(String a) {boolean kk=true;
		if(a.length()>2)kk=false;
		if(a.length()<2)kk=false;
		
		char c1=a.charAt(0);
		char c2=a.charAt(1);
		
		if(  (c1>'5')  ||   (c1<'0' )   )kk= false;
		if(  (c2>'5')  ||   (c2<'0' )   )kk=false;
		
		return kk;
		
		
	}
	
	public boolean isFree(String a) {
		
		
	
boolean rwe=false;
		char c1=a.charAt(0);
		char c2=a.charAt(1);
		
		int r=c1-'0';
		int c=c2-'0';
		
	if(values[r][c]=='F')rwe= true;
	
	return rwe;
		
		
	}
	
	public static void makeFree(String a) {
		char c1=a.charAt(0);
		char c2=a.charAt(1);
		
		int r=c1-'0';
		int c=c2-'0';
		
		values[r][c]='F';
		
	}
	public static void makeReserve(String a) {
		char c1=a.charAt(0);
		char c2=a.charAt(1);
		
		int r=c1-'0';
		int c=c2-'0';
		
		values[r][c]='R';
		
	}

	
	public static String myDate(String number) {  
		char s1=number.charAt(0);
		char s2=number.charAt(1);
		
		int d=s1-'0';
		int h=s2-'0';
		return menuDays[d]+" "+menuhours[h];
		
		
		
	}

	public static void printInstallmenu() {
		
		
		 
		 int i=0;
		MyApp.logger.info("\t");
		 for(int j=0;j<6;j++) {
			 String uvb="\t"+menuhours[j];
			 MyApp.logger.info(uvb);

		 }
		 
		 MyApp.logger.info("\n");
		 
		
		 
		 for (int r=0; r<6; r++) {
			 String zpo=menuDays[i++]+"\t";
			 MyApp.logger.info(zpo);
	            for (int c=0; c<6; c++) {
	            	
	            	String s1 = Integer.toString(r); 
	                String s2 =Integer.toString(c); 
	            		  String u=s1+s2+"-"+values[r][c]+"\t\t";     
	         
	                MyApp.logger.info(u);

	            }
	            MyApp.logger.info("\n");
	           
	        }
		
		 
	}
	
	
	
}
