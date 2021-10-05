package gitProject;
import java.util.Scanner;

public class HesapModRect {
	
	static int modAl(int a, int b)
	{
		int sonuc;
		sonuc = a%b;
		System.out.println("Mod Deðeri : " + sonuc);		
		return sonuc;		
	}
	
	static int recCevre(int a, int b) {
		int cevre = 2*a + b;
		System.out.println("Dikdörtgenin Çevresi : " + cevre);		
		return cevre;
	}
	
	static int recAlan(int a, int b) {
		int alan = a * b;
		System.out.println("Dikdörtgenin Alaný : " + alan);		
		return alan;
	}
	

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String menu = "Menu : \n"+					
					   "1 - Mod Alma Ýþlemi  \n"+
					   "2 - Dikdörtgen Çevresi : \n"+
					   "3 - Dikdötgen Alaný : ";
		
		System.out.println(menu);
		System.out.println("Seçim Yapýnýz : ");
		
		menu = scn.nextLine();		
		
		System.out.println("Birinci Sayýyý Giriniz : ");
		int a = scn.nextInt();
		
		System.out.println("Ýkinci Sayýyý Giriniz : ");
		int b = scn.nextInt();
		
		switch(menu)
		{
			case "1":
				modAl(a, b);
			break;
			case "2":
				recCevre(a, b);
			break;
			case "3":
				recAlan(a, b);
			break;
		}		
	}

}
