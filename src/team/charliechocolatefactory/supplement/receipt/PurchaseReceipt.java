package team.charliechocolatefactory.supplement.receipt;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname PurchaseReceipt
 * @description
 *
 * Purchase Receipt,
 *
 * once determined, is immutable, so use final for a modification.
 *
 * @date 2020/11/25 9:36
 */
public final class PurchaseReceipt extends AbstractReceipt {


    /**
     * @param info:message of the receipt;
     */
    public PurchaseReceipt(String info){
        // constructor redirection
        this(info, ReceiptType.PURCHASERECEIPT);
    }

    /**
     * @param info : message of the receipt;
     * @param type : type of the receipt
     */
    protected PurchaseReceipt(String info, ReceiptType type) {
        super(info, type);
    }


}