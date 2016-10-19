class BookMain
{
	public static void main(String[] args)
	{
		Book a = new Book("English","Rezwan","14-1","Textbook",5);
		a.showInfo();
		Book b = new Book("Bangla","toufiq","14-2","Textbook",10);
		b.addBookCopy(15);
		b.showInfo();
	}
}