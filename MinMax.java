package gitProject;
import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {
		int n, say, max=0, min=0;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Kaç tane sayý gireceksiniz : ");		
		n = scn.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+".Sayýyý Giriniz : ");
			say = scn.nextInt();
			
			if(max<say)
			{
				max=say;				
				if(min==0)
					min=say;
			}			
			if(say<min)
				min=say;			
		}
		
		System.out.println("Girilen Maksimum Sayý : " + max);
		System.out.println("Girilen Minumum Sayý : " + min);
	}

}
