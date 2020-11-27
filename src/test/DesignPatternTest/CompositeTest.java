package test.DesignPatternTest;

import team.charliechocolatefactory.machine.processmachine.qualitytestmachine.qualitytestsystem.QualityInspectionPanel;
import team.charliechocolatefactory.machine.processmachine.qualitytestmachine.qualitytestsystem.QualityInspectionPanelGroup;
import team.charliechocolatefactory.machine.processmachine.qualitytestmachine.qualitytestsystem.QualityTestSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author TT
 * @project chocolateFactory
 * @classname CompositeTest
 * @description TODO
 * @date 2020/11/24 20:56
 */
public class CompositeTest {
    private static Map<String, QualityInspectionPanelGroup> qualityInspectionPanelGroups = new HashMap<String, QualityInspectionPanelGroup>();
    private static Map<String, QualityInspectionPanel> qualityInspectionPanels = new HashMap<String, QualityInspectionPanel>();

    public static void createGroup() {
        /**
         * @description: Create a QualityInspectionPanelGroup Node with requirements.
         *
         * @return : void
         **/
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the identifier of Group you want to create（numbers except'#'）：\n");
        String no = sc.next();
        while (no.equals("#")) {
            System.out.println("Invalid Input, Please input again.（numbers except'#'）：\n");

            no = sc.next();
        }
        while (qualityInspectionPanelGroups.get(no) != null) {
            System.out.println("The  identifier has been used, ");
            System.out.println("please input again.（numbers except'#'）：\n");
            no = sc.next();
        }

        QualityInspectionPanelGroup node = new QualityInspectionPanelGroup(no);
        qualityInspectionPanelGroups.put(no, node);
        System.out.println("Group " + no + " has been created");
    }

    public static void createPanel() {
        /**
         * @description: Create a QualityInspectionPanel Node with requirements.
         *
         * @return : void
         **/
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the size of the panel you want to create（A-Z except'#'）：");
        String name = sc.next();
        while (name.equals("#")) {
            System.out.println("The size is invalid,");
            System.out.println("please input again（A-Z except'#'）：\n");
            name = sc.next();
        }
        while (qualityInspectionPanels.get(name) != null) {
            System.out.println("The size has been used,");
            System.out.println("please input again（A-Z except'#'）：\n");
            name = sc.next();
        }

        QualityInspectionPanel node = new QualityInspectionPanel(name);
        qualityInspectionPanels.put(name, node);
        System.out.println("Panel " + name + " has been created");
    }


