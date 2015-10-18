public class MarsRover 
{
	public char heading;
	public Position position;
	public Area area;
	public Parser parser;
	
	MarsRover(int xCoordinate,int yCoordinate,char direction,Area area)
	{
		position = new Position();
		position.setX(xCoordinate);
		position.setY(yCoordinate);
		heading = direction;
		parser = new Parser(this);
		this.area = area;
	}

	public boolean isValidPosition()
	{
		if( position.getX() < 0 || position.getX() > area.upper_x || position.getY() < 0 || position.getY() > area.upper_y )
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public void displayCurrentPosition()
	{
		System.out.println("(x,y) : " + "(" + position.getX() + "," + position.getY() + ")" + "facing : " + heading );
	}
	
	public void parse(char command)
	{
		switch(command)
		{
				case 'L': parser.turnLeft();
						  break;
				case 'M': parser.moveAhead();
						  break;
				case 'R': parser.turnRight();
						  break;
				default:  break;
		}
	}
	
}
