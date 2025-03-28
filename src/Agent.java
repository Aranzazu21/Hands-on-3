import java.util.List;

public class Agent {
    private final SearchAlgorithm<State> algorithm;
    private final State initialState;

    public Agent(SearchAlgorithm<State> algorithm, State initialState) {
        this.algorithm = algorithm;
        this.initialState = initialState;
    }

    public void solve() {
        List<State> path = algorithm.search(initialState);
        System.out.println("CAMINO ENCONTRADO:");
        path.forEach(state -> System.out.print(state.getId() + " -> "));
        System.out.println("FIN");
    }
}
