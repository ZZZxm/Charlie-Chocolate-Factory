package team.charliechocolatefactory.person.DAO;

import team.charliechocolatefactory.person.staff.Staff;

import java.util.List;

/**
 * @project chocolateFactory
 * @author: Miracle Ray
 * @classname StaffDao
 * @description: This is basic function of DAO (Data Access Object).
 * @date: 2020/11/27 10:30
 */
public interface StaffDao {
    /**
     * @return list of all the staffs
     */
    List<Staff> getAllStaff();

    /**
     * Get staff by his/her id
     * @param id Staff ID
     * @return the wanted staff
     */
    Staff getStaff(String id);

    /**
     * update the staff
     * @param id staff ID
     * @param name staff name
     */
    void updateStaff(String id,String name);

    /**
     * delete the staff by ID
     * @param id staff ID
     */
    void deleteStaff(String id);

    /**
     * show all the staffs
     */
    void showAllStaff();

    /**
     * add a staff
     */
    void addStaff(Staff staff);

    /**
     * show the detail of the staff
     * @param staff the staff
     * @return detail of the staff
     */
    String showDetail(Staff staff);
}