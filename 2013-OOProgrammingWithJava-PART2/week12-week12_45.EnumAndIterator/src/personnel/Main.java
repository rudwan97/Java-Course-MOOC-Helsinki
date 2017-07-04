package personnel;

public class Main {

    public static void main(String[] args) {
        Employees university = new Employees();

        university.add(new Person("Arto", Education.D));

        university.print();

        university.fire(Education.D);

        System.out.println("==");

        university.print();
    }
}
