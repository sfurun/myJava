package gitProject;
import java.util.Scanner;

public class TekSayiToplam {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sayi, toplam=0;
		
		do {
			System.out.println("Bir Sayý giriniz : ");
			sayi = scn.nextInt();
			if(sayi%2==0&&sayi%4==0)
				toplam += sayi;
		}
		while(sayi%2==0);
		
		System.out.println("Girilen Sayýlarýn Toplamý : " + toplam);
	}

}
