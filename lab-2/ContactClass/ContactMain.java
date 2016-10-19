class ContactMain
{
	public static void main(String[] args)
	{
		Contact a = new Contact("Rezwan","14-27307-2",23,"01750425444",'M');
		
		a.showPersonInfo();
		a.detectMobileOperator();
		Contact b = new Contact("Toufiq","14-26437-2",25,"01850425444",'M');
		b.showPersonInfo();
		b.detectMobileOperator();
		Contact c = new Contact("Rana","14-269967-2",24,"01950425444",'M');
		c.showPersonInfo();
		c.detectMobileOperator();
	}
}