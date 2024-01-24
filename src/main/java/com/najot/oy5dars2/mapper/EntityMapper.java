package com.najot.oy5dars2.mapper;

import java.util.List;

public interface EntityMapper<D, E> {

    D toDTO(E e);

    E toEntity(D d);

   List<D> toDTOs(List<E> es);

   List<E> toEntities(List<D> ds);


}
