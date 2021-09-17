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
            System.out.print("Kullanýcý Adýnýz :");
            userName = input.nextLine();
            System.out.print("Parolanýz : ");
            password = input.nextLine();
            
            switch(userName)
            {
            	case "sfurun":            		
            		switch(password)
            		{	
            			case "963":
            				System.out.println("Merhaba, SFURUN Bankasýna Hoþgeldiniz!");
            				
            				do {
                                System.out.println("1-Para yatýrma\n" +
                                        "2-Para Çekme\n" +
                                        "3-Bakiye Sorgula\n" +
                                        "4-Çýkýþ Yap");
                                System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
                                select = input.nextInt();
                                
                                switch(select)
                                {
                                	case 1:
                                        System.out.print("Para miktarý : ");
                                        price = input.nextInt();
                                        balance += price;
                                        break;
                                	
                                	case 2 :
                                        System.out.print("Para miktarý : ");
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
                            System.out.println("Tekrar görüþmek üzere.");
                            break;            			
            				
            			default :
            				 right--;
            				System.out.println("Hatalý Þifre");
                            if (right == 0) {
                                System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz.");
                            } else {
                                System.out.println("Kalan Hakkýnýz : " + right);
                            }
            				break;            		
            		}
            		
            		default :
            			 right--;
                         if (right == 0) {
                             System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz.");
                         } else {
                             System.out.println("Kalan Hakkýnýz : " + right);
                         }
            			System.out.println("Hatalý Kullanýcý");
        		}
        }

	}

}
