package gitProject;

import java.util.Scanner;

public class KdvHesapla {

	public static void main(String[] args) {
		double kdvOran, girTutar, kdvTutar = 0, kdvliTutar;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Tutar Giriniz : ");
		
		girTutar = input.nextDouble();
		
		if(girTutar >= 0 && girTutar <=1000)
		{
			kdvTutar = girTutar * 0.18;
		}
		else if (girTutar > 1000)
		{
			kdvTutar = girTutar * 0.08;
			
		};
		
		kdvliTutar = girTutar + kdvTutar;
		
		System.out.println("Girilen Tutar : " + girTutar);
		System.out.println("KDV Tutarý : " + kdvTutar);
		System.out.println("KDV'li Tutarý : " + kdvliTutar);
			
		
	}

}
