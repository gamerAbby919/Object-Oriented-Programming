import java.util.*;

class Exercise123Planning {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] myList = new int[100];
		
		for (int i = 0; i < myList.length; i++) {
			myList[i] = (int)(Math.random() * 100);
		}
		
		int userInput = input.nextInt();
		
		try {
			int idk = myList[userInput];
			System.out.println(idk);
		}
		
		catch (ArrayIndexOutOfBoundsException outOfBounds) {
			System.out.println("Out of Bounds");
		}
		
	}
}