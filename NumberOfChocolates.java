import java.util.Scanner;

class  NumberOfChocolates{  


	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int[] arr = new int[2];
		
		arr[0] = number % divisor;
		arr[1] = number / divisor;
		
		return arr;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of chocolates: ");
		int numberOfchocolates =sc.nextInt();
		System.out.print("Enter number of children: ");
		int  numberOfChildren=sc.nextInt();
		
		int[] res = findRemainderAndQuotient(numberOfchocolates, numberOfChildren);
		
		System.out.println("Number of chocolates is: " + numberOfchocolates + ",  number Of children is: " + numberOfChildren + "\neach Children gets: " + res[1] + "\nremaining chocolates: " + res[0]  );
	
	}


}
