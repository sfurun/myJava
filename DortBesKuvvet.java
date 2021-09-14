package gitProject;
import java.util.Scanner;

public class DortBesKuvvet {

	public static void main(String[] args) {
		double x  = 0, y = 0;
		int sayi;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Sayý Giriniz : ");
		sayi = scn.nextInt();
		
		System.out.println("4 ün Kuvvetleri : ");
		for(int i=1;i<=sayi;i*=4)
		{			
			System.out.println(i);
		}
		
		System.out.println("5 in Kuvvetleri : ");
		for(int j=1;j<=sayi;j*=5)
		{
			System.out.println(j);
		}
	}

}
