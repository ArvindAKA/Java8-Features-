package generalcode;

public class Solution implements Runnable {
	public void run() {
		System.out.printf("Java ");
		System.out.printf("World ");
	}

	public static void main(String[] args) {
		Solution obj = new Solution();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.printf("SDE ");
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("for ");
		
		System.out.println("*******************************");
		Integer i1 = 127;
		   Integer i2 = 127;
		   System.out.println(i1 == i2);
		   Integer i3 = 128;
		   Integer i4 = 128;
		   System.out.println(i3 == i4);
	}
}