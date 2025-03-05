import java.util.Scanner;

class Handshakes{

	public static int Handshakes(int students){
		int max = (students *(students - 1))/2;
		return max; 
	}

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int students = scn.nextInt();
		int max = Handshakes(students);
		
		System.out.print("Maximum number of Handshakes possible: " + max);
		
		
	}
}