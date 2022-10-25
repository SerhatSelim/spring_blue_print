package com.core.BluePrint.Persistence.Concretes;

import com.core.BluePrint.Persistence.Behaviors.IEntityRepository;

import java.util.List;
import java.util.UUID;

public class BaseEntityRepository<T>  implements IEntityRepository<T> {
    @Override
    public T GetById(UUID id) {
        return null;
    }

    @Override
    public List<T> GetAll() {
        return null;
    }

    @Override
    public T Add(T entity) {
        return null;
    }

    @Override
    public void AddRange(List<T> entity) {

    }

    @Override
    public T Update(T entity) {
        return null;
    }

    @Override
    public void Remove(T entity) {

    }

    @Override
    public void RemoveRange(List<T> entity) {

    }
}
