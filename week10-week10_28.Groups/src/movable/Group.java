package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private List<Movable> list;

    public Group() {
        list = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable) {
        
        if(!list.contains(movable)) {
            list.add(movable);
        }
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable m : list) {
            m.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Movable m : list) {
            result += m.toString();
            result += "\n";
        }
        return result;
    }
}
