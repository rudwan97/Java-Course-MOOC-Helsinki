package reference;

import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        RatingRegister rek = new RatingRegister();
        Person h1 = new Person("Pekka");
        Person h2 = new Person("Arto");
        rek.addRating(h1, new Film("Pulp fiction"), Rating.FINE);
        rek.addRating(h1, new Film("Eraserhead"), Rating.GOOD);
        rek.addRating(h2, new Film("Eraserhead"), Rating.BAD);
        rek.addRating(h2, new Film("Pulp fiction"), Rating.NEUTRAL);
        rek.addRating(h2, new Film("Rambo"), Rating.GOOD);
        Map<Film,Rating> ratings = rek.getPersonalRatings(new Person("Jukka"));
    }
}
