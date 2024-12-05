package accessSpecifier;

public class AcessModifierExp1 {
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	private void sub()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}
	protected void mul()
	{
		int a=2;
		int b=3;
		int c=a*b;
		System.out.println(c);
	}
	void div()
	{
		int a=10;
		int b=2;
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		AcessModifierExp1 obj=new AcessModifierExp1();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	

	}

}
