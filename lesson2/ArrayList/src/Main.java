public class Main {
    public static void main(String[] args) {

        ArrayListOfPersons list = new ArrayListOfPersons();

        Person p1 = new Person("Andrey");
        list.add(p1);
        Person p2 = new Person("Denial");
        list.add(p2);
        Person p3 = new Person("Jo");
        list.add(p3);

        list.PrintNames();
        Person p4 = new Person("Bill");
        list.add(1, p4);

        list.PrintNames();

        System.out.println(list.size());
        list.remove(p2);
        list.remove(1);
        System.out.println(list.contains(p2));
        System.out.println(list.size());

        list.PrintNames();


    }
}
