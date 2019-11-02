package abstractionDemo;

public class icici implements RBI {

	public static void main(String[] args) {
		

		icici i = new icici();
		i.homeloan();
		i.persoanlloan();
	}
	
	public void homeloan() {
		System.out.println("icic home loan 15%");		
	}

	public void persoanlloan() {
		System.out.println("icic persoanl loan 25%");		
	}

}
