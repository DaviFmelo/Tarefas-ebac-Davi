package Annotation;
import java.lang.annotation.*;
/**
 * @author Davi
 *
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Chave {

    String value();
}
