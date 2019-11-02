package collectionDemo;

import java.util.ArrayList;

public class arraylist4 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10); // 0 position
		al.add(20); //one
		al.add(null);//2 index
		al.add(10);
		al.add(30);
		al.add("abhishek");
		al.add('a');		
		System.out.println(al);
		
		al.set(2, "replaced");
		System.out.println(al);
		
		
	}

}
