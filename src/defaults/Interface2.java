package defaults;

public interface Interface2 extends Interface1{
	

	default void MethodB() {
		System.out.println("Inside Default Method B");
	}
	

	default void MethodA() {
		System.out.println("Inside Default Method A " + Interface2.class);
	}

}
