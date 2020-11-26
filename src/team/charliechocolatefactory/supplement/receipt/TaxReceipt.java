package team.charliechocolatefactory.supplement.receipt;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname TaxReceipt
 * @description
 *
 * Tax Receipt,
 *
 * once determined, is immutable, so use final for a modification.
 *
 * @date 2020/11/25 9:30
 */
public final class TaxReceipt extends AbstractReceipt {


    /**
     * @param info:message of the receipt;
     */
    public TaxReceipt(String info){
        // constructor redirection
        this(info, ReceiptType.TAXRECEIPT);
    }

    /**
     * @param info : message of the receipt;
     * @param type : type of the receipt
     */
    protected TaxReceipt(String info, ReceiptType type) {
        super(info, type);
    }


}