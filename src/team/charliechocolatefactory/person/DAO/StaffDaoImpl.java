package team.charliechocolatefactory.person.DAO;

import team.charliechocolatefactory.person.Person;
import team.charliechocolatefactory.person.staff.Staff;
import team.charliechocolatefactory.person.staff.worker.WorkshopWorker;

import java.util.ArrayList;
import java.util.List;
import java.util.Formatter;

/**
 * @project chocolateFactory
 * @author: Miracle Ray
 * @classname StaffDaoImpl
 * @description: Dao Pattern to implement function of StaffDao.
 * @date: 2020/11/27 11:35
 */
public class StaffDaoImpl implements StaffDao {

    List<Staff> allStaff;

    static Formatter formatter = new Formatter(System.out);

    /**
     * Constructor of StaffDaoImpl
     * generate three staffs to test the design pattern DAO
     */
    public StaffDaoImpl() {
        super();
        allStaff = new ArrayList<Staff>();
        Staff staff1 = new Staff("Dinesh", 25, Person.Sex.MALE, 13000) {
            @Override
            protected void setInitialAsset() {
                this.asset = salary;
            }
        };
        Staff staff2 = new Staff("Arnav", 23, Person.Sex.FEMALE, 8000) {
            @Override
            protected void setInitialAsset() {
                this.asset = salary;
            }
        };
        Staff staff3 = new WorkshopWorker("Illidan", 21, Person.Sex.MALE, 6500);
        allStaff.add(staff1);
        allStaff.add(staff2);
        allStaff.add(staff3);
    }

    @Override
    public List<Staff> getAllStaff() {
        return allStaff;
    }

    @Override
    public void addStaff(Staff staff) {
        allStaff.add(staff);
        System.out.println("Add successfully!");
        System.out.println("Staff info:" + staff);
    }

    @Override
    public void showAllStaff() {
        int i = 0;
        System.out.println("_______________________________________________________________________________________");
        System.out.println("|------------------------------------ Staff Table ------------------------------------|");
        System.out.println("|Index|      StaffID       |   StaffName   | StaffAge | StaffSex |    StaffSalary     |");
        for (Staff staff : allStaff) {
            formatter.format("|%-5d|%-20s|%-15s|%-10d|%-10s|%-20d|", i, staff.getId(), staff.getName(), staff.getAge(), staff.getSex(), staff.getSalary());
            System.out.println("");
            i++;
        }
        System.out.println("_______________________________________________________________________________________");
    }

    @Override
    public Staff getStaff(String id) {
        int StaffNo = get_index_by_ID(id);
        if (StaffNo == -1) {
            System.out.println("Can't find ID...");
            return null;
        }
        return (Staff) allStaff.get(StaffNo);
    }

    @Override
    public void updateStaff(String id, String name) {
        int index = get_index_by_ID(id);
        if (index == -1) {
            System.out.println("Can't find ID...");
            return;
        }
        allStaff.get(index).setName(name);
        System.out.println("Staff information has updated in the database.");
    }

    @Override
    public void deleteStaff(String id) {
        int index = get_index_by_ID(id);
        if (index == -1) {
            System.out.println("Can't find ID...");
            return;
        }
        allStaff.remove(index);
        System.out.println("Staff information has deleted from the database.");
    }

    @Override
    public String showDetail(Staff staff) {
        return "Staff Info:[\"StaffID\":\"" + staff.getId() + "\",\"StaffName\":\"" + staff.getName() + "\",\"StaffAge\":" + staff.getAge() + ",\"StaffSex\":\"" + staff.getSex() + "\",\"StaffSalary\":" + staff.getSalary() + "]";
    }

    private int get_index_by_ID(String id) {
        int index = -1;
        for (Staff staff : allStaff) {
            if (staff.getId().equals(id)) {
                index = allStaff.indexOf(staff);
                break;
            }
        }
        return index;
    }
}