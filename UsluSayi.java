package gitProject;
import java.util.Scanner;

public class UsluSayi {

	public static void main(String[] args) {
		int x,y,z=1;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Taban Deðerini Giriniz : ");
		x = scn.nextInt();
		
		System.out.println("Üs Deðerini Giriniz : ");
		y = scn.nextInt();
		
		for(int i = 1 ; i<=y; i++)
		{
			z = z*x;
		}
		System.out.println("Sonuç :" + z);
		
	}

}
