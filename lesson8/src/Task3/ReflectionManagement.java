package Task3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionManagement {
    public static void main(String[] args) {
        Object person = new Person();
        Class personClass = person.getClass();
        Class serializationClass = Serializable.class;

        Field[] fields = personClass.getFields();
        List<Field> fieldsToSave = new ArrayList<>();
        for (Field f : fields) {
            if(f.getAnnotation(Save.class) != null){
                fieldsToSave.add(f);
            }
        }

        serialization();
        deserialization();

    }

    public static void serialization () {

    }

    public static void deserialization () {
    }
}
