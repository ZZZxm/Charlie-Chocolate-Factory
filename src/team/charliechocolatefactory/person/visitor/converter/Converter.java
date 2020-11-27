package team.charliechocolatefactory.person.visitor.converter;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname converter
 * @description abstract base class converter
 * @date 2020/11/26 14:23
 */
public abstract class Converter < T, E >{
    private final Function< T, E > fromDto;
    private final Function< E, T > fromEntity;

    /**
     *
     * @param fromDto
     * converts given dto entity into the domain entity.
     * @param fromEntity
     * Function that converts entity to the dto entity.
     */
    public Converter(final Function < T, E > fromDto, final Function < E, T > fromEntity) {
        this.fromDto = fromDto;
        this.fromEntity = fromEntity;
    }

    /**
     *
     * @param dto DTO entity
     * @return
     * the result of the converting function application on dto entity.
     */
    public final E convertFromDto(final T dto) {
        return fromDto.apply(dto);
    }

    /**
     *
     * @param entity domain entity
     * @return
     * the result of the converting function application on domain entity.
     */
    public final T convertFromEntity(final E entity) {
        return fromEntity.apply(entity);
    }

    /**
     *
     * @param dto collection of DTO entities
     * @return
     * List of entities converted from collection of DTO entities
     */
    public final List< E > batchConverterFromDto(final Collection< T > dto) {
        System.out.println("We have converted all dto entities to entities");
        return dto.stream().map(this::convertFromDto).collect(Collectors.toList());
    }


    /**
     *
     * @param entities collection of entities
     * @return
     * List of DTO entities converted from collection of entities
     */
    public final List < T > batchConverterFromEntities(final Collection < E > entities) {
        System.out.println("We have converted all entities to dto entities");
        return entities.stream().map(this::convertFromEntity).collect(Collectors.toList());
    }


    @Override
    public String toString() {
        return "abstract class Converter";
    }
}
