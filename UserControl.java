package gitProject;
import java.util.Scanner;

public class UserControl {

	public static void main(String[] args) {
		String username = "sfurun", password = "963", usgir, pwdgir, sZero, yPwd;
		boolean durum;
		
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("Lütfen Kullanýcý Adýný Giriniz : ");
		usgir = scn.nextLine();
		System.out.println("Lütfen Kullanýcý Þifresini Giriniz : ");
		pwdgir = scn.nextLine();
		
		durum=(usgir.contentEquals(username) && pwdgir.contentEquals(password));
		
		if(durum)
		{
			System.out.println("Giriþ Baþarýlý!");
		}
		else 
		{		
				System.out.println("Hatalý Þifre girdiniz, þifrenizi sýfýrlamak istermisiniz?, y/n");
				sZero = scn.nextLine();
			
				if(sZero.contentEquals("y"))
				{					
					System.out.println("Yeni Þifrenizi Giriniz : ");
					yPwd = scn.nextLine();
					
					if(yPwd.contentEquals(password))
					{
						System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.!");
						
					}
					else
					{
						System.out.println("Þifre oluþturuldu, yeni þifreniz : " + yPwd);
					}
				}	
			
		}

	}

}
