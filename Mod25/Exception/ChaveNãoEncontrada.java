package Exception;
/**
 * @author Davi
 *
 */
public class ChaveNãoEncontrada extends Throwable {
    private static final long serialVersionUID = -3456753543543L;

    public ChaveNãoEncontrada(String msg) {
        this(msg, null);
    }
    public ChaveNãoEncontrada(String msg, Throwable e) {
        super(msg, e);
    }
}
