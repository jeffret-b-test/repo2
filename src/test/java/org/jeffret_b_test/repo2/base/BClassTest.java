package org.jeffret_b_test.repo2.base;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BClassTest {

    @Test
    public void getSet() {
        String testValue = "this is a test value";
        BClass bClass = new BClass();
        bClass.setB(testValue);
        assertThat(bClass.getB(), is(testValue));
    }

}