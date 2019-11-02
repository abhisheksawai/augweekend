package collectionDemo;

import staticDemo.student;

public class instanceofcheck extends instanceofcheck2 {

	public static void main(String[] args) {
		
		instanceofcheck i = new instanceofcheck();
		instanceofcheck2 j = new instanceofcheck2();
		instanceofcheck k = new instanceofcheck();
		
		
		System.out.println(i instanceof instanceofcheck);  //true
		System.out.println(j instanceof instanceofcheck);		//false
		System.out.println(k instanceof instanceofcheck2);		// ??

	}

}
