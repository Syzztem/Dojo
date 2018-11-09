import java.util.Arrays;
public class kata3
{
	public static String calc(String out, int n, char l, int nbr)
	{
		int i = nbr / n;
		nbr %= n;
		while (i > 0)
		{
			out += l;
			i--;
		}
		return out;
	}
	public static String correct(String[] bad)
	{
		char[] tab = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
		int i=1;
		String out="";
		while (i < bad.length)
		{
			if (bad[i].length() == 4)
				bad[i] = ("" + bad[i].charAt(0) + tab[i - 1]);
			i++;
			
		}
		return Arrays.toString(bad).replaceAll(", ", "");
	}
	public static String toRoman(int nbr)
	{
		String[] out={"", "", "", "", "", "", ""};
		out[0] = calc("", 1000, 'M', nbr);
		nbr %= 1000;
		out[1]= calc("", 500, 'D', nbr);
		nbr %= 500;
		out[2] = calc("", 100, 'C', nbr);
		nbr %= 100;
		out[3] = calc("", 50, 'L', nbr);
		nbr %= 50;
		out[4] = calc("", 10, 'X', nbr);
		nbr %= 10;
		out[5] = calc("", 5, 'V', nbr);
		nbr %= 5;
		out[6] = calc("", 1, 'I', nbr);
		return Arrays.toString(out).replaceAll(", ", "");
	}
	public static void main(String[] args)
	{
		System.out.println(toRoman(19));
	}
}
