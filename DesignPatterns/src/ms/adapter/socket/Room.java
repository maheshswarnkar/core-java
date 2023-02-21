package ms.adapter.socket;

public class Room {

	public static void main(String[] args) {
		SwitchBoard switchBoard = new SwitchBoard();
		Switches switches = new Socket();
		switchBoard.setSw(switches);
		switchBoard.performOperations("Switch On");
	}

}
