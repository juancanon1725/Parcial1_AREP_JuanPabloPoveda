package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Invoke {
    Class<Math> c = Math.class;

    public void binaryInvoke() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method m = c.getMethod("max",Double.TYPE,Double.TYPE);
        Object response = m.invoke(null, 2.3,3.5);
    }
    public void unaryInvoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method m = c.getMethod("max",Integer.TYPE,Integer.TYPE);
        Object response = m.invoke(null, 2, 3);
    }
    
}
