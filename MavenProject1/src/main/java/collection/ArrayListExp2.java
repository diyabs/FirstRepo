package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExp2 {

	public static void main(String[] args) {
		ArrayList<String> li=new ArrayList<String>();
		li.add("water");
		li.add("tree");
		li.add("food");
		li.add("air");
		Iterator<String> it=li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(li);

	}

}
