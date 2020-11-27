package team.charliechocolatefactory.supplement.receipt;

import team.charliechocolatefactory.supplement.receipt.provider.Provider;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname AbstractReceipt
 * @description
 *
 * immutable patter，
 *
 * The base class of the receipt, which is applicable to specifying the public attributes and fields of the receipt.
 * @date 2020/11/25 8:58
 */
public abstract class AbstractReceipt {

    /**
     * Amount of invoice
     */
    private Double money = 9999.91;

    /**
     * Provider information of invoice
     */
    private Provider provider;


    /**
     * Details of the receipt
     */
    private String info;


    /**
     * type of receipt,
     * It is divided into three parts:TAXRECEIPT, COMMONRECEIPT, PURCHASERECEIPT;
     */
    private ReceiptType type;

    /**
     *
     * @param info: message of the receipt;
     * @param type: type of the receipt
     */
    protected AbstractReceipt(String info, ReceiptType type, Provider provider) {
        this.provider = provider;
        this.info = info;
        this.type = type;
    }

    /**
     * @return: String type of this Receipt;
     */
    @Override
    public String toString() {
        return "AbstractReceipt{" +
                "money=" + money +
                ", provider=" + provider +
                ", info='" + info + '\'' +
                ", type=" + type +
                '}';
    }
}