package mavenPackage;

public class InstanceMethod {
	public void display(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum of two numbers:"+c);
	}

	public static void main(String[] args) {
		
		InstanceMethod obj=new InstanceMethod();
		obj.display(10,20);
	}

}
