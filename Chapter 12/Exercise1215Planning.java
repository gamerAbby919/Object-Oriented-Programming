import java.nio.*;
import java.io.*;
import java.util.*;

class Exercise1215Planning {
	public static void main(String[] args) throws Exception{
		java.io.File file = new java.io.File("Exercise12_15.txt");
		Scanner input = new Scanner(new File("Exercise12_15.txt"));
		int[] myList = new int[100];
		
		try (
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		) {
			output.print(myList);
			output.close();
			for (int i = 0; i < myList.length; i++) {
				myList[i] = (int)(Math.random() * 100);
				output.print(myList[i] + " ");
			}
		}
		catch (FileNotFoundException noFile) {
			System.out.println("Error");
		}
			
			for (int i = 0; i < myList.length; i++) {
				myList[i] = (int)(Math.random() * 100);
				System.out.println(myList[i] + " ");
		}
	}
}