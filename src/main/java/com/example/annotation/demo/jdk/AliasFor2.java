package com.example.annotation.demo.jdk;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
// AliasFor class must be add TestAno like this
@TestAno
public @interface AliasFor2 {

    @AliasFor(attribute="a",annotation = TestAno.class)
    String callTestAnoA() default "";
}
