class ContactAddress extends Contact
{
	private String mobileNumber;
	public ContactAddress()
	{
		this.mobileNumber="";
	}
	public ContactAddress(String personName,String personId,int age, char gender,String mobileNumber)
	{
		super(personName,personId,age, gender);
		this.mobileNumber=mobileNumber;
	}
	public void showContactAddress()
	{
		showPersonInfo();
		System.out.println("Mobile No. :"+mobileNumber);
		detectMobileOperator(mobileNumber);
	}
	
	
}