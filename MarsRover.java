
public class MarsRover {
    char position;
    int x, y;
    Area area;

    MarsRover(int a, int b, char h, Area area) {
        x = a;
        y = b;
        position = h;
        this.area = area;
    }

    public void parse(char command) {
        if (command == 'M') {
            switch (position) {
                case 'N':
                    y = y + 1;
                    break;
                case 'S':
                    y = y - 1;
                    break;
                case 'E':
                    x = x + 1;
                    break;
                case 'W':
                    x = x - 1;
                    break;
                default:
                    break;
            }
        } else if (command == 'L') {
            switch (position) {
                case 'N':
                    position = 'W';
                    break;
                case 'W':
                    position = 'S';
                    break;
                case 'S':
                    position = 'E';
                    break;
                case 'E':
                    position = 'N';
                    break;
                default:
                    break;
            }
        } else if (command == 'R') {
            switch (position) {
                case 'N':
                    position = 'E';
                    break;
                case 'E':
                    position = 'S';
                    break;
                case 'S':
                    position = 'W';
                    break;
                case 'W':
                    position = 'N';
                    break;
                default:
                    break;
            }
        }
        if (x < 0 || x > area.upper_x || y < 0 || y > area.upper_y) {
            System.out.println("Invalid Move");
        } else {
            System.out.println("The position of the Rover: " + x + " ," + y + " " + position);
        }
    }
}