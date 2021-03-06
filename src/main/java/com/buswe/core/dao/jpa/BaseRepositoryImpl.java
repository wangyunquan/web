package com.buswe.core.dao.jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;


public class BaseRepositoryImpl<T, ID extends Serializable>
  extends SimpleJpaRepository<T, ID>
  implements BaseRepository<T, ID>
{
  private EntityManager entityManager;
  private Class<T> domainClass;

  public BaseRepositoryImpl(JpaEntityInformation entityInformation,
                            EntityManager entityManager)
  {
    super(entityInformation, entityManager);
    this.entityManager = entityManager;
    this.domainClass = entityInformation.getJavaType();
  }

  
  public EntityManager getEntityManager()
  {
    return this.entityManager;
  }
  
  public Class<T> getDomainClass()
  {
    return this.domainClass;
  }
  
  public List<T> findList(Collection<String> columns)
  {
    CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
    CriteriaQuery<T> query = builder.createQuery(this.domainClass);
    Root<T> root = query.from(this.domainClass);
    List<Selection<?>> pathList = new ArrayList();
    for (String column : columns) {
      pathList.add(DaoUtils.toExpressionRecursively(root, column));
    }
    query.multiselect(pathList);
    return this.entityManager.createQuery(query).getResultList();
  }
  

  
}

 