package collectionDemo;

import java.util.ArrayList;

public class arraylist7 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		
		ArrayList al2 = new ArrayList(al);
		al2.add("al2 ka object");
		System.out.println(al2);
		
		ArrayList al3 = new ArrayList();
		
		al3.add("al3 ka object");
		al3.addAll(al2);
		System.out.println(al3);

	}

}
