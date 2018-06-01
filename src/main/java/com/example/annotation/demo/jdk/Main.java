package com.example.annotation.demo.jdk;

import java.lang.annotation.Annotation;

/**
 * 获取注解的注解
 */
@Test
public class Main {
    public static void main(String[] args) {
        Test annotation = Main.class.getAnnotation(Test.class);
        Class<? extends Annotation> aClass = annotation.annotationType();

        TestAno annotation1 = aClass.getAnnotation(TestAno.class);
        System.out.println(annotation1);
    }
}
