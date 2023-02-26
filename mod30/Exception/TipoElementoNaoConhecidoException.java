/**
 * 
 */
package Exception;

/**
 * @author Davi
 *
 */
public class TipoElementoNaoConhecidoException extends Exception {
	

	private static final long serialVersionUID = -23454353453L;

	public TipoElementoNaoConhecidoException(String msg) {
        this(msg, null);
    }

    public TipoElementoNaoConhecidoException(String msg, Throwable e) {
        super(msg, e);
    }
}