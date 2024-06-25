package com.blessing.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatableAnno.class)
@interface MyAnno {
    public abstract String str() default "Testing";

    int val() default 900;

    long[] love() default {};
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatableAnno {
    MyAnno[] value();

    long d() default 0;
}

public class RepeatableAnn {

    @MyRepeatableAnno(value = {}, d = 4)
    int a;

    @MyAnno(str = "First", val = 90, love = {1, 2, 3, 4})
    @MyAnno(str = "Second", val = 10)
    public static void myMeth(String str, int i) {
        try {
            Class<?> c = new RepeatableAnn().getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno[] ann = m.getAnnotation(MyRepeatableAnno.class).value();
            for (MyAnno ma : ann) {
                System.out.println(ma.annotationType());
                System.out.println(ma.str());
            }
        } catch (Exception ex) {
            System.out.println("Method not found.");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        myMeth("test", 10);
    }

}
