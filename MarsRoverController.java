import java.lang.*;
public class MarsRoverController
{
	char command;
	String instruction;
	MarsRover rover;
	MarsRoverController(int xCoordinate,int yCoordinate,char direction,Area area,String instr)
	{
		instruction = instr;
		rover = new MarsRover(xCoordinate,yCoordinate,direction,area); //initialise the rover
		issueCommand();
	}
	public void issueCommand()
	{
		int i;
		for(i=0;i< instruction.length();i++)
		{
			command = instruction.charAt(i);
			rover.parse(command);
			if(rover.isValidPosition())
				 rover.displayCurrentPosition();
			else
			{ 
				System.out.println("Invalid Move!! Operation Halt!!");
				break;
			}
		}

	}
}