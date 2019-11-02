package collectionDemo;

import staticDemo.student;

public class array5 {

	public static void main(String[] args) {
		
		int a[][] = new int[2][2];
		//int a[] = {10,20,30};
		a[0][0] = 11;
		a[0][1] = 22;
		a[1][0] = 33;
		a[1][1] = 34;
		
		int a[][]={{1,2},{2,4}};  
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0] );
		System.out.println(a[1][1] );
		
System.out.println("-------------");
		
		for(int r=0; r<=1; r++)
		{
			for(int c=0;c<=1;c++)
			{
				System.out.println(a[r][c]);
			}
		}
		
		
		
	}

}
