import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixedList<T extends Comparable<T>> {

    private int maxItems;

    private List<T> items = new ArrayList<T>();


    public FixedList(int maxItems){
        this.maxItems = maxItems;
    }


    public boolean add(T t) {
        if (items.size() < maxItems) {
            items.add(t);
            Collections.sort(items);
            return true;
        }
        else {
            throw new RuntimeException("You added too many items");
        }
    }

    public List<T> getItems(){
        return items;
    }
}
