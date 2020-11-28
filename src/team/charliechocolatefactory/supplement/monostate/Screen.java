package team.charliechocolatefactory.supplement.monostate;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Screen
 * @description This represents the screen of guard
 * @date 2020/11/26 15:08
 */
public class Screen {
    /**
     * String representing the initial screen of the guard
     */
    private static String content = "------------------------";

    public Screen() { }

    /**
     * Get the content of guard's screen
     */
    public String getContent() {
        return content;
    }

    /**
     * Set the content of guard's screen
     */
    public void setContent(String content) {
        Screen.content = content;
    }

    /**
     * Return the content of guard's screen
     */
    public void returnContent() {
        Screen.content = "------------------------";
    }

}
