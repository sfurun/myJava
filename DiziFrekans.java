package gitProject;
import java.util.*;
public class DiziFrekans {

	public static void main(String[] args) {
		int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
	       int count=0;

	        Arrays.sort(dizi);
	        
	        System.out.println("Dizi : " + Arrays.toString(dizi)); 
	        System.out.println("Tekrar Say�lar� : ");
	        
	        for(int i=0; i<dizi.length; i++)
	        {
	            count=0;
	            for (int j=0; j<dizi.length; j++)
	            {
	                if(dizi[i]==dizi[j])
	                {
	                    count++;

	                }
	            }
	       
		            if(i==0 && dizi[i+1]==dizi[i])
		            {	            	
		            	System.out.println(String.format("%d say�s� %d kere tekrar edildi.", dizi[i], count));
		            }
	
		            if(i==0 && dizi[i+1]!=dizi[i])
		            {
		            	System.out.println(String.format("%d say�s� %d kere tekrar edildi.", dizi[i], count));
		            }
	
		            if(i!=0 && dizi[i-1]!=dizi[i]) 
		            {
	            		System.out.println(String.format("%d say�s� %d kere tekrar edildi.", dizi[i], count));
		            }
	
	        }
	}
	

}
