package task1;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionControl {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class cl = Addition.class;
        Object o1 = new Addition(); // newInstance?

        Method m = cl.getMethod("addit", int.class, int.class);

        Annotation a = m.getAnnotation(Adding.class);
        if(a instanceof Adding){
            m.invoke(o1, ((Adding) a).a(), ((Adding) a).b());
        }

    }
}
