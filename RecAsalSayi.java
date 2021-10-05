package gitProject;

import java.util.Scanner;

public class RecAsalSayi {
	
  private static int Asal(int a, int b) {
        
	  if (b==1){
            return 1;
        }else {
            if (a%b==0){
                return 0;
            }
            else return Asal(a,b-1);
        }
    }

	public static void main(String[] args) {

	     int x, sonuc ;
	        Scanner scanner=new Scanner(System.in);
	        System.out.print("Bir sayi giriniz : ");
	        x= scanner.nextInt();

	        sonuc=Asal(x,x/2);

	        if (sonuc==1){
	            System.out.println(x+" sayisi asaldir");
	        }else {
	            System.out.println(x+" sayisi asal deðildir");
	        }
		
	}

}
