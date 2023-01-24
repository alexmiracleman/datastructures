package com.luxoft.datastructures;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ReflectionHW {
    static Object create(Class clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor constructor = clazz.getConstructor();
        Object result = constructor.newInstance();
        return result;
    }
}
