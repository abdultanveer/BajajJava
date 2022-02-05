package callbacks;

/**
 * govt office work
 * @author Admin
 *
 */
public class OfficeBoy extends Thread{
	MobilePhone mPhone;
	
	public OfficeBoy(MobilePhone mobilePhone) {
		mPhone = mobilePhone;
	}

	public void doWorkGovtOffice(MobilePhone mobilePhone) {
		try {
			System.out.println("going to the office");
			Thread.sleep(5000);
			System.out.println("its taking time in the office");
			Thread.sleep(5000);
			
			System.out.println("done with the work");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mobilePhone.greenButton();
		
	}

	public void setJobDoneListener(MobilePhone mobilePhone) {
		doWorkGovtOffice(mobilePhone);
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		doWorkGovtOffice(mPhone);
	}

}
