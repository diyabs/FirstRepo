package inheritance;

public class HeirarChild2 extends HeirarParent {
	public void mul()
	{
		int a=10;
		int b=2;
		int c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		HeirarChild2 obj=new HeirarChild2();
		obj.add();
		obj.mul();
		// TODO Auto-generated method stub

	}

}
