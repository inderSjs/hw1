
import java.util.*;

public class Encoding {
	
	
	public String stringBuild(int m, int n)
	{
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0 ; i < m ; i++)
		{
			sb.append('.');
		}
		
		for ( int i = 0 ; i < n ; i++)
		{
			sb.append('-');
		}
		
		return sb.toString();
		
	}
	
	public void permutation( int l , int r , String str, TreeSet<String> t)
	{
		
		
		if ( l == r)
		{
			t.add(str);
		
		}
		
		else
		{
			for (int i = l ; i <= r ; i++)
			{
				str = swap(l , i, str);
				this.permutation(l+1 , r, str, t);
				str = swap (l , i , str);
			}
		}
		
	}
	
	public String swap(int i , int j, String s)
	{
		char[] ar = s.toCharArray();
		char temp;
		temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
		String xyz = String.valueOf(ar);
		return xyz;
	}
	
	public static Set<String> morseCodes(int m , int n)
	{
		
		Encoding m1 = new Encoding();
		TreeSet<String> tt = new TreeSet<String>();
		String z = m1.stringBuild(m, n);
		m1.permutation(0, z.length()-1, z, tt);
		return tt;
	}
	
	
	
	
	

}
