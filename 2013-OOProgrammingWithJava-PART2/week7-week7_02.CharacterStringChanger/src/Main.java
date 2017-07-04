public class Main {
    public static void main(String[] args) {
        Changer changeList = new Changer();
        changeList.addChange(new Change('a', 'b'));
        changeList.addChange(new Change('r', 'x'));

        changeList.change("carrot");

    }
}
