package com.example.annotation.demo.jdk;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * 必须要成对出现
 * 针对本类的重名名
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface AliasFor1 {

    @AliasFor("keyAlias")
    String key() default "";

    @AliasFor("key")
    String keyAlias() default "";
}
