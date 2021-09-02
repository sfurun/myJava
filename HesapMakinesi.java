package gitProject;
import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int sayi1, sayi2, secim;
		double sonuc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Birinci Say�y� Giriniz : ");
		sayi1 = sc.nextInt();
		
		System.out.println("�kinci Say�y� Giriniz : ");
		sayi2 = sc.nextInt();
		
		System.out.println("Se�im Yap�n�z : \n1:Toplma \n2:��karma \n3:�arpma \n4:B�lme");
		secim = sc.nextInt();
		
		switch(secim) 
		{
			case 1:
				sonuc = sayi1+sayi2;
				System.out.println("��lemin sonucu : " + sonuc);
				break;
			case 2:
				if(sayi1>sayi2) {
				sonuc = sayi1-sayi2;
				System.out.println("��lemin sonucu : " + sonuc);				
				}
				else
				{
					System.out.println("K���k say�dan b�y�k say� ��kar�lamaz!");					
				}
				break;
			case 3:
				sonuc = sayi1*sayi2;
				System.out.println("��lemin sonucu : " + sonuc);
				break;
			case 4:
				if(sayi2>0) {
				sonuc = sayi1/sayi2;
				System.out.println("��lemin sonucu : " + sonuc);				
				}
				else if(sayi2 == 0)
				{
					System.out.println("S�f�ra b�lme i�lemi yap�lamaz, Mant�ksal HATA!");					
				}
				break;
			default :
				System.out.println("Uygun bir se�im yap�lmad�!");
				break;
		}
	}

}
