package gitProject;
import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		double arm, elm, dom, muz, pat, topTutar;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Armut Ka� Kilo ? : ");
		arm = inp.nextDouble();
		
		System.out.println("Elma Ka� Kilo ? : ");
		elm = inp.nextDouble();
		
		System.out.println("Domates Ka� Kilo ? : ");
		dom = inp.nextDouble();
		
		System.out.println("Muz Ka� Kilo ? : ");
		muz = inp.nextDouble();
		
		System.out.println("Patl�can Ka� Kilo ? : ");
		pat = inp.nextDouble();
		
		topTutar = (arm*2.14) + (elm*3.67)+(dom*1.11)+(muz*0.95)+(pat*5);
		
		System.out.println("Toplam Al��veri Tutar� : " + topTutar +  "TL'dir");
		
	}

}
