package gitProject;
import java.util.Scanner;

public class Bankamatik {

	public static void main(String[] args) {
		String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price = 0;
        
        while (right > 0) {
            System.out.print("Kullan�c� Ad�n�z :");
            userName = input.nextLine();
            System.out.print("Parolan�z : ");
            password = input.nextLine();
            
            switch(userName)
            {
            	case "sfurun":            		
            		switch(password)
            		{	
            			case "963":
            				System.out.println("Merhaba, SFURUN Bankas�na Ho�geldiniz!");
            				
            				do {
                                System.out.println("1-Para yat�rma\n" +
                                        "2-Para �ekme\n" +
                                        "3-Bakiye Sorgula\n" +
                                        "4-��k�� Yap");
                                System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
                                select = input.nextInt();
                                
                                switch(select)
                                {
                                	case 1:
                                        System.out.print("Para miktar� : ");
                                        price = input.nextInt();
                                        balance += price;
                                        break;
                                	
                                	case 2 :
                                        System.out.print("Para miktar� : ");
                                        price = input.nextInt();
                                        if (price > balance) {
                                            System.out.println("Bakiye yetersiz.");
                                        } else {
                                            balance -= price;
                                        }
                                        break;
                                	case 3 :
                                		System.out.println("Bakiyeniz : " + balance);
                                		break;
                                }                                
       
                            } while (select != 4);
                            System.out.println("Tekrar g�r��mek �zere.");
                            break;            			
            				
            			default :
            				 right--;
            				System.out.println("Hatal� �ifre");
                            if (right == 0) {
                                System.out.println("Hesab�n�z bloke olmu�tur l�tfen banka ile ileti�ime ge�iniz.");
                            } else {
                                System.out.println("Kalan Hakk�n�z : " + right);
                            }
            				break;            		
            		}
            		
            		default :
            			 right--;
                         if (right == 0) {
                             System.out.println("Hesab�n�z bloke olmu�tur l�tfen banka ile ileti�ime ge�iniz.");
                         } else {
                             System.out.println("Kalan Hakk�n�z : " + right);
                         }
            			System.out.println("Hatal� Kullan�c�");
        		}
        }

	}

}
