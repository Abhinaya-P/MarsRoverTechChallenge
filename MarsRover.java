
public class MarsRover
{
	char heading;
	int x,y;
	Area area;
	MarsRover(int a,int b,char h,Area ar)
	{
		x=a;
		y=b;
		heading=h;
		area = ar;
	}
	
	public void parse(char command)
	{
		
		if(command == 'M')
		{
			switch(heading)
			{
				case 'N' : y = y + 1; break;
				case 'S': y = y - 1; break;
				case 'E': x = x + 1; break;
				case 'W': x = x - 1; break;
				default:  break;
			}
		}
		else if(command == 'L')
		{
			switch(heading)
			{
				case 'N': heading = 'W'; break;
				case 'W': heading = 'S'; break;
				case 'S': heading = 'E'; break;
				case 'E': heading = 'N'; break;
				default: break;
			}
		}
		else if(command == 'R')
		{
			switch(heading)
			{
				case 'N': heading = 'E'; break;
				case 'E': heading = 'S'; break;
				case 'S': heading = 'W'; break;
				case 'W': heading = 'N'; break;
				default: break;
			}
		}
		if(x < 0 || x > area.upper_x || y < 0 || y > area.upper_y)
		{
			System.out.println("Invalid Move");
		}
		else{
					System.out.println("The  position of the Rover: " + x + " ," + y + " " + heading);
		}
	}
}