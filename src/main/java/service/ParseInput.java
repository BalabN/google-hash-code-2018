package service;

import models.Car;
import models.Ride;
import models.World;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParseInput {

    public static World parseInput(String inputFileName) throws IOException{
        System.out.println("Reading file " + inputFileName);
        List<String> content = new ArrayList<String>();
        Stream<String> stream = Files.lines(Paths.get(inputFileName));
        content = stream.collect(Collectors.toList());
        String[] firstLine = content.get(0).split(" ");
        int rows = Integer.parseInt(firstLine[0]);
        int cols = Integer.parseInt(firstLine[1]);
        int cars = Integer.parseInt(firstLine[2]);
        int rides = Integer.parseInt(firstLine[3]);
        int bonus = Integer.parseInt(firstLine[4]);
        int steps = Integer.parseInt(firstLine[5]);

        return new World(rows, cols, new ArrayList<Car>(), new ArrayList<Ride>(), bonus, steps);
    }
}
