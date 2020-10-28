package com.ssm.commom.aop;

import java.lang.annotation.*;

/**
 * 日志的注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface LogAopAnnotation {
    String name() default "";
}
