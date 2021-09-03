package gitProject;

import java.util.Scanner;

public class Sinifgecme {

	public static void main(String[] args) {
		
		int mat, fiz, tur, kim, muz;
		double ort;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Matematik Notunu Giriniz : ");
		mat = scn.nextInt();
		mat = (mat > 0 && mat <= 100) ? mat: 0; 
		
		System.out.println("Fizik Notunu Giriniz : ");
		fiz = scn.nextInt();
		fiz = (fiz > 0 && fiz <= 100) ? fiz: 0;
		
		System.out.println("Türkçe Notunu Giriniz : ");
		tur = scn.nextInt();
		tur = (tur > 0 && tur <= 100) ? tur: 0;
		
		System.out.println("Kimya Notunu Giriniz : ");
		kim = scn.nextInt();
		kim = (kim > 0 && kim <= 100) ? kim: 0;
		
		System.out.println("Müzik Notunu Giriniz : ");
		muz = scn.nextInt();
		muz = (muz > 0 && muz <= 100) ? muz: 0;
		
		ort = (mat+fiz+tur+kim+muz)/5;
		
		if(ort<55)
		{
			System.out.println("Kaldýnýz, Notunuz : " + ort);
		}
		else
		{
			System.out.println("Tebrikler geçtiniz!, Notunuz : " + ort);
		}
	}

}
