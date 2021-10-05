package gitProject;
import java.util.Scanner;

public class DesenMetot {
	
	static int Desen(int sayi) {
		
	   if (sayi < 1)
	   {
		   System.out.print(" " + sayi); 
		   return sayi;		   
	   }
        else {
            System.out.print(" "  + sayi);
  
            Desen(sayi - 5);
  
            System.out.print(" "  + sayi);
            return sayi;
        }		
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Bir Sayý Giriniz : ");
		int sayi = scn.nextInt();
		
		int sonuc =  Desen(sayi);			
	}

}
