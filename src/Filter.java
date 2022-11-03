import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public int getThreshold() {
        return threshold;
    }

    public List<Integer> filterOut(List<Integer> src) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int tmp : src) {
            if (tmp > threshold) {
                result.add(tmp);
                logger.log("Элемент " + tmp + " подходит");
            } else {
                logger.log("Элемент " + tmp + " не подходит");
            }
        }
        return result;
    }
}
