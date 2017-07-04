/**
 * Created by Jeannette on 15/05/2017.
 */
public class StringUtils {

    public static boolean included(String word, String searched) {
        word = word.toUpperCase();
        searched = searched.toUpperCase();
        searched = searched.trim();
        if (word.contains(searched)) {
            return true;
        }
        return false;
    }
}
