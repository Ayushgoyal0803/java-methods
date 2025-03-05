import java.util.Scanner;

class RemainderQuotient{  


	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int[] arr = new int[2];
		
		arr[0] = number % divisor;
		arr[1] = number / divisor;
		
		return arr;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		System.out.print("Enter divisor: ");
		int divisor=sc.nextInt();
		
		int[] res = findRemainderAndQuotient(num,divisor);
		
		System.out.println("Number is: " + num + ", divisor is: " + divisor + "\nits remainder is: " + res[0] + "\nits quotient is: " + res[1]  );
	
	}


}
