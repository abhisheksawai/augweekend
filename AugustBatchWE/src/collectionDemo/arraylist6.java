package collectionDemo;

import java.util.ArrayList;

public class arraylist6 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10); // 0 position
		al.add(20); //one
		al.add(null);  //2
		al.add(10);  //3
		al.add(30);
		al.add("abhishek");
		al.add('a');		
		//System.out.println(al);
		
		al.remove(4);
		System.out.println(al);
	System.out.println(al.get(3));
	System.out.println(al.indexOf("abhishek"));
	
	
	for(int a=0;a<al.size(); a++)
	{
		System.out.println(al.get(a));
	}
		
	
	}

}
