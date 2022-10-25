package com.core.BluePrint.Business.Abstracts;

import com.core.BluePrint.Business.Behaviors.IBaseBusiness;

import java.util.List;
import java.util.UUID;

public abstract  class BaseBusiness<TDto,TEntity> implements IBaseBusiness<TDto,TEntity> {

    @Override
    public List<TDto> GetAll() {
         //TODO
        return null;
    }

    @Override
    public TDto Add(TDto entity) {
         //TODO
        return null;
    }

    @Override
    public TDto GetById(UUID id) {
         //TODO
        return null;
    }

    @Override
    public TDto Update(TDto entity) {
        //TODO
        return null;
    }

    @Override
    public void AddRange(List<TDto> entity) {
            //TODO
    }

    @Override
    public void Remove(TDto entity) {
                 //TODO
    }

    @Override
    public void RemoveRange(List<TDto> entity) {
         //TODO
    }
}
