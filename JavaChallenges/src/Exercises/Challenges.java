package Exercises;
public class Challenges {
	public static void main(String[] args) {
//		Integer[] numsL = {5,10,23,13};
//		System.out.println(maximum(numsL));
		System.out.println(printNumberInWord(4));
//		checkOddEven(57);
//		System.out.println(average(numsL));
		
	}
	//Challenge 1: Find Maximum
	public static Integer maximum(Integer[] numList) {
		int max = 0;
		for (int i = 0; i < numList.length; i++) {
			if (numList[i] > max ) {
				max = numList[i];				
			}
//			System.out.println("i= "+ i);
//			System.out.println("VALUE= " + max);
		}
		return max;		 
		}
	
	//Challenge 2: Print number in word
	public static String printNumberInWord(int num) {
		String number = "";
		
		switch (num) {
			case 1:
				number = "ONE";
				break;
			case 2:
				number = "TWO";
				break;
			case 3:
				number = "THREE";
				break;
			case 4:
				number = "FOUR";
				break;
			case 5:
				number = "FIVE";
				break;
			case 6:
				number = "SIX";
				break;
			case 7:
				number = "SEVEN";
				break;
			case 8:
				number = "EIGHT";
				break;
			case 9:
				number = "NINE";
				break;
			default:
				number = "OTHER";
			}
		return number;		
		}
	
	//Challenge 3: Check Odd/Even
	public static void checkOddEven(int num){
		if (num % 2 == 0) {
			System.out.println("This number is even: " + num);
		} else {
			System.out.println("This number is odd: " + num);
		}
	}
	
	//Challenge 4: Calculate the average
	public static double average(Integer[] numList) {
		double avg = 0;
		for (int i = 0; i < numList.length; i++) {
			avg += numList[i]; 
//			System.out.println("value= "+avg);
		}
		return avg / numList.length; 		
	}	

}