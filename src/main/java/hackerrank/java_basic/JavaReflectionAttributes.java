package hackerrank.java_basic;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class JavaReflectionAttributes {

    public static void main(String[] args) {
        Class student = Student.class;
        Method[] methods = student.getMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
//            System.out.println(method.getDeclaringClass() + " -> " + method.getName());
            if (method.getDeclaringClass() == student)
                methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }

}