package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingRegister {
    Map<Film, List<Rating>> filmRatings;
    Map<Person, Map<Film, Rating>> personRatings;

    public RatingRegister() {
        this.filmRatings = new HashMap<>();
        this.personRatings = new HashMap<>();
    }

    public void addRating(Film film, Rating rating) {
        if (filmRatings.containsKey(film)) {
            filmRatings.get(film).add(rating);
        } else {
            filmRatings.put(film, new ArrayList<>());
            filmRatings.get(film).add(rating);
        }
    }

    public Map<Person, Map<Film, Rating>> getPersonRatings() {
        return personRatings;
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!personRatings.containsKey(person)) {
            Map<Film, Rating> filmRating = new HashMap<>();
            personRatings.put(person,filmRating);
        }
        personRatings.get(person).put(film, rating);
        addRating(film, rating);
    }

    public List<Rating> getRatings(Film film) {
        return filmRatings.get(film);
    }

    public int getHighestRatingForFilm(Film film) {
        int highestRating = -5;
        for (Rating rating : getRatings(film)) {
            if (rating.getValue() > highestRating) {
                highestRating = rating.getValue();
            }
        }
        return highestRating;
    }

    public Rating getRating(Person person, Film film) {
        if (personRatings.get(person).containsKey(film)) {
            return personRatings.get(person).get(film);
        }
        return Rating.NOT_WATCHED;
    }

    public Map<Film, List<Rating>> filmRatings() {
        return filmRatings;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (!reviewers().contains(person)) {
            personRatings.put(person, new HashMap<>());
        }
        return personRatings.get(person);
    }

    public List<Person> reviewers() {
        List<Person> reviewers = new ArrayList<>();
        reviewers.addAll(personRatings.keySet());
        return reviewers;
    }

    public List<Film> getPersonsFilms(Person person) {
        List<Film> films = new ArrayList<>();
        if (!getPersonalRatings(person).isEmpty()) {
            films.addAll(getPersonalRatings(person).keySet());
        }
        return films;
    }
}
