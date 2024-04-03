import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        StringBuilder pathDescription = new StringBuilder();
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            pathDescription.append(line).append("\n");
        }

        int[] treasureCoordinates = findTreasureCoordinates(pathDescription.toString());
        System.out.println(treasureCoordinates[0] + " " + treasureCoordinates[1]);
    }

    private static int[] findTreasureCoordinates(String pathDescription) {
        int x = 0, y = 0;
        String[] steps = pathDescription.split("\n");

        for (String step : steps) {
            String[] parts = step.split(" ");
            if (parts.length == 2) {
                String direction = parts[0];
                int n = Integer.parseInt(parts[1]);
                switch (direction) {
                    case "North":
                        y += n;
                        break;
                    case "South":
                        y -= n;
                        break;
                    case "East":
                        x += n;
                        break;
                    case "West":
                        x -= n;
                        break;
                }
            }
        }
        return new int[]{x, y};
    }
}
