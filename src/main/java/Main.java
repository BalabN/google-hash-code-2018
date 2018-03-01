import models.World;
import service.ParseInput;
import utlis.MathUtils;
import utlis.Pair;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            throw new Exception("Invalid number of input args");
        }
        String fileName = args[0];
        World world = ParseInput.parseInput(fileName);


        for (int i = 0; i < world.getSteps(); i++) {
            for (int j = 0; j < world.getCars().size(); j++) {
                for (int k = 0; k < world.getRides().size(); k++) {
                    MathUtils.getManhattanDistance(new Pair<>(1, 2),new Pair<>(2, 1));
                }
            }
        }
    }

}
