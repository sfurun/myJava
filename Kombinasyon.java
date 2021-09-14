package gitProject;
import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		int x, y, n=1, r=1, q=1, comb=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("n'yi giriniz : ");
		x = scn.nextInt();
		
		System.out.println("r'yi giriniz : ");
		y = scn.nextInt();
		
		for(int i=1;i<=x;i++)
			n*=i;
		System.out.println("n! : " + n);
		
		for(int i=1;i<=y;i++)
			r*=i;
		System.out.println("r! : " + r);
		
		for(int i=1;i<=(x-y);i++)
			q*=i;
		System.out.println("(n-r)! : " + q);
		
		comb = n/(r*(q));
		System.out.println("Kombinasyon Deðeri : " + comb);

	}

}
