package com.core.BluePrint.Business.Abstracts;

import com.core.BluePrint.Business.Behaviors.IBaseBusiness;

import java.util.List;
import java.util.UUID;

public abstract  class BaseBusiness<TDto,TEntity> implements IBaseBusiness<TDto,TEntity> {

    @Override
    public List<TDto> GetAll() {
        return null;
    }

    @Override
    public TDto Add(TDto entity) {
        return null;
    }

    @Override
    public TDto GetById(UUID id) {
        return null;
    }

    @Override
    public TDto Update(TDto entity) {
        return null;
    }

    @Override
    public void AddRange(List<TDto> entity) {

    }

    @Override
    public void Remove(TDto entity) {

    }

    @Override
    public void RemoveRange(List<TDto> entity) {

    }
}
