package com.hspedu.abstract01;

public class AA extends  AB{
    public void job() {
        int num = 0;
        for (int i = 0; i < 8000000; i++) {
            num++;
        }
    }


    //当AA类中存在多个job方法时，我们可以将对时间进行计算的部分写成一个方法，实现优化,如下
//    public void cal() {
//        long start = System.currentTimeMillis();
//        job();
//        long end = System.currentTimeMillis();
//        System.out.println("AA执行时间" + (end - start));
//    }

    //同理，当存在多个类时，每个类中都存在job方法，需要对job进行时间计量，而每次不同的只是job方法，所以我们将cal方法提取到抽象类中
    //job方法写成抽象方法，由子类实现
}
