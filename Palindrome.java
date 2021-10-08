package gitProject;
import java.util.*;

public class Palindrome {

	static boolean isPalindrome(String str)
	{
		String reverse="";
		
		for(int i = str.length()-1; i >= 0; i--)
		{
			reverse+= str.charAt(i);			
		}
		
		return str.equals(reverse);
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�fade Giriniz : ");
		
		String ifade= scn.nextLine();
				
		Boolean result = isPalindrome(ifade);
		
		if(result == true)
		{
			System.out.println("�fade Palindrome ifadedir!");
		}
		else			
		{
			System.out.println("�fade Palindrome ifade de�ildir!");
		}
		
	}

}
