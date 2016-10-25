class Contact
{
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender ;// M or F
	public Contact()
	{
		this.personName = this.personId = this.mobileNumber="";
		this.age=0;
		this.gender=0;
	}
	public Contact(String personName,String personId,int age,String mobileNumber, char gender)
	{
		this.personName = personName;
		this.personId =  personId;
		this.mobileNumber= mobileNumber;
		this.age=age;
		this.gender=gender;
	}
	public void showPersonInfo()
	{
		System.out.println("Name: "+personName+"\n"+"personId: "+personId+"\n age :"+age+"\n"+"mobileNumber: "+mobileNumber+"\n"+"Gender: "+gender);
	}
	public void detectMobileOperator()
	{
		if(this.mobileNumber.charAt(2) =='7')
		{
			System.out.println("Mobile phone: GrameenPhone"+"\n");
		}
		else if(this.mobileNumber.charAt(2) =='8')
		{
			System.out.println("Mobile phone: Robi"+"\n");
		}
		else if(this.mobileNumber.charAt(2) =='9')
		{
			System.out.println("Mobile phone: Banglalink"+"\n");
		}
		
	}	// it will show GP or Robi or



}