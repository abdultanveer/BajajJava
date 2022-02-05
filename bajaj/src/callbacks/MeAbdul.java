package callbacks;

/**
 * give work to the office boy
 * @author Admin
 *
 */
public class MeAbdul {
	
	public static void main(String[] args) {
		System.out.println("i can pay you after you're done with the job");

		MobilePhone mobilePhone = new Cashier();

		OfficeBoy officeBoy = new OfficeBoy(mobilePhone);
		officeBoy.start();
		//officeBoy.setJobDoneListener(mobilePhone);
		//officeBoy.doWorkGovtOffice(mobilePhone); // blocking
		System.out.println("abdul needn't wait for the office boy to return");
		System.out.println("abdul has left for the important meeting");
	}

}
