import java.util.List;


public abstract class SearchAlgorithm<T extends State> {
    public abstract List<T> search(T initial);
}
