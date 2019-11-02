package inheritanceDemo;

public class prayagA extends prayagB, prayagC {

	public static void main(String[] args) {
		
     prayagA p = new prayagA();
     p.pa();
     p.pb();
     p.pc();
		
}
	
	public void pa()
	{
		System.out.println("pa");
	}

}
