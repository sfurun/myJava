package gitProject;
import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int sayi1, sayi2, secim;
		double sonuc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Birinci Sayýyý Giriniz : ");
		sayi1 = sc.nextInt();
		
		System.out.println("Ýkinci Sayýyý Giriniz : ");
		sayi2 = sc.nextInt();
		
		System.out.println("Seçim Yapýnýz : \n1:Toplma \n2:Çýkarma \n3:Çarpma \n4:Bölme");
		secim = sc.nextInt();
		
		switch(secim) 
		{
			case 1:
				sonuc = sayi1+sayi2;
				System.out.println("Ýþlemin sonucu : " + sonuc);
				break;
			case 2:
				if(sayi1>sayi2) {
				sonuc = sayi1-sayi2;
				System.out.println("Ýþlemin sonucu : " + sonuc);				
				}
				else
				{
					System.out.println("Küçük sayýdan büyük sayý çýkarýlamaz!");					
				}
				break;
			case 3:
				sonuc = sayi1*sayi2;
				System.out.println("Ýþlemin sonucu : " + sonuc);
				break;
			case 4:
				if(sayi2>0) {
				sonuc = sayi1/sayi2;
				System.out.println("Ýþlemin sonucu : " + sonuc);				
				}
				else if(sayi2 == 0)
				{
					System.out.println("Sýfýra bölme iþlemi yapýlamaz, Mantýksal HATA!");					
				}
				break;
			default :
				System.out.println("Uygun bir seçim yapýlmadý!");
				break;
		}
	}

}
