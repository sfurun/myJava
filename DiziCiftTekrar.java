package gitProject;
import java.util.Arrays;

public class DiziCiftTekrar {

	static boolean isFind(int[] arr, int value)
	{
		for(int i: arr)
		{
			if(i == value)
			{
				return true;
			}
		}
		
		return false;
	}	
	
	public static void main(String[] args) {
	
		int[] list = {4,6,21,8,36,4,56,8,10,18,21,5,16,19,8,10,7,26,29,7,56};
		Arrays.sort(list);
		int[] dublicate = new int[list.length];
		int starIndex=0;
		
		for(int i = 0; i < list.length ; i++)
		{	for(int j = 0; j < list.length ; j++)
			{
				if((i != j) && (list[i] == list[j]) && (list[i]%2 == 0))
				{
					if(!isFind(dublicate, list[i]))
					{
						dublicate[starIndex++] = list[i];
					}
					break;
				}
				
			}
		}
		
		for(int value : dublicate)
		{
			if(value != 0)
			{
				System.out.println(value);
			}
		}
		
	}

}
