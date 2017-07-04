public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int iteratorStars = 1;
        while (iteratorStars <= amount) {
            System.out.print("*");
            iteratorStars++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int iteratorSpaces = 1;
        while (iteratorSpaces <= amount) {
            System.out.print(" ");
            iteratorSpaces++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int iteratorTri = 1;
        while (iteratorTri <= size) {
            printWhitespaces(size - iteratorTri);
            printStars(iteratorTri);
            iteratorTri++;
        }

    }

    public static void xmasTree(int height) {
        // 40.3
        int layer = 1;
        int base = 1;

        while (layer <= height) {
            printWhitespaces(height - layer);
            printStars(layer + (layer-1));
            layer++;
        }

        while (base <= 2) {
            printWhitespaces(height - 2);
            printStars(3);
            base++;
        }




    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
