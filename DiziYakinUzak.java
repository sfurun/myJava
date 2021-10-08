package gitProject;
import java.util.*;

public class DiziYakinUzak {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int dizi[] = {15,12,788,1,-1,-778,2,0};
		Arrays.sort(dizi);
		int altYakin = 0; 
		int ustYakin = 0;
		
		System.out.println("Bir Sayý Giriniz : ");
		int sayi = scn.nextInt();
		
		for(int i: dizi)
		{
			if(sayi>i)
			{
				altYakin = i;
			}
			if(sayi<i)
			{
				ustYakin = i;
				break;
			}
		}
		
		System.out.println("Dizi : " + Arrays.toString(dizi));
		
		System.out.println("Girilen Sayý : " + sayi);
		System.out.println("Girilen Sayidan kucuk en yakin sayi : " + altYakin);
		System.out.println("Girilen Sayidan buyuk en yakin sayi : " + ustYakin);
		
	}

}
