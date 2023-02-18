package defaults;

public class Client14 implements Interface1, Interface4 {
	
	public void MethodA() {
		System.out.println(" Inside method " + Client14.class);
	}

	public static void main(String[] args) {

		Client14 client14 = new  Client14();
		client14.MethodA();
	}

}
