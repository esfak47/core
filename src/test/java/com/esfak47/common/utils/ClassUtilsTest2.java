package com.esfak47.common.utils;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

import static com.esfak47.common.utils.ClassUtils.isAssignable;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * @author tonywang
 *         created on 2018/1/27.
 */
public class ClassUtilsTest2 extends UpperGeneric.Generic<Child, Integer> {
    protected ClassUtilsTest2(Child child, Integer integer) {
        super(child, integer);
    }

    public ClassUtilsTest2() {
        super(new Child(), 1);
    }

    @Test
    public void getRawType() throws Exception {
        Class<?> rawType = ClassUtils.getRawType(int.class);
        Assert.assertEquals(rawType, int.class);

        rawType = ClassUtils.getRawType(Integer.class);
        Assert.assertEquals(rawType, int.class);
    }

    @Test
    public void testAssignable() {
        assertThat(isAssignable(int.class, Integer.class), is(true));
        assertThat(isAssignable(Integer.class,int.class),is(true));
        assertThat(isAssignable(getClass(),ClassUtilsTest2.class),is(true));
        assertTrue(isAssignable(ClassUtilsTest2.class,getClass()));
        assertTrue(isAssignable(UpperGeneric.Generic.class,ClassUtilsTest2.class));
        assertFalse(isAssignable(int[].class,Integer[].class));
        assertFalse(isAssignable(ClassUtilsTest2.class,UpperGeneric.Generic.class));
        assertFalse(isAssignable(Child.class,Parent.class));
        assertTrue(isAssignable(Parent.class,Child.class));
    }

    @Test
    public void getRawType2() throws Exception {



    }


}