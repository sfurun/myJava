package gitProject;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		int sayi, sonBas, toplam=0;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Sayý Giriniz : ");
		sayi = scn.nextInt();
			
		while(sayi!=0)
		{
			sonBas = sayi%10;
			sayi /= 10;
			toplam += sonBas;
		}
			System.out.println("Sayýnýn Basamak Sayýlarýnýn Toplamý : " + toplam);
	}
}
