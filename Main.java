import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		double r = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Input radius of circle: ");
		r = input.nextDouble();
		double area = Math.PI * Math.pow(r,2);
		System.out.println("The area of the circle with radius: " + r + " is: " + area);
		System.out.println("The half area of the circle with radius: " + r + " is: " + area/2);
	}
}