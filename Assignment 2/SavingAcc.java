class SavingAcc extends Account
{
	public SavingAcc(String accName,String acid,double balance)
	{
		super(accName,acid,balance);
	}
	public double interestRate()
	{
		return balance*.09;
	}
	 public void show()
   {
	   super.show();
	   System.out.println("Interest Rate: "+interestRate());
   }
}