package com.CocOgreen.CenFra.MS.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

/**
 * @param <E> Entity
 * @param <D> DTO
 */
public interface GenericMapper<E, D> {// class này dùng để các interface mapper khác extends
    D toDto(E entity);

    E toEntity(D dto);

    List<D> toDtoList(List<E> entities);

    List<E> toEntityList(List<D> dtos);

    // Hàm này giúp update entity từ DTO mà không bị ghi đè null
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget E entity, D dto);
}