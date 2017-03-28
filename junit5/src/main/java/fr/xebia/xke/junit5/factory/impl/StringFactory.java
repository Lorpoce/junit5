package fr.xebia.xke.junit5.factory.impl;

import fr.xebia.xke.junit5.factory.Factory;

public class StringFactory implements Factory<String> {

    @Override
    public String createValue() {
        return "foo";
    }
}
