import java.util.Scanner;

class SimpleInterest{

	public static int simpleInterest(int principal, int roi, int time){
		int simpleInterest = principal * roi * time / 100;
		return simpleInterest;
		
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the principal amount: ");
		int principal = scn.nextInt();
		
		if(principal <0){
			System.out.print("Enter a valid amount");
			System.exit(1);
		}
		
		System.out.print("Enter the rate of interest: ");
		int roi = scn.nextInt();
		
		System.out.print("Enter the time: ");
		int time = scn.nextInt();
		
		int simpleInterest =  simpleInterest(principal, roi, time);
		
		System.out.print("Simple Interest is "+ simpleInterest +" for principal "+ principal +" Rate of interest "+ roi +" and time "+ time +" years." );
		
	}
}