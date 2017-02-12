package fr.xebia.junit5.interfacedefault.impl;

import fr.xebia.junit5.interfacedefault.PojoTest;

public class StringTest implements PojoTest<String> {

    @Override
    public String createPojo() {
        return "Xebia";
    }

    @Override
    public String createAnOther() {
        return "String";
    }
}
