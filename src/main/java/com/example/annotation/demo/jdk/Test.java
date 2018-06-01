package com.example.annotation.demo.jdk;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@TestAno
public @interface Test {

    String a() default "";
}
