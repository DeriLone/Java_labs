import java.util.ArrayList;

public class ArrayListOfPersons {
    public ArrayList<Person> ListOfPersons = new ArrayList<>();

    public void add(Person p){
        ListOfPersons.add(p);
    }

    public void add(int index, Person p){
        ListOfPersons.add(ListOfPersons.get(size() - 1));
        for (int i = size(); i == index - 1; i--) {
            ListOfPersons.set(i, ListOfPersons.get(i - 1));
        }
        ListOfPersons.set(index, p);
        //ListOfPersons.add(index, p);
    }

    public void remove(Person p){
        ListOfPersons.remove(p);
    }

    public Person remove(int index){
        Person DeletedPerson = ListOfPersons.get(index);
        ListOfPersons.remove(index);
        return DeletedPerson;
    }

    public int size(){
        int counter = 0;
        for (Person p : ListOfPersons) {
            counter++;
        }
        return counter - 1;
    }

    public boolean contains(Person p){
        for (Person i : ListOfPersons) {
            if (p.equals(i)){
                return true;
            }
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
