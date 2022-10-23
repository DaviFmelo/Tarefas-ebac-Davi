import java.lang.annotation.*;

/*
 * Anotação da tabela
 */
@Documented
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Tabela {

}
