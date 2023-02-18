package lambdas;

public class RunnableLambdaExample {
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable");
				
			}
		};
		
		new Thread(runnable).start();
		
		Runnable runnable1 = ()->{
			System.out.println("Inside Runnable 1");
		};
		
		new Thread(runnable1).start();
		
		new Thread(()->System.out.println("Inside Runnable 2")).start();
		
		Runnable runnableLambda = ()->{
			System.out.println("Inside Runnable 3");
			System.out.println("Inside Runnable 3.1");
		};
		
		new Thread(runnableLambda).start();
	}

}
