class Account
{
	private String accName;
	private String acid;
	private double balance;
	public Account()
	{
		this.accName=this.acid="";
		this.balance=0.0;
	}
	public Account(String accName,String acid,double balance)
	{
		this.accName=accName;
		this.acid=acid;
		this.balance=balance;
	}
	public void diposit(double amount)
	{
		this.balance=balance+amount;
	}
	public void withdraw(double amount)
	{
		this.balance=balance-amount;
	}
	public void show()
	{
		System.out.println("Name: "+this.accName +"\n"+ "Id: "+this.acid+ "\n"+"Balance: "+this.balance);
	}
	public void transfer(double amount,Account x)
	{
		withdraw(amount);
		x.diposit(amount);
	}
	
}