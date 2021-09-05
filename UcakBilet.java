package gitProject;
import java.util.*;

public class UcakBilet {

	public static void main(String[] args) {
		int km, yas, yolTip;
		double ucToplam;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("KM bilgisiniz giriniz : ");
		km = scn.nextInt();
		
		System.out.println("Yaþ bilgisiniz giriniz : ");
		yas = scn.nextInt();
		
		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ)");
		yolTip = scn.nextInt();
		
		if(yas<0 || km<0 || !(yolTip>=1 && yolTip<=2))
		{
			System.out.println("Hatalý Veri Girdiniz!");
		}
		else
		{
			ucToplam = km*0.10;
			
			if(yas<12)
				ucToplam = ucToplam-(ucToplam*0.5);
			if(yas>=12 && yas<=24)
				ucToplam = ucToplam-(ucToplam*0.1);
			if(yas>65)
				ucToplam = ucToplam-(ucToplam*0.3);
			if(yolTip==2)
				ucToplam = (ucToplam-(ucToplam*0.2))*2;
			
			System.out.println("Toplam Tutar : " + (int)ucToplam + " TL");
		}		
	}

}
