package reference;

import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Reference {
    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {
        Map<Film, List<Rating>> filmRatings = ratingRegister.filmRatings();
        List<Film> listOfExistingFilms = new ArrayList<>();

        listOfExistingFilms.addAll(filmRatings.keySet());
        Collections.sort(listOfExistingFilms, new FilmComparator(filmRatings));

        if (!ratingRegister.reviewers().contains(person)) {
            if (ratingRegister.getHighestRatingForFilm(listOfExistingFilms.get(0)) > 0) {
                return listOfExistingFilms.get(0);
            } else {
                return null;
            }

        }
        if (listOfExistingFilms.isEmpty()) {
            return null;
        }

        Film recommendedFilm = new Film("");
        int bestMatch = 0;

        for (Person person1 : ratingRegister.reviewers()) {
            int matchTotal = 0;
            int highestRating = -5;
            Film highestRatedFilm = new Film("");

            for (Film film : ratingRegister.getPersonsFilms(person1)) {
                if (!person.equals(person1) && ratingRegister.getPersonsFilms(person).contains(film)) {
                    matchTotal += (ratingRegister.getRating(person, film).getValue()
                            * ratingRegister.getRating(person1, film).getValue());
                }
                if (ratingRegister.getRating(person1, film).getValue() > highestRating
                        && !ratingRegister.getPersonsFilms(person).contains(film)) {
                    highestRatedFilm = film;
                }
            }
            if (matchTotal > bestMatch) {
                bestMatch = matchTotal;
                recommendedFilm = highestRatedFilm;
            }
        }
        if (listOfExistingFilms.size() == ratingRegister.getPersonsFilms(person).size()){
            return null;
        }
        return recommendedFilm;
    }


}
