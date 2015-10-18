import java.util.Scanner;
public class MarsChallenge
{
	public static void main(String args[])
	{
		int xCoordinate,yCoordinate;
		int numberOfCases;
		String controlString = null;
		char direction;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		numberOfCases = input.nextInt();
		while(numberOfCases > 0)
		{
			System.out.println("Enter the upper right coordinates of the plateau:");
			xCoordinate = input.nextInt();
			yCoordinate = input.nextInt();
			Area area = new Area();
			area.set(xCoordinate,yCoordinate);
			System.out.println("Enter the position and heading of the rover: ");
			xCoordinate = input.nextInt();
			yCoordinate = input.nextInt();
			direction = input.next().charAt(0);
			input.nextLine();
			System.out.println("Enter the control string :");
			controlString = input.nextLine();
			new MarsRoverController(xCoordinate,yCoordinate,direction,area,controlString);
			numberOfCases = numberOfCases - 1;
		}
	}
}	