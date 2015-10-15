public class MarsRoverController {
    char command;
    String instruction;
    MarsRover marsRover;

    MarsRoverController(String instr, MarsRover rover) {
        instruction = instr;
        marsRover = rover;
        issueCommand();
    }

    public void issueCommand() {
        for (int i = 0; i < instruction.length(); i++) {
            command = instruction.charAt(i);
            marsRover.parse(command);
        }

    }
}