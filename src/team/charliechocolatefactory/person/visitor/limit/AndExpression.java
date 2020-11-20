package team.charliechocolatefactory.person.visitor.limit;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname AndExpression
 * @description Nonterminal expression, implements the interface Expression.
 * @date 2020/11/15 11:23
 */
public class AndExpression implements Expression {

    private Expression person = null;
    private Expression area = null;

    public AndExpression(Expression person, Expression area) {
        this.person = person;
        this.area = area;
    }

    public boolean interpret(String info) {
        String s[] = info.split(" enter ");
        return person.interpret(s[0]) && area.interpret(s[1]);
    }

    @Override
    public String toString() {
        return "class AndExpression implements Expression";
    }
}
