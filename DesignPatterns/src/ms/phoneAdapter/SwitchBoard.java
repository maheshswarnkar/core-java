package ms.phoneAdapter;

public class SwitchBoard {

	ISocket device;

	public ISocket getDevice() {
		return device;
	}

	public void setDevice(ISocket device) {
		this.device = device;
	}

	public void switchOn() {
		device.start();
	}

	public void switchOff() {
		device.stop();
	}

}
