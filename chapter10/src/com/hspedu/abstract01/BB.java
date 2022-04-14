package com.hspedu.abstract01;

public class BB extends AB {
    public void job(){
        int num = 0;
        for (int i = 0; i < 8000000; i++) {
            num = num/2;
        }
    }
}
