package team.charliechocolatefactory.person.visitor.limit;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname Context
 * @description the context of the interpreter pattern.
 * @date 2020/11/15 11:23
 */
public class Context {

    private Expression visitLimit;

    public Context(String[] persons, String[] areas) {
        Expression _persons = new TerminalExpression(persons);
        Expression _areas = new TerminalExpression(areas);
        visitLimit = new AndExpression(_persons, _areas);
    }

    public boolean canEnter(String info) {
        return visitLimit.interpret(info);
    }

    @Override
    public String toString() {
        return "class Context";
    }
}
