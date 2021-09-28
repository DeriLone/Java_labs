import java.io.*;

public class Main {
    public static void main(String[] args) {
        serializable();
        Person p1 = deserialize();

        System.out.println(p1);
    }

    private static void serializable(){
        try {
            Person person = new Person("Jim", 33);

            OutputStream outputStream = new FileOutputStream("test.txt");
            ObjectOutputStream os = new ObjectOutputStream(outputStream);

            os.writeObject(person);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Person deserialize() {
        Person person = null;
        try {
            InputStream inputStream = new FileInputStream("test.txt");
            ObjectInputStream os = new ObjectInputStream(inputStream);

            person = (Person) os.readObject();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }
}
