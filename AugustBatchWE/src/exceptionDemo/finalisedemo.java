package exceptionDemo;

public class finalisedemo {
	
	public void finalize(){
		
		System.out.println("finalize called");
		
	}  
	
	
	public static void main(String[] args){  
		finalisedemo f1=new finalisedemo();  
		finalisedemo f2=new finalisedemo();  
	f1=null;  
	f2=null;  

	System.gc();
	
	}}  



