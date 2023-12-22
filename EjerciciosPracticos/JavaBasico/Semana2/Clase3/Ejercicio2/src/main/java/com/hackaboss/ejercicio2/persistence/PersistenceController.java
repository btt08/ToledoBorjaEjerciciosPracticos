package com.hackaboss.ejercicio2.persistence;

import com.hackaboss.ejercicio2.service.DishJpaController;
import com.hackaboss.ejercicio2.models.Dish;
import com.hackaboss.ejercicio2.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PersistenceController {

  DishJpaController dc = new DishJpaController();

  public void createDish(Dish dish){
    dc.create(dish);
  }
  
  public void deleteDish(Long id){
    try {
      dc.destroy(id);
    } catch (NonexistentEntityException ex) {
      ex.printStackTrace();
    }
  }
  
  public List<Dish> getAllDishes(){
    return dc.findDishEntities();
  }
  
  public void updateDish(Dish dish){
    try {
      dc.edit(dish);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
