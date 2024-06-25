package com.blessing.enthware.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface NonNull {
}

public class Demo {

    public static void main(@NonNull String[] args) {
        // TODO Auto-generated method stub
        var str = (@NonNull String) "";

        @NonNull String str2 = "";
    }

}
