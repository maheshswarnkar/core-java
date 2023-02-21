package ms.oops.nice;

import java.util.List;

interface Car{
	double getPetrol();
}

public class CarPool  {
	private List<Car> myCars ;
	public double getTotalPetrol() {
		double sum = 0.0;
		for(Car car : myCars) {
			sum = sum + car.getPetrol();
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
