
package p1_in_main;

import java.util.Arrays;


public class install_req {
	
	public static char[][] values = new char[6][6];
	public static String[] menuDays = {
             "Saturday  ",
             "Sunday    " ,
             "Monday    ",
             "Tuesday   ",
             "Wednesday ",
             "Thursday  "

     };
	 
	public static String[] menuhours = {
             "08:00-09:00",
             "09:00-10:00" ,
             "10:00-11:00",
             "11:00-12:00",
             "12:00-13:00",
             "13:00-14:00"

     };
	public install_req() {
		 Arrays.fill(values[0], 'R');  //
		 Arrays.fill(values[1], 'F');
		 Arrays.fill(values[2], 'R');
		 Arrays.fill(values[3], 'F');
		 Arrays.fill(values[4], 'R');
		 Arrays.fill(values[5], 'F');
		
		
	}
	 public boolean is_the_input_available(String a) {
		if(a.length()>2)return false;
		if(a.length()<2)return false;
		
		char c1=a.charAt(0);
		char c2=a.charAt(1);
		
		if(  (c1>'5')  ||   (c1<'0' )   )return false;
		if(  (c2>'5')  ||   (c2<'0' )   )return false;
		
		return true;
		
		
	}
	
	public boolean is_Free(String a) {
		
		
		//assume a is correct string

		char c1=a.charAt(0);
		char c2=a.charAt(1);
		
		int r=c1-'0';
		int c=c2-'0';
		
	if(values[r][c]=='F')return true;
	
	return false;
		
		
	}
	
	public void make_Free(String a) {
		char c1=a.charAt(0);
		char c2=a.charAt(1);
		
		int r=c1-'0';
		int c=c2-'0';
		
		values[r][c]='F';
		
	}
	public void make_Reserve(String a) {
		char c1=a.charAt(0);
		char c2=a.charAt(1);
		
		int r=c1-'0';
		int c=c2-'0';
		
		values[r][c]='R';
		
	}

	
	public static void printInstallmenu() {
		
		
		 
		 int i=0;
		System.out.print("\t");
		 for(int j=0;j<6;j++) {
			 System.out.print("\t"+menuhours[j]);
		 }
		 
		 System.out.println();
		 
		// System.out.print(menuDays[i++]+"   ");
		 
		 for (int r=0; r<6; r++) {
			 System.out.print(menuDays[i++]+"\t");
	            for (int c=0; c<6; c++) {
	            	
	            	String s1 = Integer.toString(r); 
	                String s2 =Integer.toString(c); 
	            	//char c1=(char)(c+'0');
	            	//char r1=(char)(r+'0');
	                System.out.print(s1+s2+"-"+ values[r][c] + "\t"+"\t");
	            }
	            System.out.println();
	           
	        }
		
		 
	}
	
	public static String myDate(String number) {  
		char s1=number.charAt(0);
		char s2=number.charAt(1);
		
		int d=s1-'0';
		int h=s2-'0';
		return menuDays[d]+" "+menuhours[h];
		
		
		
	}
	
	
	
}
