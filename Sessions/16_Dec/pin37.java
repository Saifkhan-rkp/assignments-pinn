
class sample37 implements Runnable {
	public sample37() {

	}

	public void run() {
		int i;
		System.out.println("Entering the function fn");
		for (i = 1; i <= 10; i++) {
			System.out.println("Function fn I = " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Exiting the function fn");
	}
}

class pin37 {
	public static void main(String[] args) {
		try {
			System.out.println("Entering the main() function");
			sample37 s = new sample37();
			Thread t = new Thread(s);
			t.start();
			int i;
			for (i = 1; i <= 10; i++) {
				System.out.println("Main function I = " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("Exiting the main() function");
	}
}