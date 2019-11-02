package basicJava;

public class student {

	int roll;
	String name;
	
	protected void checkstudent()
	{
		System.out.println("check stud protected");
	}
	
	
	private void xyz(int i, String passname)
	{
		roll = i;
		name = passname;
		
	}
	
	public static void main(String[] args) {
		student aa = new student();
		//aa.xyz(i, passname);
		aa.checkstudent();
	}
}
