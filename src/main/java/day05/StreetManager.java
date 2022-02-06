package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class StreetManager {

    Map<String, List<Integer>> street = new TreeMap<>();

    public Map<String, List<Integer>> getStreet() {
        return Map.copyOf(street);
    }

    public void readFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                mapStreets(line);
            }
        } catch (IOException ioException) {
            throw new IllegalArgumentException("File can not be read!");
        }
    }

    private void mapStreets(String line) {
        String streetName = line.split(" ")[0];
        int bit = Integer.parseInt(String.valueOf(line.split(" ")[1]));
        if (street.containsKey(streetName)) {
            List<Integer> tempValue = street.get(streetName);
            tempValue.add(getNextNumber(tempValue, bit));
            street.put(streetName, tempValue);
        } else {
            street.put(streetName, initSoldLocations(bit));
        }
    }

    private int getNextNumber(List<Integer> inputNumbers, int bit) {
        if (bit == 0) {
            return (int) inputNumbers.stream().filter(n -> n%2 == 0).count() * 2 + 2;
        } else if (bit == 1) {
            return (int) inputNumbers.stream().filter(n -> n%2 != 0).count() * 2 + 1;
        } else {
            throw new IllegalArgumentException("Bit must be 0(even) or 1(odd).");
        }
    }

    private List<Integer> initSoldLocations(int bit) {
        List<Integer> init = new ArrayList<>();
        if (bit == 0) {
            init.add(2);
        } else {
            init.add(1);
        }
        return init;
    }
}
