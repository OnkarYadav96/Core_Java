package Abstract2;

public abstract class Book
{
	private String Title;
    protected double price ;
    public static int bookid;
    int bid;
//    static
//    {
//    	bookid=1000;
//    }
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String name,float price)
	{	
		Title=name;
		this.price=price;
		bookid++;
		this.bid=bookid;
				}

	public void display()
	{
		System.out.println("BookId : "+bid);
		System.out.println("Title of the Book :"+Title);
		System.out.println("Cost of the Book  : "+price);
		
	}
	public abstract double calCost();
	
}

