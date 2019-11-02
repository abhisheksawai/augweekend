package collectionDemo;

import java.util.ArrayList;

public class arraylist3 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10); // 0 position
		al.add(20); //one
		al.add(null);
		al.add(10);
		al.add(30);
		al.add("abhishek");
		al.add('a');		
	
		//System.out.println(al.size());
		
		al.add(10, "ten");
		
		System.out.println(al);
		System.out.println(al.size());
	}

}
