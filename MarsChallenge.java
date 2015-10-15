import java.util.Scanner;
public class MarsChallenge
{
	public static void main(String args[])
	{
		int x,y;
		int test;
		String s = null;
		char h;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		test = in.nextInt();
		while(test > 0)
		{
			System.out.println("Enter the upper right coordinates of the plateau:");
			x = in.nextInt();
			y = in.nextInt();
			Area a = new Area();
			a.set(x,y);
			System.out.println("Enter the position and heading of the rover: ");
			x = in.nextInt();
			y = in.nextInt();
			h = in.next().charAt(0);
			MarsRover mr = new MarsRover(x,y,h,a);
			in.nextLine();
			System.out.println("Enter the control string :");
			s = in.nextLine();
			MarsRoverController mrc = new MarsRoverController(s,mr);
			test = test - 1;
		}
	}
}	