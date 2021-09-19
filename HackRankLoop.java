package gitProject;
import java.util.Scanner;

public class HackRankLoop {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sayi = scn.nextInt();
		
	    for(int i = 1; i <= 10; i++){
            System.out.println(sayi + " x " + i + " = " + sayi*i);
        }		
	}

}
