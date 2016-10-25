class Account
{
	private String accName;
	private String acid;
	private double balance;
	private Address address;
	public Account()
	{
		this.accName = this.acid = "";
		this.balance=0.0;
		this.address=null;
	}
	public Account(String accName,String acid,double balance,Address address)
	{
		this.accName = accName;
		this.acid = acid;
		this.balance = balance;
		this.address = address;
	}

	public double getbalance()
	{
		return this.balance;
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			this.balance = balance+amount;
		
		}
		
	}
	public void withdraw(double amount)
	{
		this.balance=balance-amount;
	}
	public void showAccountInfo()
	{
		System.out.println("Name: "+accName+"\n"+"ID: "+acid+"\n"+"balance: "+this.balance);
		this.address.showAddress();
	}

   public void transfer(double amount, Account x)
   {
	   withdraw(amount);
	   x.deposit(amount);
   }

}