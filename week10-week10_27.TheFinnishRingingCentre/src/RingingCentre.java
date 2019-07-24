
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RingingCentre {
    
    private Map<Bird, List<String>> birdList;
    
    public RingingCentre() {
        birdList = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place) {
        
        List<String> birdPlace = new ArrayList<String>();
        
        if(!birdList.containsKey(bird)) {
            birdPlace.add(place);
            birdList.put(bird, birdPlace);
        } else {
            birdPlace = birdList.get(bird);
            birdPlace.add(place);
            birdList.put(bird, birdPlace);
        }
    }
    
    public void observations(Bird bird) {
        
        if(birdList.get(bird) == null) {
            System.out.println(bird.toString() + " observations: " + 0);
            System.out.println("");
        } else {
            System.out.println(bird.toString() + " observations: " + birdList.get(bird).size());
            System.out.println(birdList.get(bird));
        }
    }
}
