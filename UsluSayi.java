package gitProject;
import java.util.Scanner;

public class UsluSayi {

	public static void main(String[] args) {
		int x,y,z=1;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Taban De�erini Giriniz : ");
		x = scn.nextInt();
		
		System.out.println("�s De�erini Giriniz : ");
		y = scn.nextInt();
		
		for(int i = 1 ; i<=y; i++)
		{
			z = z*x;
		}
		System.out.println("Sonu� :" + z);
		
	}

}
