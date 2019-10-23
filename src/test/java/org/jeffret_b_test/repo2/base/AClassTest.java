package org.jeffret_b_test.repo2.base;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AClassTest {

    @Test
    public void getSet() {
        int a = 572;
        AClass aClass = new AClass();
        aClass.setA(a);
        assertThat(aClass.getA(), is(a));
    }

}