package ms.leetcode.challenge;

public class ReverseInteger {
	
	public static void main(String[] args) {
		int input = 1507942630;
		long reversed = 0;
		while (input !=0) {
			reversed = reversed *10 + input % 10;
			System.out.println("Reversed number "+reversed);
			input /= 10;
			if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
				break;
			}
		}
		System.out.println("Integer max value "+Integer.MAX_VALUE);
		System.out.println("Integer min value "+Integer.MIN_VALUE);
		System.out.println("Reversed value "+reversed);
	}

}
