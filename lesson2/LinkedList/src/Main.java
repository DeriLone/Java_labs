public class Main {
    public static void main(String[] args) {

        LinkedListOfPeople list = new LinkedListOfPeople();

        Person p1 = new Person("Klaus");
        Person p2 = new Person("Carl");
        Person p3 = new Person("Bob");

        list.add(p1);
        list.add(p2);
        list.add(p3);

        list.PrintNames();
        System.out.println(list.size());

        list.remove(p2);

        list.PrintNames();
        System.out.println(list.size());

        System.out.println(list.contains(p3));
        System.out.println(list.contains(p2));
    }
}
