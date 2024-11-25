import java.util.Scanner;

public class Lab5Q1{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);

		int sNum, lNum;
		
		System.out.println("Enter the First Integer: ");
		int fInt = input.nextInt();
		System.out.println("Enter the Second Integer: ");
		int sInt = input.nextInt();
		System.out.println("Enter the Third Integer: ");
		int tInt = input.nextInt();

		if((fInt==sInt)||(fInt==tInt)||(sInt==tInt)){
			System.out.println("Enter Different Numbers!");
			return;
		}else{
			if(fInt>sInt){
				if(sInt>tInt){
					lNum = fInt;
					sNum = tInt;
				}else if(fInt>tInt){
					lNum = fInt;
					sNum = sInt;
				}else{
					lNum = tInt;
					sNum = sInt;
				}
			}else{
				if(fInt>tInt){
					lNum = sInt;
					sNum = fInt;
				}else{
					lNum = tInt;
					sNum = fInt;
				}
			}
		}

		System.out.println("User Entered numbers are: "+fInt+" "+sInt+" "+tInt);
		System.out.println("The Smallest number is: "+sNum);
		System.out.println("The Largest number is: "+lNum);
	}
}