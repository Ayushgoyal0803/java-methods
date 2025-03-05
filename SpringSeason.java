import java.util.Scanner;

class SpringSeason{
	public static boolean Season(int month, int date){
		if( month == 3 && ( date >= 20 && date <= 31) ){
			return true;
		}
		else if( month == 4 && (date >= 1 && date <= 30)){
			return true;
		}
		else if( month == 5 && (date >= 1 && date <= 31) ){
			return true;
		}
		else if(month == 6 && (date>=1 && date<=20)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter month number: ");
		int month=sc.nextInt();
		if(month <1 || month >12){
			System.out.println("Enter a valid month number");
			return ;
		}
		
		System.out.print("enter date: ");
		int date=sc.nextInt();
		if(date <1 || date >31){
			System.out.println("Enter a valid date");
			return ;
		}
		
		boolean result = Season(month,date);
		
		if(result){
			System.out.println("Its a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}
		
	}
}