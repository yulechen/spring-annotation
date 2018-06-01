package com.example.annotation.demo.jdk;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface TestAno {

    String a() default "";
}
