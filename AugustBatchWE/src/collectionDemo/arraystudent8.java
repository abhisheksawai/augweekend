package collectionDemo;

import java.util.ArrayList;

public class arraystudent8 {

	public static void main(String[] args) {		
		ArrayList al = new ArrayList();
		al.add("abhishek"); // 0
		al.add(new student(100, "abhishek")); //1
	    al.add(new student(101, "vishal")); //2
	    al.add(new empcollection(2002));
		    System.out.println(al);	  	    
	    		for(Object a:al)
	    		{
	    			if(a instanceof student)
	    			{
	    				//student s = (student)a;	  
	    			   // System.out.println(s.roll);
	    			//	System.out.println(s.name);	    				
	    				//System.out.println(((student) a).roll);
	    				//System.out.println(((student) a).name);
	    			}			    			
	    			if(a instanceof empcollection)
	    			{
	    				empcollection e = (empcollection)a;	  
	    			    System.out.println(e.eno);
	    			//	System.out.println(s.name);	    				
	    				//System.out.println(((student) a).roll);
	    				//System.out.println(((student) a).name);
	    			}		
	    		
	    		}
	    		//System.out.println(al);	  	    		
		
	}

}
