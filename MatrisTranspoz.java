package gitProject;

public class MatrisTranspoz {

	public static void main(String[] args) {
		
		int [][] dizi = {{6,8},{5,7},{9,1}};
		 		 
		System.out.println("Orjinal Matris : ");
		for (int i=0;i<3;i++)
		{
			for(int k=0;k<2;k++)
			{
				System.out.print("["+dizi[i][k]+"]");

			}
			System.out.println();
		}
	System.out.println("Mateisin Transpozu : ");
	for (int i=0;i<2;i++)
	{
		for(int k=0;k<3;k++)
		{
			System.out.print("["+dizi[k][i]+"]");
		}
		System.out.println();
	}

	}

}
