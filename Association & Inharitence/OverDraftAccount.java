class OverDraftAccount extends Account
{
	private final double OVER_DRAFT_LIMIT;
	public OverDraftAccount()
	{
		OVER_DRAFT_LIMIT=0.0;
	}
	public OverDraftAccount(String accName,String acid,double balance,Address address,double OVER_DRAFT_LIMIT)
	{
		super(accName,acid,balance,address);
		this.OVER_DRAFT_LIMIT=OVER_DRAFT_LIMIT;
	}		
	@Override
	public void withdraw(double amount)
	{
		if(getbalance()+OVER_DRAFT_LIMIT>amount)
		{
			super.withdraw(amount);
		}
		else
		{
			System.out.println("you can't withdraw this amount");
		}
	}
	

	public void showOverDraftAccountInfo()
	{
		showAccountInfo();
		System.out.println("Over Draft Limit: "+OVER_DRAFT_LIMIT+"\n");
	}
}