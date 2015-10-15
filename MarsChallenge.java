import java.util.Scanner;

public class MarsChallenge {
    public static void main(String args[]) {
        int xCoordinate, y;
        int numberOfCase;
        String instruction = null;
        char h;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        numberOfCase = in.nextInt();
        while (numberOfCase > 0) {
            System.out.println("Enter the upper right coordinates of the plateau:");
            xCoordinate = in.nextInt();
            y = in.nextInt();
            Area area = new Area();
            area.set(xCoordinate, y);
            System.out.println("Enter the position and direction of the rover: ");
            xCoordinate = in.nextInt();
            y = in.nextInt();
            h = in.next().charAt(0);
            MarsRover marsRover = new MarsRover(xCoordinate, y, h, area);
            in.nextLine();
            System.out.println("Enter the control string :");
            instruction = in.nextLine();
            new MarsRoverController(instruction, marsRover);
            numberOfCase = numberOfCase - 1;
        }
    }
}