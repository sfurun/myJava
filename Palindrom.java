package gitProject;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Sayý Giriniz : ");	
		int sayi = scn.nextInt();
		
		isPalindrom(sayi);
		
	}
	
	static void isPalindrom(int number)
	{
	     	int ilkdeger = number;        
	        int length = String.valueOf(number).length();
	         
	        int kalan,deger=0;
	        for (int i = 0; i<length; i++){
	             
	            kalan = number % 10;
	            deger = deger * 10 + kalan;
	            number = number /10;
	        }
	         
	        if(deger == ilkdeger){
	            System.out.println(deger + " Palindrom Sayidir.");
	        }else{
	            System.out.println(deger + " Palindrom Sayi Degildir.");
	        }
		
		
	}

}
