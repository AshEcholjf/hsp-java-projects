package com.hspedu.modifier;

import java.util.Scanner;

public class A {
   public String  a = "public";//在不同包下面的类中也可以访问
   protected String b = "protected";//继承的子类可以访问
   String c = "默认";//在同一个包下的不同类中可以访问
   private String d = "private";//只在本类中可以访问，例如Scanner中的变量就是用private修饰的

   public static void main(String[] args) {

   }

}
