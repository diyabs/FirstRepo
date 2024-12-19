package collection;

import java.util.ArrayList;

public class ArrayListExp {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("red");
		al.add("blue");
		al.add("yellow");
		al.add("pink");
		al.add("orange");
		al.add("green");
		al.add("black");
		al.add("purple");
		ArrayList<String> la=new ArrayList<String>();
		la.add("apple");
		la.add("banana");
		la.add("orange");
		al.addAll(la);
		System.out.println(al);
		boolean x=al.contains("apple");
		System.out.println(x);
		boolean b=al.contains("brown");
		System.out.println(b);
		System.out.println(al.get(4));
		boolean bo=al.isEmpty();
		System.out.println(bo);
		al.remove(1);
		al.remove("black");
		System.out.println(al);
		System.out.println(al.size());
		

	}

}
