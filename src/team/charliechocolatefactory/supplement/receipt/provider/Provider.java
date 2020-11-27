package team.charliechocolatefactory.supplement.receipt.provider;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname Provider
 * @description Provider information of invoice
 * @date 2020/11/27 17:24
 */
public abstract class Provider {

    /**
     * Person name in charge of provider
     */
    private String providerName;

    /**
     * Person tel in charge of provider
     */
    private String providerTel;

    /**
     * Person Address in charge of provider
     */
    private String providerAdd;

    /**
     * Constructor with parameters.
     * @param providerName:Person name in charge of provider
     * @param providerTel: tel in charge of provider
     * @param providerAdd: Address in charge of provider
     */
    public Provider(String providerName, String providerTel, String providerAdd) {
        this.providerName = providerName;
        this.providerTel = providerTel;
        this.providerAdd = providerAdd;
    }

    /**
     * Constructor with no parameters.
     */
    public Provider() {
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderTel() {
        return providerTel;
    }

    public void setProviderTel(String providerTel) {
        this.providerTel = providerTel;
    }

    public String getProviderAdd() {
        return providerAdd;
    }

    public void setProviderAdd(String providerAdd) {
        this.providerAdd = providerAdd;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "providerName='" + providerName + '\'' +
                ", providerTel='" + providerTel + '\'' +
                ", providerAdd='" + providerAdd + '\'' +
                '}';
    }
}