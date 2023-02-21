package ms.adapter;

public class PenAdapter implements Pen {

	PilotPen pilotPen = new PilotPen();

	@Override
	public void write(String line) {
		pilotPen.mark(line);
	}

}
