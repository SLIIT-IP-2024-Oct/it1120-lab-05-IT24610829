import java.util.Scanner;

public class Lab5Q3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		final float  price = 48000;
		int nDate;
		float disPrice, noDisPrice, fPrice;

		System.out.println("Enter Start Date:");
		int sDate = input.nextInt();
		System.out.println("Enter Start Date:");
		int fDate = input.nextInt();

		if(sDate>=fDate){
			System.out.println("Error: Start Date must be less than End Date");
			return;
		}else if((sDate<1)||(sDate>31)||(fDate<1)||(fDate>31)){
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}

		System.out.println("Room charge Per Day: Rs. "+price+"/=");
		
		nDate = fDate - sDate;
		noDisPrice = nDate * price;

		System.out.println("Number of Days Reserved: "+nDate);
		if(nDate<3){
			System.out.println("Total ammount to be Paid: "+noDisPrice+"/=");
		}else if(nDate<5){
			disPrice = noDisPrice * 10 / 100;
			fPrice = noDisPrice - disPrice;
			System.out.println("Total ammount to be Paid: "+fPrice+"/=");
		}else{
			disPrice = noDisPrice * 20 / 100;
			fPrice = noDisPrice - disPrice;
			System.out.println("Total ammount to be Paid: "+fPrice+"/=");
		}
	}
}
