package com.practice.Spring.internal;

import junit.framework.TestCase;
import com.practice.Spring.ExampleBean;

public class ExampleBeanImplTest extends TestCase
{
    public void testBeanIsABean()
    {
        ExampleBean aBean = new ExampleBeanImpl();
        assertTrue( aBean.isABean() );
    }
}
