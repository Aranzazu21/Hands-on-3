public class Agent {
    private final SearchAlgorithm<State> algorithm;
    private final State initialState;

    public Agent(SearchAlgorithm<State> algorithm, State initialState) {
        this.algorithm = algorithm;
        this.initialState = initialState;
    }

    public void solve() {
        algorithm.search(initialState);
    }
}
