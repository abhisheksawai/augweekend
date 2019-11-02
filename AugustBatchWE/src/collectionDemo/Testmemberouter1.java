package collectionDemo;

public class Testmemberouter1 {	
	
	public class inner{		
	
		void msg()
		{			
			System.out.println("data is ");		
		}  
	}
	
	public static void main(String[] args) {
		 
		Testmemberouter1 obj=new Testmemberouter1();  
		Testmemberouter1.inner inobj = obj.new inner();
		inobj.msg();

	}

}
