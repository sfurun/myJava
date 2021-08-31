package gitProject;
import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		int takAcilis = 10;
		double gitKM,topTutar;
		
		System.out.println("KM bilgisi giriniz : ");
		
		Scanner inp = new Scanner(System.in);
		gitKM = inp.nextDouble();
		
		topTutar = takAcilis +  (gitKM * 2.2);
		
		topTutar = (topTutar<20) ? 20 : topTutar;
		
		System.out.println("Toplam Taksi Ücreti : " + topTutar + "TL");
		
	}

}
