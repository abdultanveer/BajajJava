package callbacks;

/**
 * pay the office boy once job is done
 * @author Admin
 *
 */
public class Cashier implements MobilePhone{

	@Override
	public void greenButton() {
		System.out.println("Cashier: since you've done the job i'll release your payment");
		
	}

}
