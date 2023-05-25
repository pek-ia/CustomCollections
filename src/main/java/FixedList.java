import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixedList<T extends Comparable<T>> {

    private int max;

    private List<T> itemsList = new ArrayList<T>();


    public FixedList(int maxItems){
        this.max = maxItems;
    }


    public boolean add(T t) {
        if (itemsList.size() < max) {
            itemsList.add(t);
            Collections.sort(itemsList);
            return true;
        }
        else {
            throw new RuntimeException("You added too many items");
        }
    }

    public List<T> getItemsList(){
        return itemsList;
    }
}
