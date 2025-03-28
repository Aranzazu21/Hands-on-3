import java.util.ArrayList;
import java.util.List;

public class MazeState extends State {
    private int row, col;
    private boolean isGoal;
    private double heuristic;
    private List<MazeState> neighbors;

    public MazeState(String id, int row, int col, boolean isGoal, double heuristic) {
        super(id);
        this.row = row;
        this.col = col;
        this.isGoal = isGoal;
        this.heuristic = heuristic;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(MazeState neighbor) {
        neighbors.add(neighbor);
    }

    @Override
    public List<State> getNeighbors() {
        return new ArrayList<>(neighbors);
    }

    @Override
    public boolean isGoal() {
        return isGoal;
    }

    @Override
    public double getHeuristic() {
        return heuristic;
    }
}
