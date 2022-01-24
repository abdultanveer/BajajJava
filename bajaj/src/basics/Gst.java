package basics;

public class Gst extends IncomeTax {

	@Override  //redefining
	int calculateTax(int income) {
		// TODO Auto-generated method stub
		int oldTax = super.calculateTax(income);
		int newTax = 0;
		if(income > 10000) {
			newTax = 10000/100 * 3;
		}
		return oldTax + newTax;
	}
	
	int addNewFunctionality() {
		System.out.println("this is my new functionality");
		return 10;
	}
}
