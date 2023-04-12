package hello.core.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/*Qualifier 애노테이션의 내용들을 복붙한 것들이다.*/
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Qualifier("mainDiscountPolicy") // 그러면 MainDiscountPolicy 애노테이션을 쓰면 위 기능이 다 동작한다.
public @interface MainDiscountPolicy {
}
