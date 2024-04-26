package Week12;

enum Signal{
	RED,YELLOW,GREEN
}
class checkSignal
{
	Signal currentSignal;
	public checkSignal(Signal cs) {
		this.currentSignal=cs;
	}
	public void makeRide()
	{
		switch (currentSignal) {
		case RED:
			System.out.println("The Signal is RED.\nKindly wait until it turns to GREEN");
			break;
		case YELLOW:
			System.out.println("The Signal is YELLOW.\nKindly wait look around and make safe move");
			break;
		case GREEN:
			System.out.println("The Signal is GREEN.\nHave a safe Ride");
			break;
		}
	}
}
public class demoEnum{
	public static void  main(String[]args) {
		checkSignal myDrive=new checkSignal(Signal.YELLOW);
		myDrive.makeRide();
	}
}