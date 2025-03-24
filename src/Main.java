import java.util.List;
public class Main {
    public static void main(String[] args) {
        Maze maze = new Maze(4, 4);
        maze.configure();

        System.out.println("=== HILL CLIMBING MAZE ===");
        maze.display();

        HillClimbing search = new HillClimbing();
        List<String> path = search.hillClimb(maze.getInitialState(), maze.getObjectives().get(0));

        // Mostrar la trayectoria
        System.out.println("\nTRAYECTORIA DESDE 0 (0,0):");
        System.out.println("Path found (" + path.size() + " steps):");
        for (String step : path) {
            System.out.print(step + " -> ");
        }
        System.out.println("END");
    }
}
