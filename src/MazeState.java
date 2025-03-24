import java.util.ArrayList;
import java.util.List;

public class MazeState implements State {
    private final String id;
    private final int row;
    private final int col;
    private final boolean isGoal;
    private final double heuristic;
    private final List<State> neighbors;


    public MazeState(String id, int row, int col, boolean isGoal, double heuristic) {
        this.id = id;
        this.row = row;
        this.col = col;
        this.isGoal = isGoal;
        this.heuristic = heuristic;
        this.neighbors = new ArrayList<>();
    }

    @Override
    public void addNeighbor(State neighbor, double cost) {
        neighbors.add(neighbor);
    }

    @Override
    public List<State> getNeighbors() {
        return neighbors;
    }

    @Override
    public boolean isGoal() {
        return isGoal;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public double getHeuristic() {
        return heuristic;
    }
}
