package collectionDemo;

public class testemp {

	public static void main(String[] args) {
		
		//emp e = new emp();
		emp e1 = new emp(101,"vishal");
		emp e2 = new emp(102,"monica");
		emp e3 = new emp(103,"jayanta");
		
		//int a[] = new int[3];
		emp[] e = new emp[3];
	
//		a[0] = 11;
//		a[1] = 224;
//		a[2] = 33;
		
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		

		for(int i = 0; i<=2;i++)
		{
			System.out.println(e[i].eno);
			System.out.println(e[i].ename);
		}
		
		
		for( Object  ab : e)
		{
			// ab = (emp) e;
			System.out.println(ab.toString());
			System.out.println(ab);
		}
		
	}

}
