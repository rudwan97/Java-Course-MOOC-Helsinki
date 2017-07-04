public class Main {
    public static void main(String[] args) {
        // test your code here

        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);

        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));

        System.out.println("Total goals: " + barcelona.goals());
    }
}
