package test.DesignPatternTest;

import team.charliechocolatefactory.supplement.receipt.CommonReceipt;
import team.charliechocolatefactory.supplement.receipt.PurchaseReceipt;
import team.charliechocolatefactory.supplement.receipt.TaxReceipt;

import java.util.Scanner;

/**
 * @author Zeus
 * @project chocolateFactory
 * @classname ImmutableTest
 * @description ImmutableTest
 * @date 2020/11/25 9:47
 */
public class ImmutableTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Immutable] Test ------------------------------------");

        System.out.println("");
        System.out.println("AbstractReceipt : AbstractReceipt(String info, ReceiptType type) : " +
                "The base class of invariant objects, used to initialize invariant objects.");
        System.out.println("");

        System.out.println("");
        System.out.println("************************* Immutable Test ******************************");
        System.out.println("***                 1. Init commonReceipt                           ***");
        System.out.println("***                 2. Init TaxReceipt                              ***");
        System.out.println("***                 3. Init PurchaseReceipt                         ***");
        System.out.println("***                                                                 ***");
        System.out.println("*** Tips: You can choose the type of invoice to input.              ***");
        System.out.println("***       The invoice initialized here is immutable                 ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();


            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    // init common receipt;
                    CommonReceipt receipt = new CommonReceipt("this is CommonReceipt");
                    System.out.println(receipt);
                    break;
                }
                case 2: {
                    // init TaxReceipt;
                    TaxReceipt receipt = new TaxReceipt("this is TaxReceipt");
                    System.out.println(receipt);
                    break;
                }
                case 3: {
                    // init PurchaseReceipt;
                    PurchaseReceipt receipt = new PurchaseReceipt("this is PurchaseReceipt");
                    System.out.println(receipt);
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }

}