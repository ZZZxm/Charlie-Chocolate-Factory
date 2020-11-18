package team.charliechocolatefactory.person.visitor.limit;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname Context
 * @description the context of the interpreter pattern.
 * @date 2020/11/15 11:23
 */
public class Context {

    private String[] persons = {"visitor"};
    private String[] areas = {"public area", "experience room", "exhibition room"};
    private Expression visitLimit;

    public Context() {
        Expression person = new TerminalExpression(persons);
        Expression area = new TerminalExpression(areas);
        visitLimit = new AndExpression(person, area);
    }

    public boolean canEnter(String info) {
        boolean ok = visitLimit.interpret(info);
        if (ok) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "class Context";
    }
}
