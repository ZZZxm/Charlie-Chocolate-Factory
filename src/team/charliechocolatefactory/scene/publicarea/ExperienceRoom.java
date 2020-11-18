package team.charliechocolatefactory.scene.publicarea;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname ExperienceRoom
 * @description Designed for visitors to experience making chocolate
 * @date 2020/11/9 19:52
 */
public class ExperienceRoom extends PublicArea {

    /**
     * number of this exp-room
     * @modified by Ray
     **/
    private int expRoomNumber;

    /**
     * constructor of ExperienceRoom
     */
    public ExperienceRoom(String location, double cost, double area, int maxNumber) {
        super(location, cost, area, maxNumber);
    }

    public int getExpRoomNumber(){return expRoomNumber;}

    public void setExpRoomNumber(int number){expRoomNumber=number;}
}
