package org.abhinaya.marsrover;

public class Parser {
	MarsRover rover;
	public final char north = 'N';
	public final char south = 'S';
	public final char east = 'E';
	public final char west = 'W';
	Parser(MarsRover rover)
	{
		this.rover = rover;
	}
	public void turnLeft()
	{
		switch(rover.heading)
		{
			case north:
				 rover.heading = 'W';
				 break;
			case south:
				 rover.heading = 'E';
				 break;
			case east:
				 rover.heading = 'N';
				 break;
			case west:
				 rover.heading = 'S';
				 break;
			default:
				 break;
		}
	}
	
	public void turnRight()
	{
		switch(rover.heading)
		{
			case north:
				 rover.heading = 'E';
				 break;
			case south:
				 rover.heading = 'W';
				 break;
			case east:
				 rover.heading = 'S';
				 break;
			case west:
				 rover.heading = 'N';
				 break;
			default:
				 break;
		}
	}
	public void moveAhead()
	{
		switch(rover.heading)
		{
			case north:
				 rover.position.setY(rover.position.getY() + 1);
				 break;
			case south:
				 rover.position.setY(rover.position.getY() - 1);
				 break;
			case east:
				 rover.position.setX(rover.position.getX() + 1);
				 break;
			case west:
				 rover.position.setX(rover.position.getX() - 1);
				 break;
			default:
				 break;
		}
	}
}
