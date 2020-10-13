import java.util.*;

class Book
{

	String name;
	String author;
	double price;
	int num_pages;

	void Book()
	{
		name = null;
		author = null;
		num_pages = 0;
		price = 0.0;
	}

	void set()
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the name of the book");
		name = sn.nextLine();
		System.out.println("Enter the author of the book");
		author = sn.nextLine();
		System.out.println("Enter the number of pages");
		num_pages = sn.nextInt();
		System.out.println("Enter the price of the book");
		price = sn.nextDouble();
	}

	public String toString()
	{
	String out = "The Name of the book is : "+name+"\n The Author is : "+author+"\nThe Price of the book is : "+price+"\nThe number of pages in the book are : "+num_pages;
	return out;
	}
}


class book
{
	public static void main(String[] args)
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of books:	");
		int n = sn.nextInt();
		Book[] arr = new Book[n];
		for(int i = 0; i<n;i++)
		{
			arr[i] = new Book();
			System.out.println("Enter the details of book "+(i+1));
			arr[i].set();
		}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}



