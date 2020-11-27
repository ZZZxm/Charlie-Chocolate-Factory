package team.charliechocolatefactory.person.DAO;

import team.charliechocolatefactory.person.staff.Staff;

import java.util.List;

/**
 * @project chocolateFactory
 * @author: Miracle Ray
 * @classname StaffDao
 * @description: This is basic function of Dao.
 * @date: 2020/11/27 10:30
 */
public interface StaffDao {
    List getAllStaff();

    Staff getStaff(String id);

    void updateStaff(String id,String name);

    void deleteStaff(String id);

    void showAllStaff();

    void addStaff(Staff staff);

    String showDetail(Staff staff);
}