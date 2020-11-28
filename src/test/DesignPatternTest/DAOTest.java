package test.DesignPatternTest;

import team.charliechocolatefactory.person.DAO.StaffDao;
import team.charliechocolatefactory.person.DAO.StaffDaoImpl;
import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Staff;

import java.util.Scanner;

/**
 * @author Miracle Ray
 * @project chocolateFactory
 * @classname DaoTest
 * @description test for Dao
 * @date 2020/11/27 12：10
 */
public class DAOTest {

    public static void DaoTest() {
        StaffDao staffDao = new StaffDaoImpl();
        Scanner scanner = new Scanner(System.in);

        Staff staff;

        int cmd;

        String id;

        boolean flag = true;

        do {
            System.out.println("");
            System.out.println("*************************** TIPS ***************************");
            System.out.println("***      1. Input 1 to show whole staff in database      ***");
            System.out.println("***      2. Input 2 to add staff in the database         ***");
            System.out.println("***      3. Input 3 to delete staff in the database      ***");
            System.out.println("***      4. Input 4 to get detailed information of staff ***");
            System.out.println("***      5. Input 5 to rename a staff                    ***");
            System.out.println("***      6. Input 0 to exit DAO test                     ***");
            System.out.println("************************************************************");
            System.out.println("");

            staffDao.showAllStaff();

            System.out.println("Enter the command [0 to quit]:");
            cmd = scanner.nextInt();
            if (cmd == 0) {
                flag = false;
                break;
            } else if (cmd == 1) {
                System.out.println("Whole table is as follow……");
                staffDao.showAllStaff();
            } else if (cmd == 2) {
                String name, gender;
                int age, salary;
                System.out.println("Please enter name:");
                name = scanner.next();
                System.out.println("Please enter age:");
                age = scanner.nextInt();
                System.out.println("Please enter gender(MALE or FEMALE, case-insensitive):");
                gender = scanner.next();
                Person.Sex sex;
                if (gender.equalsIgnoreCase("MALE")) {
                    sex = Person.Sex.MALE;
                } else if (gender.equalsIgnoreCase("FEMALE")) {
                    sex = Person.Sex.FEMALE;
                } else {
                    System.out.println("Enter gender incorrectly, please enter once again.");
                    continue;
                }
                System.out.println("Please enter salary:");
                salary = scanner.nextInt();
                Staff tempStaff = new Staff(name, age, sex, salary) {
                    @Override
                    protected void setInitialAsset() {
                    }
                };
                staffDao.addStaff(tempStaff);
            } else if (cmd == 3) {
                System.out.println("Please enter ID of the staff that you want to delete.");
                id = scanner.next();
                staffDao.deleteStaff(id);
            } else if (cmd == 4) {
                System.out.println("Please enter ID of the staff that you want to search.");
                id = scanner.next();
                if (staffDao.getStaff(id) != null) {
                    System.out.println(staffDao.showDetail(staffDao.getStaff(id)));
                } else {
                    continue;
                }
            } else if (cmd == 5) {
                System.out.println("Please enter ID of the staff that you want to rename.");
                id = scanner.next();
                System.out.println("Please enter the new name : ");
                String newName = scanner.next();
                staffDao.updateStaff(id, newName);
            }
        } while (flag);

    }

    public static void main(String[] args) {
        System.out.println("—————————————---------------------------------———— Test[Data Access Object]Pattern —————————————---------------------------------————");

        System.out.println("");
        System.out.println("StaffDao : updateStaff(Staff staff,int index) : Interface that StaffDao should have update function.");
        System.out.println("StaffDao : deleteStaff(Staff staff,int index) : Interface that StaffDao should have delete function.");
        System.out.println("StaffDao : addStaff(Staff staff) : Interface that StaffDao should have add function.");
        System.out.println("StaffDao : searchStaff(String StaffID) : Interface that StaffDao should have search function.");
        System.out.println("StaffDaoImpl : updateStaff(Staff staff,int index) : Simulation of update operation in database.");
        System.out.println("StaffDaoImpl : deleteStaff(Staff staff,int index) : Simulation of delete operation in database.");
        System.out.println("StaffDaoImpl : addStaff(Staff staff) : Simulation of add operation in database.");
        System.out.println("StaffDaoImpl : searchStaff(String StaffID) : Simulation of search operation in database.");
        System.out.println("");
        System.out.println("");

        DaoTest();

        System.out.println("—————————————----------------------------------------------————  End   ——————-----------------------------------------------------————");
    }
}