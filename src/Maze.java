import java.util.ArrayList;
import java.util.List;

public class Maze extends Environment {
    private MazeState[][] cells;
    private MazeState initialState;
    private List<MazeState> objectives;

    public Maze(int rows, int cols) {
        cells = new MazeState[rows][cols];
    }

    @Override
    public void configure() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                boolean goal = (i == 3 && j == 3);
                double heuristic = 6 - (i + j);
                cells[i][j] = new MazeState("(" + i + "," + j + ")", i, j, goal, heuristic);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > 0) cells[i][j].addNeighbor(cells[i - 1][j]);
                if (j > 0) cells[i][j].addNeighbor(cells[i][j - 1]);
                if (i < 3) cells[i][j].addNeighbor(cells[i + 1][j]);
                if (j < 3) cells[i][j].addNeighbor(cells[i][j + 1]);
            }
        }

        initialState = cells[0][0];
        objectives = new ArrayList<>();
        objectives.add(cells[3][3]);
    }

    @Override
    public void display() {
        display(null);
    }

    public void display(MazeState currentState) {
        System.out.println("\nLABERINTO 4X4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (currentState != null && cells[i][j].equals(currentState)) {
                    System.out.print("[X] ");
                } else {
                    String cell = cells[i][j].isGoal() ? "[G]" : "[ ]";
                    System.out.print(cell + " ");
                }
            }
            System.out.println();
        }
    }

    public MazeState getInitialState() {
        return initialState;
    }

    public List<MazeState> getObjectives() {
        return objectives;
    }
}
