import models.World;
import service.ParseInput;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            throw new Exception("Invalid number of input args");
        }
        String fileName = args[0];
        World world = ParseInput.parseInput(fileName);
    }
}
