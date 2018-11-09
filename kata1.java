import java.lang.Math;
public class kata1
{
	public static int hamming(String a, String b)
	{
		int lthA= a.length();
		int lthB= b.length();
		int hamm = 0;
		int i=0;
		if (lthA != lthB)
			hamm = Math.abs(lthA - lthB);
		while (i < lthA && i < lthB)
		{
			if (a.charAt(i) != b.charAt(i))
				hamm++;
			i++;
		}
		return hamm;
	}
	public static void main(String[] args)
	{
		System.out.println(hamming("toto", "tata"));

	}
}
