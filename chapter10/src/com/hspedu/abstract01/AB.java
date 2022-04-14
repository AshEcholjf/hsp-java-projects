package com.hspedu.abstract01;

abstract public class AB {
    public abstract void job();

    public void cal() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("AA执行时间" + (end - start));
    }
}
