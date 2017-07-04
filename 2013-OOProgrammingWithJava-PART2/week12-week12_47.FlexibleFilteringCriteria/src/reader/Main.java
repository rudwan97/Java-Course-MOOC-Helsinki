package reader;

import reader.criteria.Criterion;
import reader.criteria.ContainsWord;
import reader.criteria.EndsWithQuestionOrExclamationMark;

public class Main {

    public static void main(String[] args) {
        String address = "http://www.gutenberg.org/files/2554/2554-8.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion = new EndsWithQuestionOrExclamationMark();

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
    }
}
