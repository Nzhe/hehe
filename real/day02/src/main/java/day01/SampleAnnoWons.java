package day01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD/*, ElementType.CONSTRUCTOR = Service 클래스에서 생성자 @를 에러 안나게 할 수 있는것*/})
@Retention(RetentionPolicy.RUNTIME)
public @interface SampleAnnoWons {
	String value() default "$";
	int number() default 15;
}
