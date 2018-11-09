public class kata2{
	public static boolean palindrome(String a)
	{
		a = a.toLowerCase();
		a = a.replaceAll(" ", "");
		int alth = a.length();
		int i = 0;
		while (i < alth/2)
		{
			if (a.charAt(i) != a.charAt(alth-i-1))
				return false;
			i++;
		}
		return true;

	}
	public static void main(String []agrs)
	{
		System.out.println(palindrome("Ka yak"));
		System.out.println(palindrome("AbBa"));
		System.out.println(palindrome("test"));
		System.out.println(palindrome("false"));
		System.out.println(palindrome("Ka Ya    k"));
	}
}
