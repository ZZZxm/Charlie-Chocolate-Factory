package team.charliechocolatefactory.supplement.receipt;

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
    protected AbstractReceipt(String info, ReceiptType type) {
        this.info = info;
        this.type = type;
    }

    /**
     * @return: String type of this Receipt;
     */
    @Override
    public String toString() {
        return "AbstractReceipt{" +
                "info='" + info + '\'' +
                ", type=" + type +
                '}';
    }
}