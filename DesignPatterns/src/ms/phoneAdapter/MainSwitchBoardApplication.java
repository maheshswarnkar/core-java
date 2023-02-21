package ms.phoneAdapter;

public class MainSwitchBoardApplication {
	
	public static void main(String[] args) {

		ISocket socket = new MobilePhoneAdapter();

		SwitchBoard switchBoard = new SwitchBoard();
		switchBoard.setDevice(socket);

		switchBoard.switchOn();
		switchBoard.switchOff();
	}

}
