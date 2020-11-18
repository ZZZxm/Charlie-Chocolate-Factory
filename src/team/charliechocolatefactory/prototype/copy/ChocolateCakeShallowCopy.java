//package team.charliechocolatefactory.prototype.copy;
//
//import team.charliechocolatefactory.factory.product.MilkChocolate;
//import team.charliechocolatefactory.prototype.material.Agg;
//
///**
// * @author Zeus Lee
// * @project chocolateFactory
// * @classname ChocolateCake
// * @description We need cloned classes, chocolate cake classes,
// * This class mainly tests shallow copies
// * @date 2020/11/15 17:14
// */
//
///**
// * must implements Cloneable.
// */
//public class ChocolateCakeShallowCopy implements Cloneable {
//
//    /**
//     * ChocolateCake name;
//     */
//    private String name;
//
//    /**
//     * Chocolate cake contains eggs
//     */
//    private Agg agg;
//
//    /**
//     * Chocolate cake contains chocolate,this user factor pattern MilkChocolate;
//     */
//    private MilkChocolate chocolate;
//
//    /**
//     * All parameter constructed functions
//     * @param name:ChocolateCake name;
//     * @param agg:ChocolateCake agg;
//     * @param chocolate:ChocolateCake:chocolate
//     */
//    public ChocolateCakeShallowCopy(String name, Agg agg, MilkChocolate chocolate) {
//        this.name = name;
//        this.agg = agg;
//        this.chocolate = chocolate;
//    }
//
//    /**
//     * @return this class name;
//     */
//    public String getName() {
//        return name;
//    }
//
//    /**
//     * @param name:set this class name;
//     */
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    /**
//     * @return: this class agg;
//     */
//    public Agg getAgg() {
//        return agg;
//    }
//
//    /**
//     * @param agg:set this class agg;
//     */
//    public void setAgg(Agg agg) {
//        this.agg = agg;
//    }
//
//    /**
//     * @return: get this chololege;
//     */
//    public MilkChocolate getChocolate() {
//        return chocolate;
//    }
//
//    /**
//     * @return: set this chololege;
//     */
//    public void setChocolate(MilkChocolate chocolate) {
//        this.chocolate = chocolate;
//    }
//}
