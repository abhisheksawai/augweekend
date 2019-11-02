package inheritanceDemo;

public class creta extends Car {
	
	public void cr1()
	{
		System.out.println("cr1");
	}

	public static void main(String[] args) {
		
		creta c = new creta();
		Car cr = new Car();
		//creta c = new Car();
		Car d = new creta();
		//Car g = new fourWheeler();
		fourWheeler h = new Car();
		h.fw1();
		//h.c1();
		
		fourWheeler i = new creta(); 
		i.fw1();
	//	i.c1();
		
		//d.c1();
		d.fw1();
		//d.cr1();
		
		//c. ?? cr1/c1/fw1
		c.cr1();
		c.c1();
		c.fw1();		
		
		cr.c1();
		cr.fw1();
		//cr.cr1();

	}

}
