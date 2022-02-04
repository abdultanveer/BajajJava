package exceptions;

public class Medicine {
	
	public static void main(String[] args) {
		harshitBringMedicine();
	}

	private static void harshitBringMedicine() {
		try {
			int c = 10/0;
		System.out.println("going to get imol");
		throw new NullPointerException("didn't get imol");
		}
		catch (NullPointerException mobileCall) {  //these are  special exception handlers
			System.out.println("getting ibrufen");
		}
		catch (ArithmeticException ae) {
			System.out.println("increment the denominator");
		}
		
	}

}
