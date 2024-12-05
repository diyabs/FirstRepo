package inheritance;

public class MulChild extends MulParent2 {
	public void mul()
	{
		int a=12;
		int b=2;
		int c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		MulChild obj=new MulChild();
		obj.add();
		obj.sub();
		obj.mul();
		// TODO Auto-generated method stub

	}

}
