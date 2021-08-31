package gitProject;
import java.util.Scanner;

public class DaireAlan {

	public static void main(String[] args) {
		
		double pi = 3.14, alan;
		int aci, ycap;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Merkez Açýsnýn ölçüsünü giriniz : ");
		
		aci = inp.nextInt();
		
		System.out.println("Yarý çapýn ölçüsünü giriniz : ");
		
		ycap = inp.nextInt();
		
		alan = (pi * (ycap*ycap) * aci) / 360;
		
		System.out.println("Daire diliminin alaný : " + alan);
		
	}

}
