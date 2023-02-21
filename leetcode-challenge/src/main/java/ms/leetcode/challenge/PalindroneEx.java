package ms.leetcode.challenge;

public class PalindroneEx {

	public static void main(String[] args) {
		String str = "abcdedcba";
		System.out.println("PalindroneString"+ palindromeString(str));

	}

	public static String palindromeString(String str) {
		String palindromString = "";
		if (str.length() < 2) {
			return palindromString;
		}
		char charArray[] = str.toCharArray();
		int findCenterPosition = 0;
		int lengthOfString = str.length();
		System.out.println("Length of string " + lengthOfString);
		int centerPoint = lengthOfString / 2;
		boolean numberIsOdd = false;
		if (lengthOfString % 2 == 1) {
			System.out.println("It is odd number");
			centerPoint = centerPoint + 1;
			numberIsOdd = true;
		}
		System.out.println("CenterPoint " + centerPoint);

		int towardsStart = 0;
		int towardsEnd = 0;
		boolean firstTime = true;

		for (int i = 1; i < centerPoint; i++) {
			if (numberIsOdd && (charArray[centerPoint - i] == charArray[centerPoint + i])) {
				palindromString = palindromString + charArray[centerPoint + i];
			} else if (!numberIsOdd) {
				if (firstTime) {
					if (charArray[centerPoint] == charArray[centerPoint + 1]) {
						palindromString = palindromString;
					} else
						break;
					firstTime = false;
				} else if (charArray[centerPoint - i] == charArray[centerPoint + i + 1]) {
					palindromString = palindromString + palindromString;
				}

			} else {
				System.out.println("String is not palindrome");
				break;
			}
//			towardsStart--;
//			towardsEnd++;

		}
		return palindromString;

	}

}
