package team.charliechocolatefactory.product.chocolateProduct.chocolatemix;

import java.util.HashMap;

import team.charliechocolatefactory.product.chocolate.*;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname MixChocolateFactory
 * @description Factory class of ChocolateMix. This is a part of Flyweight Pattern.
 * @date 2020/11/16 00:32
 */
public class MixChocolateFactory {
// fields
    private static final HashMap<Class<? extends Chocolate>, Chocolate> chocolateMap =
            new HashMap<>();

    /**
     * Get an instance of certain subclass of Chocoate or create a new one if absent.
     *
     * @param type Extended class of Chocolate. eg: DarkChocolate.class
     * @return Instance of (extended) Chocolate.
     * @throws NewInstanceFailureException Thrown when failed to create an instance.
     */
    public static Chocolate getChocolate(Class<? extends Chocolate> type)
            throws NewInstanceFailureException {
        Chocolate chocolate =
                chocolateMap.computeIfAbsent(type, (Class<? extends Chocolate> key) -> {
                    try {
                        System.out.println("Creating chocolate of type: " + key.getSimpleName());
                        return key.getDeclaredConstructor().newInstance();
                    } catch (Exception e) {
                        return null;
                    }
                });

        if (chocolate == null) {
            throw new NewInstanceFailureException(type);
        }
        return chocolate;
    }

    /**
     * Hide the public ctor.
     */
    private MixChocolateFactory() {
    }

}
