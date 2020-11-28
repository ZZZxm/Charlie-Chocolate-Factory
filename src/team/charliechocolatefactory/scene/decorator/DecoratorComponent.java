package team.charliechocolatefactory.scene.decorator;

/**
 * @author TT
 * @project chocolateFactory
 * @classname CentralAirCondition
 * @description this is an interface implements getDescription getBuildCost
 * @date 2020/11/18 14:35
 */
public interface DecoratorComponent {
    /**
     * String represents the description of residence
     */
    String getDescription();

    /**
     * Return the cost of residence
     */
    double getBuildCost();
}
