package ms.adapter;

public class School {

	public static void main(String[] args) {
		AssignmentWork assignmentWork = new AssignmentWork();
		Pen pen = new PenAdapter();
		assignmentWork.setP(pen);
		assignmentWork.writeAssignment("Switch On");
	}

}
