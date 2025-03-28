import java.util.ArrayList;
import java.util.List;

public class HillClimbing {

    public static List<MazeState> hillClimb(MazeState start, MazeState goal, Maze maze) {
        List<MazeState> path = new ArrayList<>();
        MazeState currentState = start;

        while (!currentState.equals(goal)) {
            maze.display(currentState);
            MazeState nextState = getBestNeighbor(currentState);

            if (nextState == null) {
                System.out.println("NO SE ENCONTRÓ EL CAMINO CORRECTO");
                break;
            }

            path.add(currentState);
            currentState = nextState;
        }

        path.add(currentState);
        maze.display(currentState);
        return path;
    }

    private static MazeState getBestNeighbor(MazeState state) {
        List<State> neighbors = state.getNeighbors();
        MazeState bestNeighbor = null;
        double bestHeuristic = Double.MAX_VALUE;

        for (State neighbor : neighbors) {
            MazeState mazeNeighbor = (MazeState) neighbor;
            if (mazeNeighbor.getHeuristic() < bestHeuristic) {
                bestHeuristic = mazeNeighbor.getHeuristic();
                bestNeighbor = mazeNeighbor;
            }
        }

        return bestNeighbor;
    }
}
