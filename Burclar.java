package gitProject;
import java.util.Scanner;

public class Burclar {

	public static void main(String[] args) {
		int gun=0, ay=0;
		String burc = "";
		boolean hata = false;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Gün Giriniz : ");
		gun = scn.nextInt();
		
		if(gun>31 || ay>12) hata = true;
		
		System.out.println("Ay Giriniz : ");
		ay = scn.nextInt();
		
        if(ay==1){
            if(gun<=19){burc="oðlak";}
            if(gun>19){burc="kova";}
        }
		
        if(ay==2){
            if(gun<=18){burc="kova";}
            if(gun>18){burc="balýk";}
        }
	
        if(ay==3){
            if(gun<=19){burc="balýk";}
            if(gun>19){burc="koç";}
        }
	
        if(ay==4){
            if(gun<=19){burc="koç";}
            if(gun>19){burc="boða";}
        }
	
        if(ay==5){
            if(gun<=20){burc="boða";}
            if(gun>20){burc="ikizler";}
        }
	
        if(ay==6){
            if(gun<=21){burc="ikizler";}
            if(gun>21){burc="yengeç";}
        }
	
        if(ay==7){
            if(gun<=22){burc="yengeç";}
            if(gun>22){burc="aslan";}
        }
	
        if(ay==8){
            if(gun<=22){burc="aslan";}
            if(gun>22){burc="baþak";}
        }
	
        if(ay==9){
            if(gun<=22){burc="baþak";}
            if(gun>22){burc="terazi";}
        }
	
        if(ay==10){
            if(gun<=22){burc="terazi";}
            if(gun>22){burc="akrep";}
        }
	
        if(ay==11){
            if(gun<=21){burc="akrep";}
            if(gun>21){burc="yay";}
        }
	
        if(ay==12){
            if(gun<=21){burc="yay";}
            if(gun>21){burc="oðlak";}
        }			
				
			if(hata)
			{
				System.out.println("Hatalý giriþ yaptýnýz!");
			}
			else
			{
				System.out.println("Burcunuz : " + burc);
			}
	}

}
