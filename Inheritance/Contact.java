class Contact
{
	private String personName;
	private String personId;
	private int age;
	private char gender ;// M or F
	public Contact()
	{
		this.personName = this.personId ="";
		this.age=0;
		this.gender=0;
	}
	public Contact(String personName,String personId,int age, char gender)
	{
		this.personName = personName;
		this.personId =  personId;
	
		this.age=age;
		this.gender=gender;
	}
	public void showPersonInfo()
	{
		System.out.println("Name: "+personName+"\n"+"personId: "+personId+"\n"+ "age :"+age+"\n"+"Gender: "+gender);
	}
	public void detectMobileOperator(String mobileNumber)
	{
		if(mobileNumber.charAt(2) =='7')
		{
			System.out.println("Mobile Operator: GrameenPhone"+"\n");
		}
		else if(mobileNumber.charAt(2) =='8')
		{
			System.out.println("Mobile Operator: Robi"+"\n");
		}
		else if(mobileNumber.charAt(2) =='9')
		{
			System.out.println("Mobile Operator: Banglalink"+"\n");
		}
		
	}	// it will show GP or Robi or



}