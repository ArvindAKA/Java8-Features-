package defaults;

public interface Interface3 extends Interface2{
	

	default void MethodC() {
		System.out.println("Inside Default Method C");
	}

}
