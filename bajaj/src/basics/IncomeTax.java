package basics;

public class IncomeTax {
	
	int calculateTax(int income) {
		return income/10;
	}

	int calculateTax(int income, int spending) {
		return income/10 + spending/10;
	}
}
