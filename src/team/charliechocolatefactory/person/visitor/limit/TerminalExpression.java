package team.charliechocolatefactory.person.visitor.limit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname TerminalExpression
 * @description Terminal expression, implements the interface Expression.
 * @date 2020/11/15 11:22
 */
public class TerminalExpression implements Expression {

    private Set<String> set = new HashSet<String>();

    public TerminalExpression(String[] data) {
        set.addAll(Arrays.asList(data));
    }

    public boolean interpret(String info) {
        return set.contains(info);
    }

    @Override
    public String toString() {
        return "class TerminalExpression implements Expression";
    }
}
