package gitProject;
import java.util.Scanner;

public class UserControl {

	public static void main(String[] args) {
		String username = "sfurun", password = "963", usgir, pwdgir, sZero, yPwd;
		boolean durum;
		
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("L�tfen Kullan�c� Ad�n� Giriniz : ");
		usgir = scn.nextLine();
		System.out.println("L�tfen Kullan�c� �ifresini Giriniz : ");
		pwdgir = scn.nextLine();
		
		durum=(usgir.contentEquals(username) && pwdgir.contentEquals(password));
		
		if(durum)
		{
			System.out.println("Giri� Ba�ar�l�!");
		}
		else 
		{		
				System.out.println("Hatal� �ifre girdiniz, �ifrenizi s�f�rlamak istermisiniz?, y/n");
				sZero = scn.nextLine();
			
				if(sZero.contentEquals("y"))
				{					
					System.out.println("Yeni �ifrenizi Giriniz : ");
					yPwd = scn.nextLine();
					
					if(yPwd.contentEquals(password))
					{
						System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.!");
						
					}
					else
					{
						System.out.println("�ifre olu�turuldu, yeni �ifreniz : " + yPwd);
					}
				}	
			
		}

	}

}
