import java.util.LinkedList;

public class LinkedListOfPeople {
    private LinkedList<Person> ListOfPersons = new LinkedList<>();

    public void add(Person p) {
        ListOfPersons.addLast(p);
    }

    public void remove(Person person){
        for (Person p : ListOfPersons) {
            if(p.equals(person)){
                ListOfPersons.remove(p);
                break;
            }
        }
    }

    public int size(){
        int counter = 0;
        for (Person p : ListOfPersons) {
            counter++;
        }
        return counter;
    }

    public boolean contains(Person person){
        for (Person p : ListOfPersons) {
            if(p.equals(person))
                return true;
        }
        return false;
    }

    public void PrintNames(){
        for (Person p : ListOfPersons) {
            System.out.print(p.getName() + ", ");
        }
        System.out.println("");
    }

}
