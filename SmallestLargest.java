import java.util.Scanner;

class SmallestLargest{

	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int[] arr = new int[2];
		
		if(number1 > number2 && number1 > number3){
			arr[0] = number1;
			
			if(number2 > number3){
				arr[1] = number3;
			}
			else{
				arr[1] = number2;
			}
			
		}else if(number2 > number3 ){
			arr[0] = number2;
			
			if(number1 > number3){
				arr[1] = number3;	
			}
			else{
				arr[1] = number1;
			}
		}
		else{
			arr[0] = number3;
			if(number1>number2){
				arr[1] = number2;
			}
			else{
				arr[1] = number1;
			}
		}
		
		return arr;
	}

	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();		

		int[] res = findSmallestAndLargest(num1, num2, num3);
		
		System.out.print("Smallest number is: " + res[1] +"\nLargest number is: " + res[0]);
	}
}