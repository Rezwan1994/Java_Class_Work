class Address
{
	private String houseNo;
	private String roadNo;
    private String area;
	public Address()
	{
		this.houseNo=this.roadNo=this.area="";
	}
	public Address(String houseNo,String roadNo,String area)
	{
		this.houseNo=houseNo;
		this.roadNo=roadNo;
		this.area=area;
	}
	
	public void setAddress(String houseNo,String roadNo,String area)
	{
		this.houseNo=houseNo;
		this.roadNo=roadNo;
		this.area= area;
	}
	public String gethouseNo()
	{
		return this.houseNo;
	}
	public String getroadNo()
	{
		return this.roadNo;
	}
	public String getarea()
	{
		return this.area;
	}
	public void showAddress()
	{
		System.out.println("House No: "+houseNo+"\n"+"Road No: "+roadNo+"\n"+"Area: "+area+"\n");
	}
}