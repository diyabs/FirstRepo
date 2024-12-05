package inheritance;

public class HeirarChild1 extends HeirarParent {
	public void sub()
	{
		int a=12;
		int b=10;
		int c=a-b;
		System.out.println(c);
	
	}
public static void main(String[] args) {
	HeirarChild1 obj=new HeirarChild1();
	obj.add();
	obj.sub();
		// TODO Auto-generated method stub

	}

}
