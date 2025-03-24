import java.util.ArrayList;
import java.util.List;

public class RoadMap extends Environment {
    private List<RoadState> states;

    public RoadMap() {
        states = new ArrayList<>();
    }

    @Override
    public void configure() {

        RoadState cityA = new RoadState("A", false, 10);
        RoadState cityB = new RoadState("B", false, 5);
        RoadState cityGoal = new RoadState("META", true, 0);

        cityA.addNeighbor(cityB, 7.0);
        cityB.addNeighbor(cityGoal, 3.0);

        states.add(cityA);
        states.add(cityB);
        states.add(cityGoal);
    }

    @Override
    public void display() {
        System.out.println("MAPA DE CARRERAS");
        states.forEach(state -> System.out.println(state.getId()));
    }

    public List<RoadState> getStates() {
        return states;
    }
}
