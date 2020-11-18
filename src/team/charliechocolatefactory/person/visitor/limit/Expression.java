package team.charliechocolatefactory.person.visitor.limit;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname Expression
 * @description  Expression interface
 * @date 2020/11/15 11:18
 */
public interface Expression
{
    public boolean interpret(String info);
}