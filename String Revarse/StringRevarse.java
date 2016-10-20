class StringRevarse
{
	String s;
	char []rev = new char[100];
	int c=0;
	public String StringChange(String s)
	{
		char [] testarry = s.toCharArray();
		for(int i=testarry.length-1;i>=0;i--)
		{
			
			rev[c]=testarry[i];
			c++;
		}
		String result = new String(rev);
		return result;
	}
}