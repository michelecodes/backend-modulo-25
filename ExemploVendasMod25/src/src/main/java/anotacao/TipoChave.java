package src.main.java.anotacao;

import java.lang.annotation.*;

/**
 * @author michele.codes
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}