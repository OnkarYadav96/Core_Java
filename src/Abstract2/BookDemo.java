package Abstract2;

import java.util.Scanner;


public class BookDemo
{

	public static void main(String[] args)
	{
			 
		Book [] books = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<books.length;i++)
		{
			System.out.println("Enter type of the book(p/e) : ");
			char ans = sc.nextLine().charAt(0);
			
			System.out.println("Enter book title : ");
			String title = sc.nextLine();
			
			System.out.println("Enter book price : ");
			float pr = Float.parseFloat(sc.nextLine());
			//System.out.println("Enter book Id : ");
			//int id = sc.nextInt();
			if(ans == 'p' || ans == 'P')
				books[i] = new PaperBook(title,pr);
			else if(ans == 'e' || ans == 'E')
				books[i] = new EBook(title,pr);
			else
				System.out.println("Invalid input");
		}
		
		for(int i=0; i<books.length ; i++)
		{
			System.out.println("*****************************");
			books[i].display();
			//System.out.println("ID::"+Book.bookid);
			System.out.println(" Cost : "+books[i].calCost());
		}
	}
		
}
