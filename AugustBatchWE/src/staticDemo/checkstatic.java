package staticDemo;

import javax.management.NotificationBroadcasterSupport;

public class checkstatic {
	
	static int count=0;
	int nonstatic=100;
	
	public void m2()
	{
		//static int count4=0;
		System.out.println("m2");
	}
	public checkstatic()
	{
		//int count1=0;
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		checkstatic cs1 = new checkstatic();
		checkstatic cs2 = new checkstatic();
		checkstatic cs3 = new checkstatic();	
		System.out.println(cs1.nonstatic);
		System.out.println(count);
	//	System.out.println(nonstatic);

	}

}
