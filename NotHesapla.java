package gitProject;

import java.util.Scanner;

public class NotHesapla {

	public static void main(String[] args) {
		
		double mat, fiz, kim, tur, tar, muz, ortNot;
		
		Scanner inpNot = new Scanner(System.in);
		
		System.out.print("Matematik Notunu Giriniz : ");
		mat = inpNot.nextDouble();
		System.out.print("Fizik Notunu Giriniz : ");
		fiz = inpNot.nextDouble();
		System.out.print("Kimya Notunu Giriniz : ");
		kim = inpNot.nextDouble();
		System.out.print("T�rk�e Notunu Giriniz : ");
		tur = inpNot.nextDouble();
		System.out.print("Tarih Notunu Giriniz : ");
		tar = inpNot.nextDouble();
		System.out.print("M�zik Notunu Giriniz : ");
		muz = inpNot.nextDouble();
		
		ortNot = (mat+fiz+kim+tur+tar+muz)/6;
		
			if(ortNot >= 60) {
				System.out.println("Not Ortalaman�z : " + ortNot +  " - > S�n�f� Ge�ti!");
			}
			else
			{
				System.out.println("Not Ortalaman�z : " + ortNot +  " - > S�n�fta Kald�!");
			}
		};
}
