package com.core.BluePrint.Business.Behaviors;

import java.util.List;
import java.util.UUID;

public interface IBaseBusiness<TDto,TEntity> {

    TDto GetById(UUID id);

    List<TDto> GetAll();

    TDto Add (TDto entity);

    void AddRange (List<TDto> entity);

    TDto Update (TDto entity);

    void Remove(TDto entity);

    void RemoveRange(List<TDto> entity);
}
