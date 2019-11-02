package basicJava;

public class TestStudent3 {

	public static void main(String[] args) {		
		student2 s3 = new student2();		
		student2 s2 = new student2();		
		student2 s4 = new student2();		
		
		
		s2.xyz(103,"abhishek");	
		s3.abc(104,"manoj");
		s4.pqr(105,"Jayanta");

	
		System.out.println(s2.roll);
		System.out.println(s2.name);	
		
		System.out.println(s3.roll);
		System.out.println(s3.name);
		
		System.out.println(s4.roll);
		System.out.println(s4.name);


	}

}
