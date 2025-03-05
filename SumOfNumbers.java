import java.util.Scanner;

class SumOfNumbers{
	public static int Sum(int num){
		int sum =0; 
		for(int i=1;i<=num;i++){
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a natural number: ");
		int num=sc.nextInt();
		if(num <0 || num ==0){
			System.out.println("Enter a natural number");
			return ;
		}
		
		int result = Sum(num);
		
		System.out.print("Sum of natural numbers: " + result);
	}

} 