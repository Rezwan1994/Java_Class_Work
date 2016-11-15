class Test
{
	public static void main(String[] args)
	{
		BasicCalculator b = new BasicCalculator();
		System.out.println("Result: "+ b.sum(10.00,10.0));
		ScientificCalculator s = new ScientificCalculator();
		System.out.println("Result: "+ s.XtoY(2,3));
		System.out.print("Bainary Form:");
		s. BainaryConversion(7);
	}
	
}