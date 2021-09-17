package gitProject;
import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int i=1, j=1, ebob=0, ekok=0;
		
		System.out.println("Birinci Sayýyý Giriniz : ");
		int n1 = scn.nextInt();
		
		System.out.println("Ýkinci Sayýyý Giriniz : ");
		int n2 = scn.nextInt();
		
		if(n1<n2)
		{
			i=n1;
		}
		else
		{
			i=n2;
		}
				
		while(i > 0)
		{
			if(n1%i==0 && n2%i==0)
			{
				ebob = i;
				System.out.println("Sayýlarýn EBOB'u : " + ebob);
				break;
			}		
			i--;		
		}
		
		ekok = (n1*n2)/ebob;
		System.out.println("Sayýlarýn EKOK'u : " + ekok);
	}

}
