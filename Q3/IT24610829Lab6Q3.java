import java.util.Scanner;
public class IT24610829Lab6Q3 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int count = 0;
double sumOfSqr = 0;

System.out.println("Enter positive integers (terminate input with -99):");
while (true) {
System.out.print("Enter a number: ");
int number = input.nextInt();

if (number == -99) {
break;
}

if (number < 0) {
System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
continue;
}

sumOfSqr += Math.pow(number, 2);
count++;
}
double rms = Math.sqrt(sumOfSqr / count);
System.out.println("\nRoot Mean Square (RMS): " + rms);

}
}
