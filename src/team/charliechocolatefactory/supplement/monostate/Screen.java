package team.charliechocolatefactory.supplement.monostate;

/**
 * @author TT
 * @project chocolateFactory
 * @classname Screen
 * @description TODO
 * @date 2020/11/26 15:08
 */
public class Screen {
    private static String content = "------------------------";

    public Screen() {

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        Screen.content = content;
    }


    public void returnContent() {
        Screen.content = "------------------------";
    }

}
