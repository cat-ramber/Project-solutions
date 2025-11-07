package AutoCaller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//makes it stay at run time
@Target({ElementType.METHOD})//can only be put on methods
public @interface AutoCall {
}
