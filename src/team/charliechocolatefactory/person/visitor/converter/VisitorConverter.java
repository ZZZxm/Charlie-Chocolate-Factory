package team.charliechocolatefactory.person.visitor.converter;

import team.charliechocolatefactory.person.visitor.Visitor;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname VisitorConverter
 * @description VisitorConverter implement Converter
 * @date 2020/11/26 14:24
 */
public class VisitorConverter extends Converter<VisitorDto, Visitor> {

    public VisitorConverter() {
        super(visitorDto -> new Visitor(visitorDto.getName(), visitorDto.getAge(),
                        visitorDto.getSex()),
                visitor -> new VisitorDto(visitor.getName(), visitor.getAge(),
                        visitor.getSex() ));

    }

}