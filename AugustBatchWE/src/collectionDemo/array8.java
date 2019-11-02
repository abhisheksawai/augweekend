package collectionDemo;

import staticDemo.student;

public class array8 {

	public static void main(String[] args) {
		
		//int a[][] = new int[2][2];		
		int a[][]={{1,24},{26,4}};  
		
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
		
		for(int[] ab:a)
		{
			for(int[] ac :a )
			{
				System.out.println(ab);
				System.out.println(ac);
		}}
		
		
	}

}
