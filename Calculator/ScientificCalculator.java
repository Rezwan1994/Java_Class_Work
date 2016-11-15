class ScientificCalculator implements ScientificCalculatorInterface
{
	public double sum(double x, double y)
	{
		return x+y;
	}
	public double sub(double x, double y)
	{
		return x-y;
	}
	public double multiplication(double x, double y)
	{
		return x*y;
	}
	public double division(double x, double y)
	{
		return x/y;
	}
	public double XtoY(double x, double y)
	{
		int pow = 1;
		for(int i=0;i<y;i++)
		{
			 pow *= x;
		}
		return pow;
	}
	public void BainaryConversion(int x)
	{
		int c=0,z,i=0;
		int[]t= new int[50];
		 while (x>0)

        {
			z= x % 2;

			x=x/2;

			t[i]=z;

			i++;
			c++;

        }
		for( int j=c;j>=0;j--)
		{
			System.out.print (t[j]);
		}
			
	}

	
}