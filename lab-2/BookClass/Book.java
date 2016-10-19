class Book
{
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy; // how many copy 
	private static int noOfBook=0;
	
	public Book()
	{
		this.bookName=this.bookAuthor=this.bookId=this.bookType="";
		this.bookCopy=0;
		noOfBook++;
		
	}
	public Book(String bookName,String bookAuthor,String bookId,String bookType,int bookCopy)
	{
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookId=bookId;
		this.bookType=bookType;
		this.bookCopy=bookCopy;
		noOfBook++;
	}
	void showInfo()
	{
		System.out.println("Name: "+bookName+"\n"+"Author: "+bookAuthor+"\n"+"Id: "+bookId+"\n"+"Type: "+bookType+"\n"+"BookCopy: "+bookCopy+"\n"+"NO. of Book: "+noOfBook+"\n");
	}
	void addBookCopy(int x)
	{
		 bookCopy=this.bookCopy + x;
	}
}