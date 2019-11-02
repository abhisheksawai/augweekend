package abstractionDemo;

public class hdfc implements RBI,SBI {

	public static void main(String[] args) {		
		hdfc h = new hdfc();
		hdfc a = new hdfc(); 
		hdfc v = new hdfc();
		v.vishal();
	//	hdfc b = new RBI();
		
		RBI d = new hdfc();
		d.homeloan();
		//d.car
		//d.hdfcself
		SBI k = new hdfc();
		k.carloan();
	
		
		h.homeloan();
		
		
		a.carloan();
		a.homeloan();
		a.hdfcselfloan();
	}
	
	public void hdfcselfloan()
	{
		System.out.println("free me dunga");
	}

	public void homeloan() {	
		System.out.println("hdfc home loan 10%");
	}

	public void carloan() {
		System.out.println("car loan 8%");
		
	}

	
	public void vishal() {
	System.out.println("vishal ke liye");
		
	}


}
