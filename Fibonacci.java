package gitProject;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	     Scanner scn = new Scanner(System.in);
	        int n1=0,n2=1,n3,n;
	        System.out.print("N Say�s�n� Girin:");
	        n = scn.nextInt();
	        System.out.print(n1+" "+n2);
	  
	 for(int i=2;i<n;++i) 
	 {  
	  n3=n1+n2;  
	  System.out.print(" "+n3);  
	  n1=n2;  
	  n2=n3;  
	 }		
	}
}
