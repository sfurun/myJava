package gitProject;
import java.util.Scanner;

public class RecExpFunc {

	static int funcUs(int a, int b)
	{	
		if(a==1||b==0)
		{
			return 1;
		}
		return a * funcUs(a, b-1);		
	}	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Taban Giriniz : ");
		int a = scn.nextInt();
		
		System.out.println("Üs Giriniz : ");
		int b = scn.nextInt();
		
		int sonuc = funcUs(a, b);
		
		System.out.println("Sonuç : " + sonuc);		
	}

}
