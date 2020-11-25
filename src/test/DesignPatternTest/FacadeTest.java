package test.DesignPatternTest;

import team.charliechocolatefactory.factory.support.SecurityCheckTask;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Guard;
import team.charliechocolatefactory.product.Product;
import team.charliechocolatefactory.scene.publicarea.ExperienceRoom;
import team.charliechocolatefactory.scene.publicarea.ExhibitionRoom;
import team.charliechocolatefactory.machine.Machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Miracle Ray
 * @project chocolateFactory
 * @classname FacadeTest
 * @description test for Facade
 * @date 2020/11/23 14：10
 */
public class FacadeTest {
    static public void facadeTest(){
        /*
         * create two ExhibitionRooms
         */
        List<ExhibitionRoom> exhibitionRoomList = new ArrayList<ExhibitionRoom>();
        ExhibitionRoom exhibitionRoom1=new ExhibitionRoom("area1",100,100,100);
        ExhibitionRoom exhibitionRoom2=new ExhibitionRoom("area2",100,100,100);
        exhibitionRoom1.setExhRoomNumber(1);
        exhibitionRoom2.setExhRoomNumber(2);
        for(int i=0;i<10;i++){
            exhibitionRoom1.addExhibits("chocolate made in 201"+i);
            exhibitionRoom2.addExhibits("tools used in 198"+i);
        }
        exhibitionRoomList.add(exhibitionRoom1);
        exhibitionRoomList.add(exhibitionRoom2);

        /*
         * create two ExperienceRooms
         */
        List<ExperienceRoom> experienceRoomList = new ArrayList<ExperienceRoom>();
        ExperienceRoom experienceRoom1=new ExperienceRoom("area3",100,100,100);
        ExperienceRoom experienceRoom2=new ExperienceRoom("area4",100,100,100);
        experienceRoom1.setExpRoomNumber(1);
        experienceRoom2.setExpRoomNumber(2);
        experienceRoomList.add(experienceRoom1);
        experienceRoomList.add(experienceRoom2);

        /*
         * create 2 machines
         */
        List<Machine> machineList = new ArrayList<Machine>();
        Machine productionMachine =new Machine("PR","101"){
            @Override
            protected int work(Product product) {
                return 0;
            }
        };
        Machine packingMachine = new Machine("PA","202"){
            @Override
            protected int work(Product product) {
                return 0;
            }
        };
        Machine transportMachine = new Machine("TR","303"){
            @Override
            protected int work(Product product) {
                return 0;
            }
        };
        machineList.add(productionMachine);
        machineList.add(packingMachine);
        machineList.add(transportMachine);

        Guard guard=new Guard("Mike",25, Person.Sex.MALE,1000);

        /*
         * assign a task to the guard
         */
        SecurityCheckTask securityCheckTask=new SecurityCheckTask(exhibitionRoomList,experienceRoomList,machineList);
        guard.setSecurityCheckTask(securityCheckTask);

        System.out.println("");
        System.out.println("***************************   Facade Test   ***************************");
        System.out.println("***              1.系统已经为您创建好一个警卫对象                      ***");
        System.out.println("***       他将负责两个展览馆，两个实践区，三台机器的安全检查工作。        ***");
        System.out.println("***                 2. 选择警卫进行的工作                             ***");
        System.out.println("***********************************************************************");

        int cmd;
        while(true){
            try{
                System.out.println("");
                System.out.println("请指定警卫将要进行的安全检查工作： 1.检查公共区域  2.检查机器安全  3.汇报检查工作情况  4.退出");
                Scanner scanner = new Scanner(System.in);
                cmd=scanner.nextInt();
                if(cmd==1) {
                    guard.checkRoomSecurity();
                } else if(cmd==2) {
                    guard.checkMachineSecurity();
                } else if(cmd==3) {
                    guard.report();
                } else if(cmd==4) {
                    break;
                } else {
                    System.out.println("输入指令无效，请重新输入。");
                }
                }catch(Exception e) {
                System.out.println("输入指令无效，请重新输入。");
            }
        }

    }


    public static void main(String[] args){
        System.out.println("—————————————-------------------------------------———— Test[Facade]Pattern —————————————-------------------------------------————");
        System.out.println("Initiating System ……");

        System.out.println("ExhibitionRoom : setExhRoomNumber() : set the exhibition room number.");
        System.out.println("ExhibitionRoom : addExhibits() : add exhibits in the room.");
        System.out.println("ExperienceRoom : setExpRoomNumber() : set the experience room number.");
        System.out.println("Machine : getMachineID() : get ID of this machine ( type + machineNumber ).");
        System.out.println("Machine : fix() : check if this machine is broken. If it's broken, fix it.");
        System.out.println("");
        facadeTest();
        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }

}
