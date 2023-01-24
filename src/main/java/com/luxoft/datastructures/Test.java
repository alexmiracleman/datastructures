package com.luxoft.datastructures;

import com.luxoft.datastructures.list.ArrayList;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Period;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = Person.class;

//        Field[] fields = clazz.getFields();
//        for (Field field : fields) {
//            System.out.println(field.getGenericType());
//            System.out.println(field);
//        }

        }
////        get all nonpublic method
//        Method printNameMethod = clazz.getDeclaredMethod("printName");
////        System.out.println(printNameMethod);
//        Method printAgeMethod = clazz.getDeclaredMethod("printAge");
////        System.out.println(printAgeMethod);
//        Method noParameters = clazz.getDeclaredMethod("");
////
//        Person alex = new Person();
//        alex.name = "Alex";
//        alex.age = 35;
//        printNameMethod.invoke(alex);
//        printAgeMethod.invoke(alex);
//        noParameters.invoke(alex);



//        ArrayList arrayList = new ArrayList();
//        Class clazz = arrayList.getClass();
//        for (Field declaredField : clazz.getDeclaredFields()) {
//            System.out.println(declaredField);
//            if (declaredField.getName().equals("size2")) {
//                declaredField.setAccessible(true);
//                declaredField.set(arrayList, -100_00);
            }
//        }

//        System.out.println(arrayList.getSize2());

//
//
//}
//    static void print(int prefix, String... array){
//        for (String s : array) {
//            System.out.println(prefix + s);
//
//        }
//    }


class Person {
    String name;
    String lastName;
    double salary;
    int age;

    public void printName(){
        System.out.println("My name is " + name);
        }

    public void printName(int count){
        for (int i = 0; i < count; i++) {
            System.out.println("My name іs" + name);
        }

    }
    public void printAge(){
        System.out.println("My age is " + age);
    }

    public String  getName() {
        return name;
    }
    public String  getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }


}