    public static void addLeaf() {
        /**
         * @description: Add a leaf node (group or panel) into a root node (group).
         *
         * @return : void
         **/
        QualityInspectionPanelGroup rootNode;
        QualityTestSystem leafNode;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the identifier of the group you want to enlarge（numbers except'#'）：");
        String root = sc.next();
        if (root.equals("#")) {
            return;
        }
        rootNode = qualityInspectionPanelGroups.get(root);
        while (rootNode == null) {
            System.out.println("The group does not exist");
            System.out.println("Please input again:(numbers except '#')\n");
//            System.out.println("请输入成链的前驱节点编号（输入'#'退出操作）：");
            root = sc.next();
            if (root.equals("#")) {
                return;
            }
            rootNode = qualityInspectionPanelGroups.get(root);
        }

        while (true) {
            System.out.println("Please input which kind of system you want to add to enlarge the group you choose（numbers,'#' to quit）：");
            System.out.println("[0 Group | 1 Panel] ");
            String choice = sc.next();
            if (choice.equals("#")) {
                return;
            }
            if (choice.equals("0")) {
                System.out.println("Please input the identifier of the group you want to add to Group " + root + "（numbers,'#' to quit）：");
                String no = sc.next();

                if (no.equals("#")) {
                    return;
                }
                leafNode = qualityInspectionPanelGroups.get(no);
                while (leafNode == null) {
                    System.out.println("The group does not exist,you must create it first!");
                    System.out.println("Do you want to create it now? (y=yes/#=no)\n");
                    String cho = sc.next();

                    if (cho.equals("y")) {
//                        createGroup();
                        QualityInspectionPanelGroup node = new QualityInspectionPanelGroup(no);
                        qualityInspectionPanelGroups.put(no, node);
                    }
                    if (no.equals("#")) {
                        return;
                    }
                    leafNode = qualityInspectionPanelGroups.get(no);
                    System.out.println("Group " + no + " has been created");
                    System.out.println("Group " + no + " has been added to Group " + root);
                    break;
                }
                break;
            } else if (choice.equals("1")) {
                System.out.println("Please input the size of the panel you want to add to Group " + root + "（A-Z'#' to quit）：");
                String name = sc.next();
                if (name.equals("#")) {
                    return;
                }
                leafNode = qualityInspectionPanels.get(name);
                while (leafNode == null) {
                    System.out.println("The panel does not exist, you must create it first! ");
                    System.out.println("Do you want to create it now? (y=yes/#=no)\n");
                    String cho = sc.next();

                    if (cho.equals("y")) {
//                        createPanel();
                        QualityInspectionPanel node = new QualityInspectionPanel(name);
                        qualityInspectionPanels.put(name, node);
                        System.out.println("Panel " + name + " has been created");
                    }
                    if (name.equals("#")) {
                        return;
                    }
                    leafNode = qualityInspectionPanels.get(name);
                    System.out.println("Panel " + name + " has been added to Group " + root);
                    break;
                }
                break;
            } else {
                System.out.println("Invalid Input\n");
            }
        }
        rootNode.add(leafNode);
    }

    public static void showLeaf() {
        /**
         * @description: Show the tree structure.
         *
         * @return : void
         **/
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the identifier of the group you want to know（numbers,'#' to quit）：");
        String root = sc.next();
        if (root.equals("#")) {
            return;
        }
        QualityInspectionPanelGroup rootNode = qualityInspectionPanelGroups.get(root);
        while (rootNode == null) {
            System.out.println("The group does not exist ");
            System.out.println("Please input again:（'#' to quit）：\n");
            root = sc.next();
            if (root.equals("#")) {
                return;
            }
            rootNode = qualityInspectionPanelGroups.get(root);
        }

        System.out.println("The result ：");
        rootNode.show();
    }


    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Composite]Pattern —————————————-------------------------------------————");


        System.out.println("QualityInspectionPanelGroup : add() : Add a element to the list of group.");
        System.out.println("QualityInspectionPanelGroup : show() : Show all elements in the list of group.");
        System.out.println("QualityInspectionPanel : add() : Add a element to the list of panel.");
        System.out.println("QualityInspectionPanel : show() : Show all elements in the list of panel.");
        System.out.println("");

        String choice;

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("----------------------------Composite Test---------------------------");
            System.out.println("**      1 --- Create a QualityInspection Panel Group(Multiple)     **");
            System.out.println("**      2 --- Create a QualityInspection Panel (Single)            **");
            System.out.println("**      3 --- Enlarge the existing Group                           **");
            System.out.println("**      4 --- Show the  QualityTestSystem  structure               **");
            System.out.println("**      5 --- Exit                                                 **");
            System.out.println("-----------------------------------------");
//            System.out.println("请选择操作：[1 新建Cluster(Multiple)节点 | 2 新建Plant(Single)节点 | 3 往根节点中添加叶节点 | 4 查看树型结构 | 0]");
            choice = sc.next();
            if (choice.equals("1")) {
                createGroup();
            } else if (choice.equals("2")) {
                createPanel();
            } else if (choice.equals("3")) {
                addLeaf();
            } else if (choice.equals("4")) {
                showLeaf();
            } else if (choice.equals("5")) {
                break;
            } else {
                System.out.println("Invalid Input, Please input again.\n");
            }
        }

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }
}
