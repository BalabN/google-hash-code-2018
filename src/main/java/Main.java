import java.util.Collections;
import java.util.List;

import models.Car;
import models.Ride;
import models.World;
import service.ParseInput;

public class Main {



    public static void main(String[] args) throws Exception {


        if (args.length < 1) {
            throw new Exception("Invalid number of input args");
        }
        String fileName = args[0];
        World world = ParseInput.parseInput(fileName);

        for (int i = 0; i < world.getSteps(); i++) {
            for (Car car : world.getCars()) {
                car.calculateCoefficient(world.getRides(), i);
            }

//            int minK = world.getCars().stream().mapto(Car::getK).min();


            for (Car car : world.getCars()) {
                car.nextStep();
            }
        }

        world.printResult();
    }
}
