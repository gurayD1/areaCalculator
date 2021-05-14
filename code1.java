import java.util.Scanner;

public class code1 {
    public static double area1;
	public static double area2;
	public static double totalArea;

	public static void main(String[] args) {
		// scanner object created to get user input
		Scanner input = new Scanner(System.in);
		// ask user the number of points
		System.out.println("Enter the number of points: ");
		// collect the value
		int pointsNumber = input.nextInt();
		// ask user to enter the points
		System.out.println("enter the coordinates of the points:");
		// double array created to collect x and y coordinates of the points
		double X[] = new double[pointsNumber];
		double Y[] = new double[pointsNumber];

		// for loop created to assign the points to the arrays
		for (int i = 0; i < pointsNumber; i++) {

			X[i] = input.nextDouble();
			Y[i] = input.nextDouble();

		}
		// for loop created to calculate the first part of area
		for (int i = 0; i < pointsNumber - 1; i++) {

			area1 += X[i] * Y[i + 1];

		}
		area1 += X[pointsNumber - 1] * Y[0];

		// for loop created to calculate the second part of area
		for (int i = 0; i < pointsNumber - 1; i++) {

			area2 += Y[i] * X[i + 1];

		}
		area2 += Y[pointsNumber - 1] * X[0];

		// calculate the area
		totalArea = 0.5 * (area1 - area2);

		// display the area
		System.out.println("the total area is " + Math.abs(totalArea));

	}

}


