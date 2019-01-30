public class Factorial
{
	public int factorial(int n, String type)
	{
		String a = "recursive";
		String b = "iterative";
		int rturn = 1;
		if(type.equals(a))
		{
			if(n == 1)
				rturn = 1;
			else
			{
				rturn = fac(n);
			}
		}
		else if (type.equals(b))
		{
			while(n > 0)
			{
				rturn *= n;
				n--;
			}
		}	
		return rturn;
	}

	public int fac(int n)
	{
		int rturn = 1;
		if (n == 1)
			return 1;
		rturn = fac(n - 1) * n;
		return rturn;
	}
}