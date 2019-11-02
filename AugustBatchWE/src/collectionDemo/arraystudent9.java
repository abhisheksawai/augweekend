package collectionDemo;

import java.util.ArrayList;

public class arraystudent9 {

	public static void main(String[] args) {		
	//	ArrayList al = new ArrayList();
//		al.add("abhishek"); // 0
//		al.add(new student(100, "abhishek")); //1
//	    al.add(new student(101, "vishal")); //2
//	    al.add(new empcollection(2002));
//		  	    
	    		  	   ArrayList<student> al = new ArrayList<student>(); 	
	    		  	   al.add(new student(100, "abhishek"));
	    		  	  al.add(new student(101, "vishal"));
	    		  	  
	    		  	  for ( student ab : al)
	    		  	  {
	    		  		  System.out.println(ab.roll + ab.name);
	    		  	  }
	    		  	  
	    		 // 	 al.add(new empcollection(2002));
	    		//  	al.add("abhishek"); 
	    		  	  
	    		  	  
	}

}
