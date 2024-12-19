package aggregation;
public class Address
{
	String address;
	Student ref;
	public Address(String address,Student ref)
	{
		this.address=address;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println("Name: "+ref.name+"\n"+"roll number: "+ref.rollno);
		System.out.println("Address: "+address);
	}
	public static void main(String[] args) 
	{
		Student obj1=new Student("Diya",20);
		Address obj2=new Address("Kerala",obj1);
		obj2.display();
	}
}
