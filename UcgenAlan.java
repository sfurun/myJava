package gitProject;
import java.util.Scanner;

public class UcgenAlan {

	public static void main(String[] args) {
		int a, b, c ;
		double u=0, alan=0;
		
		Scanner imp = new Scanner(System.in);
		
		
		System.out.println("Birinci Kenar� Giriniz : ");
		a = imp.nextInt();
		System.out.println("�kinci Kenar� Giriniz : ");
		b = imp.nextInt();
		System.out.println("���nc� Kenar� Giriniz : ");
		c = imp.nextInt();
		
		if(a>0&&b>0&&c>0)
		{
			u = (a+b+c)/2;
			alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		}
		
		System.out.println("��genin alan� :" + alan );	

	}

}
