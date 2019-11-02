package collectionDemo;

import staticDemo.student;

public class array2 {

	public static void main(String[] args) {
		
		int a[] = new int[3];
		//int a[] = {10,20,30};
		a[0] = 11;
		a[1] = 224;
		a[2] = 33;
		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(i);
		}

		for(int i=0; i<=2 ; i ++)
		{
			System.out.println(a[i]);
			//System.out.println();
		}

		for(int i=0; i<a.length ; i ++)
		{
			System.out.println(a[i]);
			//System.out.println();
		}
		
	}

}
