package abstractionDemo;

public class casioCalc extends calculator {

	public static void main(String[] args) {
		
		casioCalc c = new casioCalc(); 
		c.add();
		c.sub();
		c.mul();
		c.div();		
	}

	void mul() {
		System.out.println("mul");
	}

	void div() {

		System.out.println("div");
	}

}
