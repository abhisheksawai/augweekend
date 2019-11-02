package encapsulation;

public class dusrashishir extends shishir {
	
	public void ds()
	{
		System.out.println("ds");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println(ctc);

		shishir s = new shishir();
		s.newctc();
		System.out.println(s.ctc);
		
		dusrashishir ds = new dusrashishir();
		ds.newctc();
		
	}

}
