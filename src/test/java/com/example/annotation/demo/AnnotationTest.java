package com.example.annotation.demo;


import com.example.annotation.demo.jdk.AliasFor1;
import com.example.annotation.demo.jdk.AliasFor2;
import com.example.annotation.demo.jdk.TestAno;
import com.example.annotation.demo.spring.AClass;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.annotation.AnnotationUtils;

public class AnnotationTest {


    @org.junit.Test
    public void testAlisFor1(){
        AliasFor1 annotation = AClass.class.getAnnotation(AliasFor1.class);
        AliasFor1 annotation1 = AnnotationUtils.getAnnotation(annotation, AliasFor1.class);
        /**
         * 动态代理 ，修改 Annotation 方法调用 使用代理
         */
        System.out.println(annotation1.key());
        System.out.println(annotation1.keyAlias());

    }

    @org.junit.Test
    public void testAlisForClass(){
        AnnotationAttributes aa = AnnotatedElementUtils.getMergedAnnotationAttributes(AClass.class, AliasFor2.class);
        System.out.println(aa);

        AnnotationAttributes bb = AnnotatedElementUtils.getMergedAnnotationAttributes(AClass.class, TestAno.class);
        System.out.println(bb);
    }

}
