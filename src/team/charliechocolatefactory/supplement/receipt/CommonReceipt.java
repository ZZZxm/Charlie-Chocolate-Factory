package team.charliechocolatefactory.supplement.receipt;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname CommonReceipt
 * @description
 *
 * Common Receipt,
 *
 * once determined, is immutable, so use final for a modification.
 *
 * @date 2020/11/25 9:25
 */
public final class CommonReceipt extends AbstractReceipt {


    /**
     * @param info:message of the receipt;
     */
    public CommonReceipt(String info){
        // constructor redirection
        this(info, ReceiptType.COMMONRECEIPT);
    }

    /**
     * @param info : message of the receipt;
     * @param type : type of the receipt
     */
    protected CommonReceipt(String info, ReceiptType type) {
        super(info, type);
    }


}