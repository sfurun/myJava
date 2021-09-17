package gitProject;
import java.util.Scanner;

public class YildizElmas {

	public static void main(String[] args) {
		
        Scanner scn = new Scanner(System.in);
        
        System.out.print("n degeri giriniz:");
        
		int n=scn.nextInt();

        for(int i=1;i<n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

           for(int k=1;k<=(2*i)-1;k++){
               System.out.print("*");
           }
            System.out.println();
        }
        int x=1;
            for(int i=n-2;i>=0;i--){

                for(int k=0;k<=x;k++){
                    System.out.print(" ");
                }

                for(int j=2*i-1;j>0;j--){
                    System.out.print("*");
                }

                System.out.println();
                x++;
            }		
	}

}
