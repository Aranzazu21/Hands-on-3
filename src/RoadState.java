import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoadState implements State {
    private final String id;
    private final boolean isGoal;
    private final Map<State, Double> neighbors;
    private final double heuristic;

    public RoadState(String id, boolean isGoal, double heuristic) {
        this.id = id;
        this.isGoal = isGoal;
        this.neighbors = new HashMap<>();
        this.heuristic = heuristic;
    }

    @Override
    public void addNeighbor(State neighbor, double cost) {
        neighbors.put(neighbor, cost);
    }

    @Override
    public List<State> getNeighbors() {
        return new ArrayList<>(neighbors.keySet());
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
