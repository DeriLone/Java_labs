package Task3;

import java.io.*;

public class Serializable {
    public static void toSerialize () throws IOException {
        OutputStream outputStream = new FileOutputStream("test.txt");
        ObjectOutputStream os = new ObjectOutputStream(outputStream);

        os.writeObject();
    }
}
