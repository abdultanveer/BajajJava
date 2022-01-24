package basics.abstraction;

public class Manager {
	
	public static void main(String[] args) {
		SwitchBoardListener sbl = // new HavellsAppliances();
				new GEAppliances(); //wiring
		sbl.switchOne();
		sbl.switchTwo();
		sbl.switchThree();
	}

}
