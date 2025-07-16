package varArgument;

public class VarArgs {
	public static void main(String args[]) {
		printMaxNum(14,67,23,98,8,51);
	}
	
	public static void printMaxNum(int... numbers) {
		int arglen = numbers.length;
		System.out.println(arglen);
		
		if(numbers.length == 0) {
			System.out.println("No Argument Passed");
		}
		
		int answer = numbers[0];
		for(int i =1 ; i < arglen ; i++ ) {
			if(numbers[i]  > answer) {
				answer = numbers[i];
			}
		}
		System.out.println("answer " + answer);
	}
}
