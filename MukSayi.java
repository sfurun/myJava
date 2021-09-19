package gitProject;
import java.util.Scanner;

public class MukSayi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sayi, topla=0;
		
		System.out.println("Bir sayý giriniz : ");
		sayi=scn.nextInt();
		
		for(int i = 1;i<sayi;i++)
		{
			if(sayi%i==0)
			{
				topla+=i;
			}
		}
		
		if(topla==sayi)
		{
			System.out.println(sayi + " Mükemmel bir sayýdýr");
		}
		else
		{
			System.out.println(sayi + " Mükemmel bir sayý deðildir");
		}
	}

}
