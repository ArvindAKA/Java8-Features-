package defaults;

public interface Interface4 {
	

	default void MethodA() {
		System.out.println("Inside Default Method A "+ Interface4.class);
	}


}
