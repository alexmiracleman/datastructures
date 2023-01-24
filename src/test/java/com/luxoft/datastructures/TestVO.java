package com.luxoft.datastructures;

public class TestVO {
    boolean isCreatedWithDefaultConstructor;
    boolean isCreatedWithIntConstructor;

    public TestVO () {
        isCreatedWithDefaultConstructor = true;
    }
    public TestVO (int value) {
        isCreatedWithIntConstructor = true;
    }
}
