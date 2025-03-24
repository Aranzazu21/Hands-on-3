import java.util.ArrayList;
import java.util.List;

public class HillClimbing {

    public static List<String> hillClimb(MazeState start, MazeState goal) {
        List<String> path = new ArrayList<>();
        MazeState currentState = start;


        while (currentState != goal) {
            MazeState nextState = getBestNeighbor(currentState);


            if (nextState == null) {
                System.out.println("NO SE ENCONTRO EL CAMINO CORRECTO ");
                break;
            }

            path.add(currentState.getId());
            currentState = nextState;
        }

        path.add(currentState.getId());
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
