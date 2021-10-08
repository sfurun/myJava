package gitProject;

public class DiziHarmonik {

	public static void main(String[] args) {
	
		int[] harm = {3,2,6,1,8};
		double sum = 0.0;
		double hort = 0.0;
		
		for(int i = 0; i<harm.length ; i++)
		{
			sum+= 1.0/harm[i];			
		}
		
		hort = harm.length/sum;
		System.out.println("Harmonik Ortalama : " + sum);		
	}
}
