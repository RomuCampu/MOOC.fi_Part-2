package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class RatingRegister {

    private Map<Film, List<Rating>> ratings;
    private Map<Person, Map<Film, Rating>> ratingRegister;

    public RatingRegister() {
        ratings = new HashMap<Film, List<Rating>>();
        ratingRegister = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!ratings.containsKey(film)) {
            ratings.put(film, new ArrayList<Rating>());
        }
        ratings.get(film).add(rating);
    }

    public List<Rating> getRatings(Film film) {
        return ratings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return ratings;
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!ratingRegister.containsKey(person)) {
            ratingRegister.put(person, new HashMap<Film, Rating>());
            ratingRegister.get(person).put(film, rating);
            addRating(film, rating);
        } else if(!ratingRegister.get(person).containsKey(film)){
            ratingRegister.get(person).put(film, rating);
            addRating(film, rating);
        }
    }

    public Rating getRating(Person person, Film film) {
        Rating r;
        if(!ratingRegister.containsKey(person)) {
            return Rating.NOT_WATCHED;
        } else if (!ratingRegister.get(person).containsKey(film)) {
            return Rating.NOT_WATCHED;
        }
        
        return ratingRegister.get(person).get(film);
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if(!ratingRegister.containsKey(person)) {
            return new HashMap();
        }
        
        return ratingRegister.get(person);
    }

    public List<Person> reviewers() {
        return new ArrayList<Person>(ratingRegister.keySet());
    }
}
