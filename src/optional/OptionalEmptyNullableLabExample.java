package optional;

import java.util.Optional;

public class OptionalEmptyNullableLabExample {

	public static Optional<String> ofNullable(){
		
		Optional<String> stringOptional = Optional.ofNullable("Hello");
		Optional<String> stringOptional1 = Optional.ofNullable(null);
		
		if(stringOptional1.isPresent()){
			System.out.println(stringOptional1.get());
		}else {
			System.out.println("string Optional1 is empty");
		}
		return stringOptional;
	}
	
	public static Optional<String> of(){
		Optional<String> stringOptional = Optional.of("Hello");
		return stringOptional;
	}
	
	public static Optional<String> empty(){
		return Optional.empty();
	}

	public static void main(String[] args) {

		System.out.println(ofNullable().get());
		
		System.out.println("of :" + of().get());
		
		System.out.println("empty : " + empty());

	}

}
