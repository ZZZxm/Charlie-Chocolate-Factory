package team.charliechocolatefactory.supplement.receipt.provider;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname TaxProvider
 * @description Provider of Common invoice
 * @date 2020/11/27 17:28
 */
public class CommonProvider extends Provider {


    /**
     * Constructor with parameters.
     * @param providerName:Person name in charge of provider
     * @param providerTel: tel in charge of provider
     * @param providerAdd: Address in charge of provider
     */
    public CommonProvider(String providerName, String providerTel, String providerAdd) {
        super(providerName, providerTel, providerAdd);
    }

    /**
     * Person Address in charge of provider
     */
    public CommonProvider() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}