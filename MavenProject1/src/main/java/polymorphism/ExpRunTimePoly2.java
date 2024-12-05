package polymorphism;

public class ExpRunTimePoly2 extends ExpRunTimePoly 
{
	public void math(int a,int b)
	{
		super.math(10,20);
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		ExpRunTimePoly2 obj=new ExpRunTimePoly2();
		obj.math(20,10);

	}

}
