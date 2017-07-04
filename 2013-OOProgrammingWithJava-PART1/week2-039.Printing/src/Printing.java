public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int iteratorStars = 1;
        while (iteratorStars <= amount) {
            System.out.print("*");
            iteratorStars++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int iteratorSquare = 1;
        while (iteratorSquare <= sideSize) {
            printStars(sideSize);

            iteratorSquare++;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int iteratorRec = 1;
        while (iteratorRec <= height) {
            printStars(width);

            iteratorRec++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int iteratorTri = 1;
        while (iteratorTri <= size) {
            printStars(iteratorTri);

            iteratorTri++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
