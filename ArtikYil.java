package gitProject;
import java.util.*;

public class ArtikYil {

	public static void main(String[] args) {
		int yil;
		Scanner scn = new Scanner(System.in);
		System.out.println("Y�l Giriniz : ");
		yil = scn.nextInt();
		
		if((yil%100==0) && (yil%400==0))
		{
			System.out.println(yil + " bir art�k y�ld�r !");
		}
		else if((yil%100!=0) && (yil%4==0))
		{
			System.out.println(yil + " bir art�k y�ld�r !");
		}
		else
		{
			System.out.println(yil + " bir art�k y�l de�ildir !");
		}

	}

}
