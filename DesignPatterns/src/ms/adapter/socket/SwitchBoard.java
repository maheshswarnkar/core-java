package ms.adapter.socket;

public class SwitchBoard {
	private Switches sw;

	public Switches getSw() {
		return sw;
	}

	public void setSw(Switches sw) {
		this.sw = sw;
	}

	public void performOperations(String str) {
		sw.switchOn(str);
	}
	public void performOnOperation(String str) {
		sw.switchOn(str);
	}
	public void performOffOperation(String str) {
		sw.switchOn(str);
	}

}
