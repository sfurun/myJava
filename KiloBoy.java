package gitProject;

import java.util.Scanner;

public class KiloBoy {

	public static void main(String[] args) {
		int kilo;
		double boy, vki;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz : " );
		boy = inp.nextDouble();
		
		System.out.println("Lütfen kilonuzu giriniz : " );
		kilo = inp.nextInt();
		
		vki = kilo / (boy * boy);
		
		System.out.println("Vücut kilo Ýndeksiniz : " + vki);

	}

}
