package gitProject;

import java.util.Scanner;

public class KiloBoy {

	public static void main(String[] args) {
		int kilo;
		double boy, vki;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("L�tfen boyunuzu (metre cinsinden) giriniz : " );
		boy = inp.nextDouble();
		
		System.out.println("L�tfen kilonuzu giriniz : " );
		kilo = inp.nextInt();
		
		vki = kilo / (boy * boy);
		
		System.out.println("V�cut kilo �ndeksiniz : " + vki);

	}

}
