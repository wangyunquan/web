package com.buswe.core.service;

import java.util.Collection;
import java.util.List;

import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.buswe.core.dao.jpa.BaseRepository;
import com.buswe.core.web.PropertyFilter;

 

public abstract interface BaseService<T>
  extends ApplicationEventPublisherAware
{
  public abstract BaseRepository<T, String> getDao();
  
  public abstract T save(T paramT);
  
  public abstract T get(String paramString);
  
  public abstract void delete(String paramString);
  
  public abstract List<T> findAll();
  
  public abstract List<T> findList(Collection<PropertyFilter> paramCollection);
  
  public abstract Page<T> findPage(Pageable paramPageable, Collection<PropertyFilter> paramCollection);
  
  public abstract Page<T> findPage(Pageable paramPageable, Collection<PropertyFilter> paramCollection, String... paramVarArgs);
}
