package com.ms.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MathOperations {

	private int firstNum;
	private int secondNum;

	public int sumOfTwoNumbers(MathOperations mathOperations) {
		return (mathOperations.getFirstNum() * mathOperations.getSecondNum());
	}

}
