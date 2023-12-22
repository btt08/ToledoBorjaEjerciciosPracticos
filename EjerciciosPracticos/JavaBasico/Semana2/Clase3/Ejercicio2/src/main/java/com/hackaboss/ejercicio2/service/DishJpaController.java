package com.hackaboss.ejercicio2.service;

import com.hackaboss.ejercicio2.models.Dish;
import com.hackaboss.ejercicio2.persistence.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.List;

public class DishJpaController {

  public DishJpaController() {
    emf = Persistence.createEntityManagerFactory("RestaurantJPAPU");
  }

  public DishJpaController(EntityManagerFactory emf) {
    this.emf = emf;
  }
  private EntityManagerFactory emf = null;

  public EntityManager getEntityManager() {
    return emf.createEntityManager();
  }

  public void create(Dish dish) {
    EntityManager em = null;
    try {
      em = getEntityManager();
      em.getTransaction().begin();
      em.persist(dish);
      em.getTransaction().commit();
    } finally {
      if (em != null) {
        em.close();
      }
    }
  }

  public void edit(Dish dish) throws NonexistentEntityException, Exception {
    EntityManager em = null;
    try {
      em = getEntityManager();
      em.getTransaction().begin();
      dish = em.merge(dish);
      em.getTransaction().commit();
    } catch (Exception ex) {
      String msg = ex.getLocalizedMessage();
      if (msg == null || msg.length() == 0) {
        Long id = dish.getId();
        if (findDish(id) == null) {
          throw new NonexistentEntityException("The dish with id " + id + " no longer exists.");
        }
      }
      throw ex;
    } finally {
      if (em != null) {
        em.close();
      }
    }
  }

  public void destroy(Long id) throws NonexistentEntityException {
    EntityManager em = null;
    try {
      em = getEntityManager();
      em.getTransaction().begin();
      Dish dish;
      try {
        dish = em.getReference(Dish.class, id);
        dish.getId();
      } catch (EntityNotFoundException enfe) {
        throw new NonexistentEntityException("The dish with id " + id + " no longer exists.", enfe);
      }
      em.remove(dish);
      em.getTransaction().commit();
    } finally {
      if (em != null) {
        em.close();
      }
    }
  }

  public List<Dish> findDishEntities() {
    return findDishEntities(true, -1, -1);
  }

  public List<Dish> findDishEntities(int maxResults, int firstResult) {
    return findDishEntities(false, maxResults, firstResult);
  }

  private List<Dish> findDishEntities(boolean all, int maxResults, int firstResult) {
    EntityManager em = getEntityManager();
    try {
      CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
      cq.select(cq.from(Dish.class));
      Query q = em.createQuery(cq);
      if (!all) {
        q.setMaxResults(maxResults);
        q.setFirstResult(firstResult);
      }
      return q.getResultList();
    } finally {
      em.close();
    }
  }

  public Dish findDish(Long id) {
    EntityManager em = getEntityManager();
    try {
      return em.find(Dish.class, id);
    } finally {
      em.close();
    }
  }

  public int getDishCount() {
    EntityManager em = getEntityManager();
    try {
      CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
      Root<Dish> rt = cq.from(Dish.class);
      cq.select(em.getCriteriaBuilder().count(rt));
      Query q = em.createQuery(cq);
      return ((Long) q.getSingleResult()).intValue();
    } finally {
      em.close();
    }
  }

}
