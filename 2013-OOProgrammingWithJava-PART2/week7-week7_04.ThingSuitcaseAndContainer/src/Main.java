
public class Main {

    public static void main(String[] args) {

        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int brickWeight = 1;
        int i = 0;
        while (i < 100) {
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(new Thing("brick", brickWeight));
            container.addSuitcase(suitcase);
            brickWeight++;
            i++;
        }

    }

}
