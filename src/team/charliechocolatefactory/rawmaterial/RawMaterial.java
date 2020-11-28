package team.charliechocolatefactory.rawmaterial;


/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname RawMaterial
 * @description ROOT CLASS RawMaterial
 * @date 2020-11-07 16:12:41
 */
public abstract class RawMaterial {

    /**
     * ctor of RawMaterial
     *
     * @param initialQuant initial quantity
     */
    protected RawMaterial(double initialQuant) {
        quantity = initialQuant;
    }

    /**
     * ctor of RawMaterial
     */
    protected RawMaterial() {
        this(1);
    }

    /**
     * getter of quantity
     *
     * @return quantity
     */
    public double quantity() {
        return quantity;
    }

    /**
     * acquire - Add the quantity of raw material.
     */
    public void acquire(double quant) {
        quantity += quant;
    }

    /**
     * consume - Subtract the quantity of raw material.
     *
     * @param quant quantity to subtract
     * @return the exact quantity consumed
     */
    public double consume(double quant) {
        double quantConsumed = quant;

        if (quantity - quant <= 0) {
            quantConsumed = quantity;
            quantity = 0.0;
            // notifyOnExhaustion();
        }
        quantity -= quant;
        return quantConsumed;
    }

    /**
     * @param obj
     * @return
     */
    public boolean checkQuantityEqualOnStorage(RawMaterial obj) {
        return this.quantity.equals(obj.quantity);
    }

    /**
     * @param obj
     * @return
     */
    public boolean checkQuantityEqualOnValue(RawMaterial obj) {
        return this.quantity.equals(obj.quantity);
    }

    /**
     * quantity of the raw material
     * <p>
     * For FoodRawMaterial subclass, this attribute is intended to represent the
     * quantity of items that shares the same expire date.
     * <p>
     * This attribute may have different units with respect to particular subclass
     * type.
     */
    protected Double quantity;

}
