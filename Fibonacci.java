public class Fibonacci
{

	public int fibonacci(int n, String type)
	{
		String a = "recursive";
		String b = "iterative";
		int rturn = 1;
		if(type.equals(a))
		{
			rturn = fib(n);
		}

		else if(type.equals(b))
		{
			int aa = 0, bb = 1, cc;
			if(n == 0)
				return 0;
			for(int i = 2; i <= n; i++)
			{
				cc = aa + bb;
				aa = bb;
				bb = cc;
			}
			rturn = bb;
		}


		return rturn;
	}

	public int fib(int n)
	{
		if(n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

}