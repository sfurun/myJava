package gitProject;
import java.util.Scanner;

public class MukSayi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sayi, topla=0;
		
		System.out.println("Bir say� giriniz : ");
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
			System.out.println(sayi + " M�kemmel bir say�d�r");
		}
		else
		{
			System.out.println(sayi + " M�kemmel bir say� de�ildir");
		}
	}

}
