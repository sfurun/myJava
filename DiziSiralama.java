package gitProject;
import java.util.*;

public class DiziSiralama {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list;
        int tempValue;

        System.out.print("Dizinin Boyutunu Girin: ");
        int listLength = scan.nextInt();

        list = new int[listLength];

        for (int i = 0; i < listLength; i++) {
            System.out.printf("%s. Elemaný Girin: ", i + 1);
            list[i] = scan.nextInt();
        }

        for (int i = 0; i < listLength - 1; i++) {
            for (int j = i + 1; j < listLength; j++) {
                if (list[j] < list[i]) {
                    tempValue = list[i];
                    list[i] = list[j];
                    list[j] = tempValue;
                }
            }
        }        
        System.out.print("Sýralama: ");
        for (int value : list) 
        {
        	System.out.printf("%s, ", value);        
    	}
	}

}
