package gitProject;
import java.util.Scanner;

public class HavaSicaklik {

	private static int head;

	public static void main(String[] args) {
	int head;
	
	Scanner scn = new Scanner(System.in);
	
	System.out.println("S�cakl�k De�eri Giriniz : ");
	head = scn.nextInt();
	
		if(head<5)
		{
			System.out.println("Kayak Yapabilirsiniz!");
		}
		else if(head>=5 && head<15)
		{
			System.out.println("Sinemaya Gidebilirsiniz");
		}
		else if(head>=15 && head<=25)
		{
			System.out.println("Pikni�e Gidebilirsiniz");
		}
		else if(head>25)
		{
			System.out.println("Y�zmeye Gidebilirsiniz");
		}	

	}

}
