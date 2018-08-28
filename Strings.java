package Hw1;



import java.util.*;


public class Strings {
	
	public String uniqueLetters(String str)
	{
//		
		
		int[] counter = new int[256];
		
		for ( int i = 0 ; i < str.length() ; i++)
		{
			if ( str.charAt(i) != ' ')
			{
				counter[(int)str.charAt(i)]++;
			}
		}
		
	
		
		StringBuilder sb = new StringBuilder();
		
		
		for ( int i = 0 ; i < str.length() ; i++)
		{
			if( counter[(int)str.charAt(i)] == 1)
			{
				sb.append(str.charAt(i));
			}
		}
		
	
		
		return sb.toString();
	}
	
	

}
