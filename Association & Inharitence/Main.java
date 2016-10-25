class Main
{
	public static void main(String[] args)
	{
		Address a = new Address("22","12","Dhaka");
		OverDraftAccount []oa = new OverDraftAccount[10];
		oa[0]= new OverDraftAccount("Rezwan","14-27307-2",6000,a,500);
		oa[0].withdraw(3000);
		oa[0]. showOverDraftAccountInfo();
		
	
		Address b = new Address("25","32","Rangpur");
		oa[1]= new OverDraftAccount("Mijan","14-27667-2",3000,b,300);
		oa[1].withdraw(300);
		oa[1]. showOverDraftAccountInfo();
		
		
	}

}