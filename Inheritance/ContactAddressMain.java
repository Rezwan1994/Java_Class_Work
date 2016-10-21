class ContactAddressMain
{
	public static void main(String[]args)
	{
		ContactAddress []c = new ContactAddress[10];
		 c[0] = new ContactAddress("Rezwan","14-27307-2",23,'M',"01750425444");
		 c[0].showContactAddress();
		 c[1] = new ContactAddress("Mijan","14-27449-2",23,'M',"01830030032");
		 c[1].showContactAddress();
		
	}
}