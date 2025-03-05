import java.util.Scanner;

class CheckNumber{
	
	public static int TypeOfNumber(int num){
		if(num <0){
			return -1;
		}
		
		if(num ==0){
			return 0;
		}
		
		return 1;
		
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scn.nextInt();
		
		int numType = TypeOfNumber(num);
		
		System.out.print("Type of number is: " + numType);

	}	

}