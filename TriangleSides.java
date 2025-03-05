import java.util.Scanner;

class TriangleSides{
	
	public static double NoOfRounds(int total , int distance){
		double rounds = (double) distance / total;
		
		return rounds;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the sides of triangle in meters: ");
		int side1 = scn.nextInt();
		int side2 = scn.nextInt();
		int side3 = scn.nextInt();
		
		int total = side1 + side2 + side3;
		
		int distance = 5000;
		
		double rounds = NoOfRounds(total,distance);
		
		System.out.print("No of rounds to run by athlete are: " + rounds);

	}	

}