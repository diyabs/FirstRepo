package superKeyword;

public class SuperKey4 extends SuperKey3{
	public SuperKey4()
	{
		//Super keyword is used to refer the immediate parent class constructor
		
		super(10,20);
		String name="anu";
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		
		SuperKey4 obj=new SuperKey4();
		

	}

}
