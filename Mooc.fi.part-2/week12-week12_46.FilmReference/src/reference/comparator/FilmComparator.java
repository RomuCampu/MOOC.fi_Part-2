

package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import reference.domain.Film;
import reference.domain.Rating;

public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> list;
    
    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.list = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        
        double rateo1 = 0;
        double rateo2 = 0;
        
        for(Rating r : list.get(o1)) {
            rateo1 += r.getValue();
        }
        rateo1 /= list.size();
        
        rateo1 = (int) rateo1;
        
        for(Rating r : list.get(o2)) {
            rateo2 += r.getValue();
        }
        rateo2 /= list.size();
        
        rateo2 = (int) rateo2;
        
        if(rateo1 > rateo2) {
            return -1;
        } else if(rateo2 > rateo1) {
            return 1;
        } else {
            return 0;
        }
    }
}
