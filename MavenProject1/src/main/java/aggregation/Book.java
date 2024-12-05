package aggregation;

public class Book
{
	String bname;
	int bid;
	Author ref;			//Aggregation
	public Book(String bname,int bid,Author ref)
	{
		this.bname=bname;
		this.bid=bid;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.name+" "+ref.age);
		System.out.println(bname+" "+bid);
	}

	public static void main(String[] args) 
	{
		Author obj1=new Author("Diya",28);
		Book obj2=new Book("Java Programming",500,obj1);
		obj2.display();
		
	}

}
