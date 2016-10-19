class AccMain
{
	public static void main(String[] args)
	{
		Account a = new Account("Rezwan","14-27307-2",10000);
		a.show();
		Account b = new Account("toufiq","14-26339-2",2000);
		a.transfer(1000,b);
		
		b.show();
		a.show();
	}
	
}
