package ms.adapter.socket;

public class Socket implements Switches {

	Iron pilotPen = new Iron();

	@Override
	public void switchOn(String line) {
		pilotPen.run(line);
	}
	
	@Override
	public void switchOff(String line) {
		pilotPen.run(line);
	}

}
