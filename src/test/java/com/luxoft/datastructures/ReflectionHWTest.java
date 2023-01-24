package com.luxoft.datastructures;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class ReflectionHWTest {
    @Test
    public void testCreateObjectOnDefaultConstructor() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Object obj = ReflectionHW.create(TestVO.class);

        assertNotNull(obj);
        assertEquals(TestVO.class, obj.getClass());
        TestVO testVO = (TestVO) obj;
        assertTrue(testVO.isCreatedWithDefaultConstructor);
        assertFalse(testVO.isCreatedWithIntConstructor);
    }

}