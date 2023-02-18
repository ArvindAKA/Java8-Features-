package optional;

import java.util.Optional;

public class OptionalPresentExample {
	
	public static void main(String[] args) {
		
		//isPresent
		Optional<String> optional = Optional.ofNullable("hello optional");
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}else {
			System.out.println("Not value ");
		}
			
		//ifPresent
		
		Optional<String> optional2 = Optional.of("default optional");
		optional2.ifPresent(s->System.out.println(s));

	}

}
