package com.luxoft.datastructures;

import com.luxoft.datastructures.list.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class JUnit {
    public static void main(String[] args) throws Exception {
        runTests(ArrayListTest.class);
    }

    static void runTests (Class clazz) throws Exception {
        Constructor constructor = clazz.getConstructor();

        Object testInstance = constructor.newInstance();


        ArrayList testMethods = getTests(clazz);
        for (int i = 0; i < testMethods.size(); i++) {
            Method testMethod = (Method) testMethods.get(i);
            System.out.println("Running test: " + testMethod.getName());
            testMethod.invoke(testInstance);
            System.out.println("Test: " + testMethod.getName() + " success!");
        }
    }

    private static ArrayList getTests(Class clazz) {
        ArrayList methodsList = new ArrayList();
        for (Method method : clazz.getMethods()) {
            if(method.isAnnotationPresent(Test.class)) {
                methodsList.add(method);
            }
        }
        return methodsList;

    }

}
