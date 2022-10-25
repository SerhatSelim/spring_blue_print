package com.core.BluePrint.Persistence.Behaviors;

import java.util.List;
import java.util.UUID;

public interface IEntityRepository<T>  {

    T GetById(UUID id);

    List<T> GetAll();

    T Add (T entity);

    void AddRange (List<T> entity);

    T Update (T entity);

    void Remove(T entity);

    void RemoveRange(List<T> entity);
}
