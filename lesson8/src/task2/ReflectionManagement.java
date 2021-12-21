package task2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionManagement {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class containerClass = TextContainer.class;
        Object containerObject = new TextContainer();

        Method saverMethod = containerClass.getMethod("save", String.class);
        Annotation saveToAnnotation = containerClass.getAnnotation(SaveTo.class);

        String path = null;
        if(saveToAnnotation instanceof SaveTo){
            path = ((SaveTo) saveToAnnotation).path();
        }

        saverMethod.invoke(containerObject, path);
    }
}
