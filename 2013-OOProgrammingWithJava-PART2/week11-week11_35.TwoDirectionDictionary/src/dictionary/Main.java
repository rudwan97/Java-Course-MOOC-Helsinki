package dictionary;

public class Main {
    public static void main(String[] args) {
        MindfulDictionary s = new MindfulDictionary("src/words.txt");
        s.load();
        s.remove("below");
        System.out.println(s.getDictionary().toString());
        s.add("tieokone", "computer");
        System.out.println(s.getDictionary().toString());
        s.save();
    }
}
