class Main
{
	public static void main(String[]args)
	{
		Account oa = new OverDraftAccount("Rezwan","14-27307-2",100000,500);
		oa.show();
		oa.interestRate();
		Account ob = new SavingAcc("Mijan","12-23",2000);
		ob.show();
	}
}