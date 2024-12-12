package abstraction;

public class AbstractChild extends AbstractParent 
{
	public static void main(String[] args) 
	{
		AbstractChild obj=new AbstractChild();
		obj.add();
		obj.sub();
	}
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

}
