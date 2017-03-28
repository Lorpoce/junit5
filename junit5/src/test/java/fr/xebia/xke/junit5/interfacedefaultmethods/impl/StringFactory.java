package fr.xebia.xke.junit5.interfacedefaultmethods.impl;

import fr.xebia.xke.junit5.interfacedefaultmethods.FactoryEqualsTest;
import fr.xebia.xke.junit5.interfacedefaultmethods.FactoryComparableTest;

class StringFactory implements FactoryComparableTest<String>, FactoryEqualsTest<String> {

    @Override
    public String createValue() {
        return "foo";
    }

    @Override
    public String createSmallerValue() {
        return "bar"; // 'b' < 'f' in "foo"
    }

    @Override
    public String createNotEqualValue() {
        return "baz";
    }

}
