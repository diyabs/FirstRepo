package superKeyword;
	
public class SuperKey2 extends SuperKey {
	public void display()
	{
		String s="meena";
		System.out.println(s);
		
		//super keyword to refer the immediate parent class instance method.
		
		super.add();			
	}

	public static void main(String[] args) {
		SuperKey2 obj=new SuperKey2();
		obj.display();
		
	}

}
