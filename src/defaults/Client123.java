package defaults;

public class Client123 implements Interface1, Interface2, Interface3 {
	
	public void MethodA() {
		System.out.println("Inside Default Method A " + Client123.class);
	}

	public static void main(String[] args) {

		Client123 client123 = new Client123();
		client123.MethodA();
		client123.MethodB();
		client123.MethodC();

	}

}
