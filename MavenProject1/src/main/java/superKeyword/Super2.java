package superKeyword;

public class Super2 extends Super1 {
String color="blue";
public void display()
{
	System.out.println(color);
	
	//super keyword to refer the immediate parent class instance variable.
	
	System.out.println(super.color);
	}
	public static void main(String[] args) {
		Super2 obj=new Super2();
		obj.display();

	}

}
