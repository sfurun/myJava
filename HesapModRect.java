package gitProject;
import java.util.Scanner;

public class HesapModRect {
	
	static int modAl(int a, int b)
	{
		int sonuc;
		sonuc = a%b;
		System.out.println("Mod De�eri : " + sonuc);		
		return sonuc;		
	}
	
	static int recCevre(int a, int b) {
		int cevre = 2*a + b;
		System.out.println("Dikd�rtgenin �evresi : " + cevre);		
		return cevre;
	}
	
	static int recAlan(int a, int b) {
		int alan = a * b;
		System.out.println("Dikd�rtgenin Alan� : " + alan);		
		return alan;
	}
	

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String menu = "Menu : \n"+					
					   "1 - Mod Alma ��lemi  \n"+
					   "2 - Dikd�rtgen �evresi : \n"+
					   "3 - Dikd�tgen Alan� : ";
		
		System.out.println(menu);
		System.out.println("Se�im Yap�n�z : ");
		
		menu = scn.nextLine();		
		
		System.out.println("Birinci Say�y� Giriniz : ");
		int a = scn.nextInt();
		
		System.out.println("�kinci Say�y� Giriniz : ");
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
