package gitProject;
import java.util.Scanner;

public class Harmonik {

	public static void main(String[] args) {
		double toplam = 0.0; int sayi = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Sayý giriniz : ");
		
		sayi = scn.nextInt();
		
		for(double i=1; i<=sayi; i++)
		{
			toplam+= 1/i;
		}
		
		System.out.println("Sayýlarýn Harmoniði : " + toplam);
		
	}

}
