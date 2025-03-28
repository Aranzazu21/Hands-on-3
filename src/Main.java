import java.util.List;

public class Main {
    public static void main(String[] args) {
        Maze maze = new Maze(4, 4);
        maze.configure();

        System.out.println("___________HILL CLIMBING MAZE___________");
        maze.display();

        HillClimbing search = new HillClimbing();
        List<MazeState> path = search.hillClimb(maze.getInitialState(), maze.getObjectives().get(0), maze);

        System.out.println("\nTRAYECTORIA DESDE (0,0):");
        for (MazeState step : path) {
            System.out.print(step.getId() + " -> ");
        }
        System.out.println("FIN");
    }
}
