package gitProject;
import java.util.Scanner;

public class SayiOrtalama {

	public static void main(String[] args) {
		int sayi, toplam=0, sayac=0;
		double ort = 0;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Sayý Giriniz : ");	
		sayi = scn.nextInt();
		
		for (int i=1;i<=sayi;i++)
		{
			if(i %3 == 0 && i %4 == 0)
			{
				toplam=toplam+i;
				sayac++;				
			}
		}
		
		if (sayac>=1)
		{
			ort = toplam/sayac;
		}
		System.out.println("Sayýlarýn Ortalamasý : " + ort);
	}

}
