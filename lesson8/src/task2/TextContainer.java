package task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

@SaveTo()
public class TextContainer {
    public String str = "sentence";

    @Saver
    public void save(String path) throws IOException {
        try {
            Path file = Paths.get(path);
            Files.write(file, Collections.singleton(str));
            System.out.println("done");
        } catch (NoSuchFileException nse) {
            System.out.println("There is a problem - NoSuchFileException");
        }

    }
}
