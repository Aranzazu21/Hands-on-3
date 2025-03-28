import java.util.List;

public abstract class State {
    private String id;

    public State(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract List<State> getNeighbors();
    public abstract boolean isGoal();
    public abstract double getHeuristic();
}
