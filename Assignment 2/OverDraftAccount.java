class OverDraftAccount extends Account
{
	private  final double overDraftLimit;
	public OverDraftAccount()
	{
		this.overDraftLimit=0.0;
	}
	public OverDraftAccount(String accName,String acid,double balance,double OverDraftLimit)
	{
		super(accName,acid,balance);
		this.overDraftLimit=OverDraftLimit;
	}

  public void withdraw(double amount)
	{		
			if((balance+overDraftLimit)>amount)
		{
			this.balance=balance-amount;
		}
		
	} 
	public double interestRate()
	{
		if(balance>10000)
		{
			return balance * .011;
		}
		else 
		{
			return balance * .09;
		}
	}
   public void show()
   {
	   super.show();
	   System.out.println("Overdraft Limit: "+overDraftLimit+"\n"+"Interest Rate: "+interestRate());
   }

}