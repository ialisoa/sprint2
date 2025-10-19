package mg.teste;

import java.lang.reflect.Method;

import mg.framework.annotations.HandleURL;

public class Main {
    public static void main(String[] args) {
        Class<?> clazz = Test.class;
        for (Method m : clazz.getDeclaredMethods()) {
            if (m.isAnnotationPresent(HandleURL.class)) {
                HandleURL ann = m.getAnnotation(HandleURL.class);
                System.out.println(ann.value());
            }
        }
    }
}