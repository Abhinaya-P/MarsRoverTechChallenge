import java.lang.*;
public class MarsRoverController
{
	char command;
	String instruction;
	MarsRover mr;
	MarsRoverController(String instr,MarsRover mars)
	{
		instruction = instr;
		mr = mars;
		issueCommand();
	}
	public void issueCommand()
	{
		int i;
		for(i=0;i< instruction.length();i++)
		{
			command = instruction.charAt(i);
			mr.parse(command);
		}

	}
}