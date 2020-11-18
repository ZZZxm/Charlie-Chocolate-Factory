package team.charliechocolatefactory.product.chocolateProduct.chocolatemix;

/**
 * @project chocolateFactory
 * @classname NewInstanceFailureException
 * @description Exception thrown when MixChocolateFactory.getChocolate() failed to create an
 *              instance of extended Chocolate. In normal cases, this exception SHOULD NEVER BE
 *              THROWN, as the param of MixChocolateFactory.getChocolate() is required to be one of
 *              the extended classes of Chocolate and they all have trival ctor with no param.
 * @author Ngae Zeh-ghau
 * @date 2020/11/15 21:28
 */
public class NewInstanceFailureException extends Exception {

	static final long serialVersionUID = 1L;

	public NewInstanceFailureException(Class<?> type) {
		super("Failed to create chocolate of type: " + type.getSimpleName());
	}

}
