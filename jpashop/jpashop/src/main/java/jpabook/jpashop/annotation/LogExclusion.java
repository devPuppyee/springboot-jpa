package jpabook.jpashop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // 어노테이션이 생성될 수 있는 위치
@Retention(RetentionPolicy.RUNTIME)  // 어노테이션의 유효 범위
public @interface LogExclusion {
}
