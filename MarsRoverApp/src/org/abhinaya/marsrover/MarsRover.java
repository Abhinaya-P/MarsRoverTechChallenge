package org.abhinaya.marsrover;

public class MarsRover {
		public char heading;
		public Position position;
		public Area area;
		public Parser parser;
		
		public MarsRover(int xCoordinate,int yCoordinate,char direction,Area area)
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
		public String getCurrentPosition()
		{
		 return String.format("(%d, %d) %c",position.getX(),position.getY(),heading);	
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
